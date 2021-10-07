package com.stackrox.jenkins.plugins;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.stackrox.jenkins.plugins.data.CVE;
import com.stackrox.jenkins.plugins.data.ImageCheckResults;
import com.stackrox.jenkins.plugins.data.ViolatedPolicy;
import com.stackrox.jenkins.plugins.jenkins.RunConfig;
import com.stackrox.jenkins.plugins.jenkins.ViewStackroxResultsAction;
import com.stackrox.jenkins.plugins.report.ReportGenerator;
import com.stackrox.jenkins.plugins.services.DetectionService;
import com.stackrox.jenkins.plugins.services.HttpClientUtils;
import com.stackrox.jenkins.plugins.services.ImageService;
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
import jenkins.model.Jenkins;
import jenkins.tasks.SimpleBuildStep;
import net.sf.json.JSONObject;
import org.apache.commons.validator.routines.RegexValidator;
import org.apache.commons.validator.routines.UrlValidator;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;
import org.kohsuke.stapler.QueryParameter;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.verb.POST;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("unused")
public class StackroxBuilder extends Builder implements SimpleBuildStep {
    private static final String NOT_AVAILABLE = "-";
    private String portalAddress;
    private Secret apiToken = Secret.fromString("");
    private boolean failOnPolicyEvalFailure;
    private boolean failOnCriticalPluginError;
    private boolean enableTLSVerification;
    private String caCertPEM;

    private CloseableHttpClient httpClient;
    private RunConfig runConfig;
    private List<ImageCheckResults> results;

    private ImageService imageService;
    private DetectionService detectionService;

    @DataBoundConstructor
    public StackroxBuilder() {
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
        return enableTLSVerification;
    }

    @DataBoundSetter
    public void setEnableTLSVerification(boolean enableTLSVerification) {
        this.enableTLSVerification = enableTLSVerification;
    }

    public String getCaCertPEM() {
        return caCertPEM;
    }

    @DataBoundSetter
    public void setCaCertPEM(String caCertPEM) {
        this.caCertPEM = caCertPEM;
    }

    //TODO: Add console log for the plugin
    @Override
    public void perform(Run<?, ?> run, FilePath workspace, Launcher launcher, TaskListener listener) throws IOException, InterruptedException {
        runConfig = new RunConfig(run, workspace, launcher, listener);

        httpClient = HttpClientUtils.get(this.enableTLSVerification, this.caCertPEM);
        imageService = new ImageService(getPortalAddress(), getApiToken(), httpClient);
        detectionService = new DetectionService(getPortalAddress(), getApiToken(), httpClient);

        try {
            checkImages();

            ArtifactArchiver artifactArchiver = new ArtifactArchiver(runConfig.getArtifacts());
            artifactArchiver.setAllowEmptyArchive(true);
            artifactArchiver.perform(run, workspace, launcher, listener);

            run.addAction(new ViewStackroxResultsAction(results, run));

            cleanupJenkinsWorkspace();

            if (enforcedPolicyViolationExists()) {
                throw new PolicyEvalException(
                        "At least one image violated at least one enforced system policy. Marking StackRox Image Security plugin build step failed. Check the report for additional details.");
            } else {
                runConfig.getLog().println("No system policy violations found. Marking StackRox Image Security plugin build step as successful.");
            }
        } catch (IOException e) {
            if (this.failOnCriticalPluginError) {
                throw new AbortException(String.format("Fatal error: %s. Aborting ...", e.getMessage()));
            }
            runConfig.getLog().println("Marking StackRox Image Security plugin build step as successful despite error.");

        } catch (PolicyEvalException e) {
            if (this.failOnPolicyEvalFailure) {
                throw new AbortException(e.getMessage());
            }
            runConfig.getLog().println("Marking StackRox Image Security plugin build step as successful despite enforced policy violations.");
        } finally {
            if (httpClient != null) {
                httpClient.close();
            }

        }
    }

    private void checkImages() throws IOException {
        results = Lists.newArrayList();

        for (String name : runConfig.getImageNames()) {
            processImage(name);
        }

        Collections.sort(results, new Comparator<ImageCheckResults>() {
            @Override
            public int compare(ImageCheckResults result1, ImageCheckResults result2) {
                //descending order
                return Boolean.compare(result1.isImageCheckStatusPass(), result2.isImageCheckStatusPass());
            }
        });

        ReportGenerator.generateBuildReport(results, runConfig.getReportsDir());
    }

    // Runs an image scan and the build time policy checks on the image
    private void processImage(String imageName) throws IOException {
        runConfig.getLog().println(String.format("Checking image %s...", imageName));

        try {
            List<CVE> cves = imageService.getImageScanResults(imageName);
            List<ViolatedPolicy> violatedPolicies = detectionService.getPolicyViolations(imageName);
            results.add(new ImageCheckResults(imageName, cves, violatedPolicies));
        } catch (IOException e) {
            runConfig.getLog().println(String.format("Error processing image %s: %s", imageName, e.getMessage()));
            throw e;
        }
    }

    private boolean enforcedPolicyViolationExists() {
        for (ImageCheckResults result : results) {
            if (!result.getViolatedPolicies().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void cleanupJenkinsWorkspace() {
        runConfig.getLog().println(String.format("Cleaning up the workspace ..."));

        try {
            runConfig.getImagesToScanFilePath().delete();

            runConfig.getBaseWorkDir().deleteRecursive();
        } catch (IOException | InterruptedException e) {
            runConfig.getLog().println("WARN: Failed to cleanup.");
        }
    }

    @Override
    public DescriptorImpl getDescriptor() {
        return (DescriptorImpl) super.getDescriptor();
    }

    @Symbol("stackrox")
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
            Jenkins.get().checkPermission(Jenkins.ADMINISTER);
            String[] schemes = {"https"};
            UrlValidator urlValidator = new UrlValidator(schemes, UrlValidator.ALLOW_LOCAL_URLS);
            if (!Strings.isNullOrEmpty(portalAddress) && urlValidator.isValid(portalAddress)) {
                return FormValidation.ok();
            } else {
                // To allow non standard TLDs
                UrlValidator regexUrlValidator = new UrlValidator(schemes, new RegexValidator("^([\\\\p{Alnum}\\\\-\\\\.]*)(:\\\\d*)?(.*)?"), UrlValidator.ALLOW_LOCAL_URLS);
                if (regexUrlValidator.isValid(portalAddress)) {
                    return FormValidation.ok();
                }
                return FormValidation.error(Messages.StackroxBuilder_InvalidPortalAddressError());
            }
        }

        @SuppressWarnings("unused")
        public FormValidation doCheckApiToken(@QueryParameter final String apiToken) {
            Jenkins.get().checkPermission(Jenkins.ADMINISTER);
            if (!Strings.isNullOrEmpty(apiToken)) {
                return FormValidation.ok();
            } else {
                return FormValidation.error(Messages.StackroxBuilder_EmptyAPITokenError());
            }
        }

        @SuppressWarnings("unused")
        @POST
        public FormValidation doTestConnection(@QueryParameter("portalAddress") final String portalAddress, @QueryParameter("apiToken") final String apiToken,
                                               @QueryParameter("enableTLSVerification") final boolean tlsVerify, @QueryParameter("caCertPEM") final String caCertPEM) {
            Jenkins.get().checkPermission(Jenkins.ADMINISTER);
            try {
                if (checkRoxAuthStatus(portalAddress, apiToken, tlsVerify, caCertPEM)) {
                    return FormValidation.ok("Success");
                }
                return FormValidation.error(Messages.StackroxBuilder_TestConnectionError());

            } catch (Exception e) {
                return FormValidation.error(Messages.StackroxBuilder_TestConnectionError());

            }
        }

        private boolean checkRoxAuthStatus(final String portalAddress, final String apiToken, final boolean tlsVerify, final String caCertPEM) throws Exception {
            // Cannot use the cached HttpClient here since this is before the perform step.
            CloseableHttpClient httpClient = null;
            CloseableHttpResponse response = null;
            HttpGet authStatusRequest = null;

            try {
                httpClient = HttpClientUtils.get(tlsVerify, caCertPEM);
                authStatusRequest = new HttpGet(Joiner.on("/").join(portalAddress, "v1/auth/status"));
                authStatusRequest.addHeader("Accept", "application/json");
                authStatusRequest.addHeader("Authorization", Joiner.on(" ").join("Bearer", apiToken));

                response = httpClient.execute(authStatusRequest);

                int statusCode = response.getStatusLine().getStatusCode();

                HttpEntity entity = response.getEntity();

                if (statusCode != HttpURLConnection.HTTP_OK || entity == null) {
                    return false;
                }

                JsonReader reader = Json.createReader(new InputStreamReader(entity.getContent(), StandardCharsets.UTF_8));
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
