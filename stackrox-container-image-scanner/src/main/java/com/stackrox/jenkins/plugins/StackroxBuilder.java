package com.stackrox.jenkins.plugins;

import static com.stackrox.jenkins.plugins.services.ApiClientFactory.StackRoxTlsValidationMode.INSECURE_ACCEPT_ANY;
import static com.stackrox.jenkins.plugins.services.ApiClientFactory.StackRoxTlsValidationMode.VALIDATE;

import java.io.IOException;
import java.util.List;
import javax.annotation.Nonnull;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
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
import lombok.Getter;
import lombok.Setter;
import net.sf.json.JSONObject;
import org.apache.commons.validator.routines.RegexValidator;
import org.apache.commons.validator.routines.UrlValidator;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;
import org.kohsuke.stapler.QueryParameter;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.verb.POST;

import com.stackrox.api.AuthServiceApi;
import com.stackrox.invoker.ApiClient;
import com.stackrox.invoker.ApiException;
import com.stackrox.jenkins.plugins.data.CVE;
import com.stackrox.jenkins.plugins.data.ImageCheckResults;
import com.stackrox.jenkins.plugins.data.PolicyViolation;
import com.stackrox.jenkins.plugins.jenkins.RunConfig;
import com.stackrox.jenkins.plugins.report.ReportGenerator;
import com.stackrox.jenkins.plugins.services.ApiClientFactory;
import com.stackrox.jenkins.plugins.services.DetectionService;
import com.stackrox.jenkins.plugins.services.ImageService;
import com.stackrox.jenkins.plugins.services.ServiceException;
import com.stackrox.model.V1AuthStatus;

@SuppressWarnings("unused")
@Getter
@Setter
public class StackroxBuilder extends Builder implements SimpleBuildStep {
    private String portalAddress;
    @DataBoundSetter
    private String imageNames;
    private Secret apiToken = Secret.fromString("");
    @DataBoundSetter
    private boolean failOnPolicyEvalFailure;
    @DataBoundSetter
    private boolean failOnCriticalPluginError;
    @DataBoundSetter
    private boolean enableTLSVerification;
    @DataBoundSetter
    private String caCertPEM;

    private RunConfig runConfig;

    @DataBoundConstructor
    public StackroxBuilder() {
    }

    private ApiClientFactory.StackRoxTlsValidationMode getTLSValidationMode() {
        return enableTLSVerification ? VALIDATE : INSECURE_ACCEPT_ANY;
    }

    private List<String> getImages() {
        return ImmutableList.copyOf(Splitter.on(",")
                .omitEmptyStrings()
                .trimResults()
                .split(Strings.nullToEmpty(getImageNames())));
    }

    @DataBoundSetter
    public void setPortalAddress(String portalAddress) {
        this.portalAddress = CharMatcher.is('/').trimTrailingFrom(portalAddress);
    }

    @DataBoundSetter
    public void setApiToken(String apiToken) {
        this.apiToken = Secret.fromString(apiToken);
    }

    //TODO: Add console log for the plugin
    @Override
    public void perform(
            @Nonnull Run<?, ?> run,
            @Nonnull FilePath workspace,
            @Nonnull Launcher launcher,
            @Nonnull TaskListener listener) throws IOException, InterruptedException {

        runConfig = RunConfig.create(listener.getLogger(), run.getCharacteristicEnvVars().get("BUILD_TAG"), workspace, getImages());

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

        ApiClient apiClient = ApiClientFactory.newApiClient(
                getPortalAddress(), getApiToken().getPlainText(), getCaCertPEM(), getTLSValidationMode());
        ImageService imageService = new ImageService(apiClient);
        DetectionService detectionService = new DetectionService(apiClient);

        for (String name : runConfig.getImageNames()) {
            runConfig.getLog().printf("Checking image %s...%n", name);

            List<CVE> cves = imageService.getImageScanResults(name);
            List<PolicyViolation> violatedPolicies = detectionService.getPolicyViolations(name);
            results.add(new ImageCheckResults(name, cves, violatedPolicies));
        }

        results.sort((result1, result2) -> {
            //descending order
            return Boolean.compare(result1.isStatusPass(), result2.isStatusPass());
        });
        return results;
    }

    // Runs an image scan and the build time policy checks on the image

    private boolean enforcedPolicyViolationExists(List<ImageCheckResults> results) {
        for (ImageCheckResults result : results) {
            if (!result.isStatusPass()) {
                return true;
            }
        }
        return false;
    }

    private void cleanupJenkinsWorkspace() {
        runConfig.getLog().println("Cleaning up the workspace ...");

        try {
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
                return FormValidation.error(e, Messages.StackroxBuilder_TestConnectionError());
            }
        }

        private boolean checkRoxAuthStatus(final String portalAddress, final String apiToken, final boolean tlsVerify, final String caCertPEM) throws IOException {
            ApiClient apiClient = ApiClientFactory.newApiClient(portalAddress, apiToken, caCertPEM, validationMode(tlsVerify));
            try {
                V1AuthStatus status = new AuthServiceApi(apiClient).authServiceGetAuthStatus();
                return !Strings.isNullOrEmpty(status.getUserId());
            } catch (ApiException e) {
                throw ServiceException.fromApiException("Could not get auth status.", e);
            }
        }

        private ApiClientFactory.StackRoxTlsValidationMode validationMode(final boolean tlsVerify) {
            return tlsVerify ? VALIDATE : INSECURE_ACCEPT_ANY;
        }
    }
}
