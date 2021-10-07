package com.stackrox.jenkins.plugins.jenkins;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.stackrox.jenkins.plugins.Messages;
import com.stackrox.jenkins.plugins.services.HttpClientUtils;
import hudson.Extension;
import hudson.model.AbstractProject;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import hudson.util.FormValidation;
import hudson.util.Secret;
import jenkins.model.Jenkins;
import net.sf.json.JSONObject;
import org.apache.commons.validator.routines.RegexValidator;
import org.apache.commons.validator.routines.UrlValidator;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundSetter;
import org.kohsuke.stapler.QueryParameter;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.verb.POST;

import javax.annotation.Nonnull;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;

@SuppressWarnings("unused")
public class Plugin extends Builder {
    protected boolean failOnPolicyEvalFailure;
    protected boolean failOnCriticalPluginError;
    protected boolean enableTLSVerification;
    protected String caCertPEM;
    protected RunConfig runConfig;
    private String portalAddress;
    private Secret apiToken = Secret.fromString("");

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

    @Override
    public DescriptorImpl getDescriptor() {
        return (DescriptorImpl) this.getDescriptor();
    }

    //endregion

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
            // Cannot use the cached HttpClient here since this is before the perform step.
            CloseableHttpClient httpClient = HttpClientUtils.get(tlsVerify, caCertPEM);

            HttpGet authStatusRequest = new HttpGet(Joiner.on("/").join(portalAddress, "v1/auth/status"));
            authStatusRequest.addHeader("Accept", "application/json");
            authStatusRequest.addHeader("Authorization", Joiner.on(" ").join("Bearer", apiToken));

            try (CloseableHttpResponse response = httpClient.execute(authStatusRequest)) {
                int statusCode = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (statusCode != HttpURLConnection.HTTP_OK || entity == null) {
                    return false;
                }
                JsonReader reader = Json.createReader(new InputStreamReader(entity.getContent(), StandardCharsets.UTF_8));
                JsonObject object = reader.readObject();
                EntityUtils.consume(entity);
                return !Strings.isNullOrEmpty(object.getString("userId"));
            }
        }
    }
}
