package com.stackrox.jenkins.plugins;

import com.google.common.collect.Lists;
import com.stackrox.jenkins.plugins.data.CVE;
import com.stackrox.jenkins.plugins.data.ImageCheckResults;
import com.stackrox.jenkins.plugins.data.ViolatedPolicy;
import com.stackrox.jenkins.plugins.jenkins.Plugin;
import com.stackrox.jenkins.plugins.jenkins.RunConfig;
import com.stackrox.jenkins.plugins.jenkins.ViewStackroxResultsAction;
import com.stackrox.jenkins.plugins.report.ReportGenerator;
import com.stackrox.jenkins.plugins.services.DetectionService;
import com.stackrox.jenkins.plugins.services.HttpClientUtils;
import com.stackrox.jenkins.plugins.services.ImageService;
import hudson.AbortException;
import hudson.FilePath;
import hudson.Launcher;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.ArtifactArchiver;
import jenkins.tasks.SimpleBuildStep;
import org.apache.http.impl.client.CloseableHttpClient;
import org.kohsuke.stapler.DataBoundConstructor;

import javax.annotation.Nonnull;
import java.io.IOException;
import java.util.List;

public class StackroxBuilder extends Plugin implements SimpleBuildStep {

    @DataBoundConstructor
    public StackroxBuilder() {
    }

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

            ArtifactArchiver artifactArchiver = new ArtifactArchiver(runConfig.getArtifacts());
            artifactArchiver.setAllowEmptyArchive(true);
            artifactArchiver.perform(run, workspace, launcher, listener);

            run.addAction(new ViewStackroxResultsAction(results, run));

            cleanupJenkinsWorkspace();

            if (enforcedPolicyViolationExists(results)) {
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
        }
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

        ReportGenerator.generateBuildReport(results, runConfig.getReportsDir());
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

}
