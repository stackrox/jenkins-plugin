package com.stackrox.jenkins.plugins;

import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import hudson.AbortException;
import hudson.Extension;
import hudson.FilePath;
import hudson.Launcher;
import hudson.model.AbstractProject;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.ArtifactArchiver;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import hudson.util.FormValidation;
import hudson.util.Secret;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
import jenkins.tasks.SimpleBuildStep;
import net.sf.json.JSONObject;
import org.apache.commons.validator.routines.UrlValidator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;
import org.kohsuke.stapler.QueryParameter;
import org.kohsuke.stapler.StaplerRequest;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class StackroxBuilder extends Builder implements SimpleBuildStep {

    private static final boolean DEFAULT_FAIL_ON_POLICY_EVAL_FAILURE = true;
    private static final boolean DEFAULT_FAIL_ON_CRITICAL_PLUGIN_ERROR = true;
    private static final boolean DEFAULT_ENABLE_TLS_VERIFICATION = true;

    private String portalAddress;
    private Secret apiToken = Secret.fromString("");
    private boolean failOnPolicyEvalFailure = DEFAULT_FAIL_ON_POLICY_EVAL_FAILURE;
    private boolean failOnCriticalPluginError = DEFAULT_FAIL_ON_CRITICAL_PLUGIN_ERROR;
    private boolean enableTLSVerification = DEFAULT_ENABLE_TLS_VERIFICATION;
    private String caCertPEM;

    private CloseableHttpClient httpClient;
    private RunConfig runConfig;
    private List<ImageCheckResults> results;

    @DataBoundConstructor
    public StackroxBuilder(OptionalTLSConfig tlsConfig) {
        this.caCertPEM = (tlsConfig != null) ? tlsConfig.caCertPEM : null;
        this.enableTLSVerification = tlsConfig != null;
    }

    public String getPortalAddress() {
        return this.portalAddress;
    }

    @DataBoundSetter
    public void setPortalAddress(String portalAddress) {
        this.portalAddress = CharMatcher.is('/').trimTrailingFrom(portalAddress);
    }

    public Secret getApiToken() {
        return this.apiToken;
    }

    @DataBoundSetter
    public void setApiToken(String apiToken) {
        this.apiToken = Secret.fromString(apiToken);
    }

    public boolean isFailOnPolicyEvalFailure() {
        return this.failOnPolicyEvalFailure;
    }

    @DataBoundSetter
    public void setFailOnPolicyEvalFailure(boolean failOnPolicyEvalFailure) {
        this.failOnPolicyEvalFailure = failOnPolicyEvalFailure;
    }

    public boolean isFailOnCriticalPluginError() {
        return this.failOnCriticalPluginError;
    }

    @DataBoundSetter
    public void setFailOnCriticalPluginError(boolean failOnCriticalPluginError) {
        this.failOnCriticalPluginError = failOnCriticalPluginError;
    }

    public boolean isEnableTLSVerification() {
        return this.enableTLSVerification;
    }

    public String getCaCertPEM() {
        return caCertPEM;
    }

    //TODO: Add console log for the plugin
    @Override
    public void perform(Run<?, ?> run, FilePath workspace, Launcher launcher, TaskListener listener) throws IOException, InterruptedException {
        //TODO: Process pass/fail build step while handling exceptions
        runConfig = new RunConfig(run, workspace, launcher, listener);
        ArtifactArchiver artifactArchiver = new ArtifactArchiver(runConfig.getArtifacts());

        try {
            //TODO: pass enable tls
            httpClient = HttpClientUtils.Get();
        } catch (Exception e) {
            throw new AbortException(String.format("Fatal error creating client: %s. Aborting ...", e.getMessage()));
        }
        results = Lists.newArrayList();

        for (String name : runConfig.getImageNames()) {
            processImage(name);
        }

        generateBuildReport();

        artifactArchiver.perform(run, workspace, launcher, listener);
        run.addAction(new ViewStackroxResultsAction(results, run));

        cleanupJenkinsWorkspace();

        if (httpClient != null) {
            httpClient.close();
        }
    }

    // Runs an image scan and the build time policy checks on the image
    private void processImage(String imageName) {
        runConfig.getLog().println(String.format("Checking image %s...", imageName));

        try {
            List<CVE> cves = getImageScanResults(imageName);
            List<ViolatedPolicy> violatedPolicies = getPolicyViolations(imageName);
            results.add(new ImageCheckResults(imageName, cves, violatedPolicies));
        } catch (IOException e) {
            runConfig.getLog().println(String.format("Error processing image %s: %s", imageName, e.getMessage()));
        }
    }

    private List<ViolatedPolicy> getPolicyViolations(String imageName) throws IOException {
        List<ViolatedPolicy> violatedPolicies = Lists.newArrayList();

        JsonObject detectionResult = runBuildTimeDetection(imageName);
        JsonArray alerts = detectionResult.getJsonArray("alerts");

        for (JsonObject alert : alerts.getValuesAs(JsonObject.class)) {
            JsonObject policy = alert.getJsonObject("policy");

            boolean isEnforced = false;
            JsonArray actions = policy.getJsonArray("enforcementActions");
            for (JsonValue action : actions) {
                if (action.toString().equals(ViolatedPolicy.BUILD_TIME_ENFORCEMENT)) {
                    isEnforced = true;
                    break;
                }
            }
            violatedPolicies.add(new ViolatedPolicy(
                    policy.getString("name"),
                    policy.getString("description"),
                    policy.getString("severity"),
                    isEnforced));
        }

        return violatedPolicies;
    }

    private JsonObject runBuildTimeDetection(String imageName) throws IOException {
        CloseableHttpResponse response = null;
        HttpPost detectionRequest = null;

        try {
            detectionRequest = new HttpPost(Joiner.on("/").join(portalAddress, "v1/detect/build"));
            detectionRequest.setHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.toString());
            detectionRequest.setHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
            detectionRequest.addHeader(HttpHeaders.AUTHORIZATION, Joiner.on(" ").join("Bearer", apiToken));
            detectionRequest.setEntity(new StringEntity(
                    Json.createObjectBuilder().add("imageName", imageName).build().toString(),
                    Charsets.UTF_8));

            response = this.httpClient.execute(detectionRequest);
            int statusCode = response.getStatusLine().getStatusCode();

            HttpEntity entity = response.getEntity();

            if (statusCode != HttpURLConnection.HTTP_OK || entity == null) {
                throw new IOException(String.format("Failed build time detection request. Status code: %d. Error: %s",
                        entity.toString(), String.valueOf(entity)));
            }
            JsonReader reader = Json.createReader(new InputStreamReader(entity.getContent()));
            JsonObject object = reader.readObject();
            EntityUtils.consume(entity);

            return object;
        } finally {
            if (detectionRequest != null) {
                detectionRequest.releaseConnection();
            }
            if (response != null) {
                response.close();
            }
        }
    }

    private List<CVE> getImageScanResults(String imageName) throws IOException {
        List<CVE> cves = Lists.newArrayList();

        JsonObject scanResult = runImageScan(imageName);

        JsonArray components = scanResult.getJsonArray("components");
        for (JsonObject component : components.getValuesAs(JsonObject.class)) {
            JsonArray componentCves = component.getJsonArray("vulns");
            for (JsonObject cve : componentCves.getValuesAs(JsonObject.class)) {
                CVE cveToAdd = CVE.Builder.newInstance()
                        .withId(cve.getString("cve"))
                        .withCvssScore((float) cve.getJsonNumber("cvss").doubleValue())
                        .withScoreType(cve.getString("scoreVersion"))
                        .withPublishDate(cve.getString("publishedOn"))
                        .withLink(cve.getString("link"))
                        .inPackage(component.getString("name"))
                        .inVersion(component.getString("version"))
                        .build();
                cves.add(cveToAdd);
            }
        }

        return cves;
    }

    private JsonObject runImageScan(String imageName) throws IOException {
        CloseableHttpResponse response = null;
        HttpPost imageScanRequest = null;

        try {
            imageScanRequest = new HttpPost(Joiner.on("/").join(portalAddress, "v1/images/scan"));
            imageScanRequest.setHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.toString());
            imageScanRequest.setHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
            imageScanRequest.addHeader(HttpHeaders.AUTHORIZATION, Joiner.on(" ").join("Bearer", apiToken));
            imageScanRequest.setEntity(new StringEntity(
                    Json.createObjectBuilder().add("imageName", imageName).add("force", true).build().toString(),
                    Charsets.UTF_8));

            response = httpClient.execute(imageScanRequest);
            int statusCode = response.getStatusLine().getStatusCode();

            HttpEntity entity = response.getEntity();

            if (statusCode != HttpURLConnection.HTTP_OK || entity == null) {
                throw new IOException(String.format("Failed image scan request. Status code: %d. Error: %s", statusCode, String.valueOf(entity)));
            }

            JsonReader reader = Json.createReader(new InputStreamReader(entity.getContent()));
            JsonObject object = reader.readObject();
            EntityUtils.consume(entity);
            return object.getJsonObject("scan");
        } finally {
            if (imageScanRequest != null) {
                imageScanRequest.releaseConnection();
            }
            if (response != null) {
                response.close();
            }
        }
    }

    private void generateBuildReport() throws AbortException {
        PrintStream log = runConfig.getLog();
        log.println("Generating report...");

        try {
            for (ImageCheckResults result : results) {
                FilePath imageResultDir = new FilePath(this.runConfig.getReportsDir(), CharMatcher.is(':').replaceFrom(result.getImageName(), '.'));
                imageResultDir.mkdirs();
                FilePath imageCveCsv = new FilePath(imageResultDir, "cves.csv");
                FilePath policyViolationsCsv = new FilePath(imageResultDir, "policyViolations.csv");

                if (!result.getCves().isEmpty()) {
                    try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(imageCveCsv.write(), StandardCharsets.UTF_8))) {
                        bw.write("CVE ID, CVSS Score, Package Name, Package Version, Fixable\n");
                        for (CVE cve : result.getCves()) {
                            bw.write(String.format("%s, %s, %s, %s, %b\n", cve.getId(), cve.getCvssScore(), cve.getPackageName(), cve.getPackageVersion(), cve.isFixable()));
                        }
                    }
                }

                if (!result.getViolatedPolicies().isEmpty()) {
                    try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(policyViolationsCsv.write(), StandardCharsets.UTF_8))) {
                        bw.write("Policy Name, Severity, Enforced\n");
                        for (ViolatedPolicy policy : result.getViolatedPolicies()) {
                            bw.write(String.format("%s, %s, %b\n", policy.getName(), policy.getSeverity(), policy.isEnforced()));
                        }
                    }
                }
            }
        } catch (IOException | InterruptedException e) {
            throw new AbortException(String.format("Failed to write image scan results. Error: %s", e.getMessage()));
        }
    }

    private void cleanupJenkinsWorkspace() {
        runConfig.getLog().println(String.format("Cleaning up the workspace ..."));

        try {
            File toDelete = new File(runConfig.getImagesToScanFilePath().toURI());
            Files.deleteIfExists(toDelete.toPath());

            runConfig.getReportsDir().deleteRecursive();

        } catch (Exception e) {
            runConfig.getLog().println("WARN: Failed to cleanup.");
        }
    }

    @Override
    public DescriptorImpl getDescriptor() {
        return (DescriptorImpl) super.getDescriptor();
    }

    public static class OptionalTLSConfig {
        private String caCertPEM;

        @DataBoundConstructor
        public OptionalTLSConfig(String caCertPEM) {
            this.caCertPEM = caCertPEM;
        }
    }

    @Extension
    public static final class DescriptorImpl extends BuildStepDescriptor<Builder> {

        public DescriptorImpl() {
            load();
        }

        @Override
        public boolean isApplicable(Class<? extends AbstractProject> aClass) {
            return true;
        }

        @Override
        public String getDisplayName() {
            return Messages.StackroxBuilder_DescriptorImpl_DisplayName();
        }

        @Override
        public boolean configure(StaplerRequest req, JSONObject formData) throws FormException {
            req.bindJSON(this, formData);
            save();
            return super.configure(req, formData);
        }

        @SuppressWarnings("unused")
        public FormValidation doCheckPortalAddress(@QueryParameter final String portalAddress) {
            String[] schemes = {"https"};
            // TODO: remove allow local urls
            UrlValidator urlValidator = new UrlValidator(schemes, UrlValidator.ALLOW_LOCAL_URLS);
            if (!Strings.isNullOrEmpty(portalAddress) && urlValidator.isValid(portalAddress)) {
                return FormValidation.ok();
            } else {
                return FormValidation.error(Messages.StackroxBuilder_InvalidPortalAddressError());
            }
        }

        @SuppressWarnings("unused")
        public FormValidation doCheckApiToken(@QueryParameter final String apiToken) {
            if (!Strings.isNullOrEmpty(apiToken)) {
                return FormValidation.ok();
            } else {
                return FormValidation.error(Messages.StackroxBuilder_EmptyAPITokenError());
            }
        }

        @SuppressWarnings("unused")
        public FormValidation doTestConnection(@QueryParameter("portalAddress") final String portalAddress, @QueryParameter("apiToken") final String apiToken) {
            try {
                if (checkRoxAuthStatus(portalAddress, apiToken)) {
                    return FormValidation.ok("Success");
                }
                return FormValidation.error(Messages.StackroxBuilder_TestConnectionError());

            } catch (IOException e) {
                return FormValidation.error(Messages.StackroxBuilder_TestConnectionError());

            }
        }

        private boolean checkRoxAuthStatus(final String portalAddress, final String apiToken) throws IOException {
            // Cannot use the cached HttpClient here since this is before the perform step.
            CloseableHttpClient httpClient = null;
            CloseableHttpResponse response = null;
            HttpGet authStatusRequest = null;

            try {
                try {
                    //TODO: pass enable tls
                    httpClient = HttpClientUtils.Get();
                } catch (Exception e) {
                    return false;
                }

                authStatusRequest = new HttpGet(Joiner.on("/").join(portalAddress, "v1/auth/status"));
                authStatusRequest.addHeader("Accept", "application/json");
                authStatusRequest.addHeader("Authorization", Joiner.on(" ").join("Bearer", apiToken));

                response = httpClient.execute(authStatusRequest);

                int statusCode = response.getStatusLine().getStatusCode();

                HttpEntity entity = response.getEntity();

                if (statusCode != HttpURLConnection.HTTP_OK || entity == null) {
                    return false;
                }

                JsonReader reader = Json.createReader(new InputStreamReader(entity.getContent()));
                JsonObject object = reader.readObject();
                EntityUtils.consume(entity);

                return !Strings.isNullOrEmpty(object.getString("userId"));
            } finally {
                if (authStatusRequest != null) {
                    authStatusRequest.releaseConnection();
                }
                if (response != null) {
                    response.close();
                }
                if (httpClient != null) {
                    httpClient.close();
                }
            }
        }
    }
}
