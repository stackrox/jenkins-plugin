package com.stackrox.jenkins.plugins;

import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import hudson.Extension;
import hudson.FilePath;
import hudson.Launcher;
import hudson.model.AbstractProject;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import hudson.util.FormValidation;
import hudson.util.Secret;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import jenkins.tasks.SimpleBuildStep;
import net.sf.json.JSONObject;
import org.apache.commons.validator.routines.UrlValidator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.HttpClient;
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
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
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

    @DataBoundSetter
    public void setPortalAddress(String portalAddress) {
        this.portalAddress = CharMatcher.is('/').trimTrailingFrom(portalAddress);
    }

    @DataBoundSetter
    public void setApiToken(String apiToken) {
        this.apiToken = Secret.fromString(apiToken);
    }

    @DataBoundSetter
    public void setFailOnPolicyEvalFailure(boolean failOnPolicyEvalFailure) {
        this.failOnPolicyEvalFailure = failOnPolicyEvalFailure;
    }

    @DataBoundSetter
    public void setFailOnCriticalPluginError(boolean failOnCriticalPluginError) {
        this.failOnCriticalPluginError = failOnCriticalPluginError;
    }

    public String getPortalAddress() {
        return this.portalAddress;
    }

    public Secret getApiToken() {
        return this.apiToken;
    }

    public boolean isFailOnPolicyEvalFailure() {
        return this.failOnPolicyEvalFailure;
    }

    public boolean isFailOnCriticalPluginError() {
        return this.failOnCriticalPluginError;
    }

    public boolean isEnableTLSVerification() {
        return this.enableTLSVerification;
    }

    public String getCaCertPEM() {
        return caCertPEM;
    }

    public static class OptionalTLSConfig {
        private String caCertPEM;

        @DataBoundConstructor
        public OptionalTLSConfig(String caCertPEM) {
            this.caCertPEM = caCertPEM;
        }

    }

    @DataBoundConstructor
    public StackroxBuilder(OptionalTLSConfig tlsConfig) {
        this.caCertPEM = (tlsConfig != null) ? tlsConfig.caCertPEM : null;
        this.enableTLSVerification = (tlsConfig != null) ? true : false;
    }

    //TODO: Add console log for the plugin
    @Override
    public void perform(Run<?, ?> run, FilePath workspace, Launcher launcher, TaskListener listener) throws InterruptedException, IOException {
    //TODO: Process pass/fail build step while handling exceptions
        runConfig = new RunConfig(run, workspace, launcher, listener);
        try {
            //TODO: pass enable tls
            httpClient = HttpClientUtils.Get();
        } catch (Exception e) {
            throw new IOException(String.format("Error creating client, exiting..."));
        }
        results = Lists.newArrayList();

        for (String name: runConfig.getImageNames()) {
            processImage(name);
        }

        generateReport();

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

        for (int i = 0; i < alerts.size(); i++) {
            JsonObject policy = alerts.getJsonObject(i).getJsonObject("policy");
            violatedPolicies.add(new ViolatedPolicy(
                     policy.getString("name"),
                     policy.getString("description"),
                     policy.getInt("severity"),
                     policy.getJsonArray("enforcementActions").contains(ViolatedPolicy.BUILD_TIME_ENFORCEMENT) ? true : false));
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
                throw new IOException(String.format("Build time policy evaluation with status code: %d", statusCode));
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
        for (int i = 0; i < components.size(); i++) {
            JsonObject component = components.getJsonObject(i);
            JsonArray componentCves = component.getJsonArray("vulns");
            for (int cveIndex = 0; cveIndex < componentCves.size(); cveIndex++) {
                JsonObject cve = componentCves.getJsonObject(cveIndex);

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
                throw new IOException(String.format("Image scan request failed with status code: %d", statusCode));
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

    private void generateReport() {
        runConfig.getLog().println(String.format("Generating report..."));
        PrintStream log = runConfig.getLog();

        //TODO: Generate report
        for (ImageCheckResults result : results) {
            log.println(String.format("************ %s *************", result.getImageName()));
            log.println("CVE Report");
            for (CVE cve : result.getCves()) {
                log.println(String.format("CVE: %s, %s, %s, %s, %b", cve.getId(), cve.getCvssScore(), cve.getPackageName(), cve.getPackageVersion(), cve.isFixable()));
            }
            log.println("Violated Policies");
            for (ViolatedPolicy policy : result.getViolatedPolicies()) {
                log.println(String.format("Violated policy: %s, %s, %b", policy.getName(), policy.getSeverity(), policy.isEnforced()));
            }
        }
    }

    private void cleanupJenkinsWorkspace() {
        runConfig.getLog().println(String.format("Cleaning up ..."));

        try {
            File toDelete = new File(runConfig.getImagesToScanFilePath().toURI());
            Files.deleteIfExists(toDelete.toPath());

        } catch (Exception e) {
            runConfig.getLog().println("WARN: Failed to cleanup.");
        }
    }

    @Override
    public DescriptorImpl getDescriptor() {
        return (DescriptorImpl) super.getDescriptor();
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
                return Strings.isNullOrEmpty(object.getString("userId")) ? false : true;

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
