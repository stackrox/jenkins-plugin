package com.stackrox.jenkins.plugins;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
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
import javax.json.JsonObject;
import javax.json.JsonReader;
import jenkins.tasks.SimpleBuildStep;
import net.sf.json.JSONObject;
import org.apache.commons.validator.routines.UrlValidator;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;
import org.kohsuke.stapler.QueryParameter;
import org.kohsuke.stapler.StaplerRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.file.Files;

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


    private RunConfig runConfig;
    
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

        runConfig = new RunConfig(run, workspace, launcher, listener);

        for (String name: runConfig.getImageNames()) {
            processImage(name);
        }
        generateReport();

        cleanupJenkinsWorkspace();
    }

    // Runs an image scan and the build time policy checks on the image
    private void processImage (String imageName) {
        runConfig.getLog().println(String.format("Checking image %s...", imageName));
        //TODO run image scan + policy checks and store results
    }

    private void generateReport() {
        runConfig.getLog().println(String.format("Generating report..."));
        //TODO: chew on image scan results for all images and generate Jenkins report to persist in build
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

                authStatusRequest = new HttpGet(Joiner.on("/").join(portalAddress, "v1", "auth", "status"));
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
