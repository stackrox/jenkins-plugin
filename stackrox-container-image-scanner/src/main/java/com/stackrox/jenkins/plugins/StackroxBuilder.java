package com.stackrox.jenkins.plugins;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import javax.annotation.Nonnull;
import javax.json.JsonObject;

import com.google.common.base.CharMatcher;
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
import jenkins.model.Jenkins;
import jenkins.tasks.SimpleBuildStep;
import net.sf.json.JSONObject;
import org.apache.commons.validator.routines.RegexValidator;
import org.apache.commons.validator.routines.UrlValidator;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;
import org.kohsuke.stapler.QueryParameter;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.verb.POST;

import com.stackrox.jenkins.plugins.data.CVE;
import com.stackrox.jenkins.plugins.data.ImageCheckResults;
import com.stackrox.jenkins.plugins.data.ViolatedPolicy;
import com.stackrox.jenkins.plugins.jenkins.RunConfig;
import com.stackrox.jenkins.plugins.jenkins.ViewStackroxResultsAction;
import com.stackrox.jenkins.plugins.report.ReportGenerator;
import com.stackrox.jenkins.plugins.services.DetectionService;
import com.stackrox.jenkins.plugins.services.HttpClientUtils;
import com.stackrox.jenkins.plugins.services.ImageService;

@SuppressWarnings("unused")
public class StackroxBuilder extends Builder implements SimpleBuildStep {
    private String portalAddress;
    private Secret apiToken = Secret.fromString("");
    private boolean failOnPolicyEvalFailure;
    private boolean failOnCriticalPluginError;
    private boolean enableTLSVerification;
    private String caCertPEM;

    private RunConfig runConfig;

    @DataBoundConstructor
    public StackroxBuilder() {
    }

    //region Getters

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

    //endregion

    //TODO: Add console log for the plugin
    @Override
    public void perform(
            @Nonnull Run<?, ?> run,
            @Nonnull FilePath workspace,
            @Nonnull Launcher launcher,
            @Nonnull TaskListener listener) throws IOException, InterruptedException {

        runConfig = new RunConfig(run, workspace, listener);

        try {
            List<ImageCheckResults> results = checkImages();
            ReportGenerator.generateBuildReport(results, runConfig.getReportsDir());
            prepareArtifacts(run, workspace, launcher, listener);
            run.addAction(new ViewStackroxResultsAction(results, run));
            cleanupJenkinsWorkspace();

            if (enforcedPolicyViolationExists(results)) {
                throw new PolicyEvalException(
                        "At least one image violated at least one enforced system policy. Marking StackRox Image Security plugin build step failed. Check the report for additional details.");
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
        }

        runConfig.getLog().println("No system policy violations found. Marking StackRox Image Security plugin build step as successful.");
    }

    private void prepareArtifacts(Run<?, ?> run, FilePath workspace, Launcher launcher, TaskListener listener) throws IOException, InterruptedException {
        ArtifactArchiver artifactArchiver = new ArtifactArchiver(runConfig.getArtifacts());
        artifactArchiver.setAllowEmptyArchive(true);
        artifactArchiver.perform(run, workspace, launcher, listener);
    }

    private List<ImageCheckResults> checkImages() throws IOException {
        List<ImageCheckResults> results = Lists.newArrayList();

        try (CloseableHttpClient httpClient = HttpClientUtils.get(this.enableTLSVerification, this.caCertPEM)) {
            ImageService imageService = new ImageService(getPortalAddress(), getApiToken(), httpClient);
            DetectionService detectionService = new DetectionService(getPortalAddress(), getApiToken(), httpClient);

            for (String name : runConfig.getImageNames()) {
                runConfig.getLog().printf("Checking image %s...%n", name);

                List<CVE> cves = imageService.getImageScanResults(name);
                List<ViolatedPolicy> violatedPolicies = detectionService.getPolicyViolations(name);
                results.add(new ImageCheckResults(name, cves, violatedPolicies));
            }
        }

        results.sort((result1, result2) -> {
            //descending order
            return Boolean.compare(result1.isImageCheckStatusPass(), result2.isImageCheckStatusPass());
        });
        return results;
    }

    // Runs an image scan and the build time policy checks on the image

    private boolean enforcedPolicyViolationExists(List<ImageCheckResults> results) {
        for (ImageCheckResults result : results) {
            if (!result.getViolatedPolicies().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void cleanupJenkinsWorkspace() {
        runConfig.getLog().println("Cleaning up the workspace ...");

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

        @Nonnull
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
            HttpGet authStatusRequest = new HttpGet(Joiner.on("/").join(portalAddress, "v1/auth/status"));
            authStatusRequest.addHeader("Accept", "application/json");
            authStatusRequest.addHeader("Authorization", Joiner.on(" ").join("Bearer", apiToken));

            try (CloseableHttpClient httpClient = HttpClientUtils.get(tlsVerify, caCertPEM);
                 CloseableHttpResponse response = httpClient.execute(authStatusRequest)) {

                int statusCode = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (statusCode != HttpURLConnection.HTTP_OK || entity == null) {
                    return false;
                }

                JsonObject object = HttpClientUtils.getJsonObject(entity);
                return !Strings.isNullOrEmpty(object.getString("userId"));
            }
        }
    }
}
