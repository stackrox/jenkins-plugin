package com.stackrox.jenkins.plugins.jenkins;

import com.google.common.collect.Lists;

import com.stackrox.invoker.ApiClient;
import com.stackrox.jenkins.plugins.data.CVE;
import com.stackrox.jenkins.plugins.data.ImageCheckResults;
import com.stackrox.jenkins.plugins.data.PolicyViolation;
import com.stackrox.jenkins.plugins.services.ApiClientFactory;
import com.stackrox.jenkins.plugins.services.DetectionService;
import com.stackrox.jenkins.plugins.services.ImageService;

import hudson.FilePath;
import hudson.util.Secret;
import jenkins.security.MasterToSlaveCallable;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.util.List;

@Data
@AllArgsConstructor
public class ScanTask extends MasterToSlaveCallable<List<ImageCheckResults>, IOException> implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String buildTag;
    private final String workspace;
    private final List<String> images;
    private final String portalAddress;
    private final Secret apiToken;
    private final String caCertPEM;
    private final ApiClientFactory.StackRoxTlsValidationMode tlsValidationMode;


    @Override
    public List<ImageCheckResults> call() throws IOException {
        RunConfig runConfig = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream errorOut = new PrintStream(byteArrayOutputStream);
        PrintStream log = new PrintStream(errorOut);

        File folder = new File(workspace);
        try {
            runConfig = RunConfig.create(log, buildTag, new FilePath(folder), images,
                    portalAddress, apiToken, caCertPEM, tlsValidationMode);
        } catch (InterruptedException e) {
            throw new IOException(e);
        }
        List<ImageCheckResults> imageCheckResults = checkImages(runConfig);
        cleanupJenkinsWorkspace(runConfig);
        return imageCheckResults;

    }

    private List<ImageCheckResults> checkImages(RunConfig runConfig) throws IOException {
        List<ImageCheckResults> results = Lists.newArrayList();

        ApiClient apiClient = ApiClientFactory.newApiClient(
                runConfig.getPortalAddress(),
                runConfig.getApiToken().getPlainText(),
                runConfig.getCaCertPEM(),
                runConfig.getTLSValidationMode()
        );
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

    private void cleanupJenkinsWorkspace(RunConfig runConfig) {
        runConfig.getLog().println("Cleaning up the workspace ...");

        try {
            runConfig.getBaseWorkDir().deleteRecursive();
            runConfig.getReportsDir().deleteRecursive();
        } catch (IOException | InterruptedException e) {
            runConfig.getLog().println("WARN: Failed to cleanup.");
        }
    }
}
