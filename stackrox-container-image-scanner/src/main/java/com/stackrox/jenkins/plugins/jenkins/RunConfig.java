package com.stackrox.jenkins.plugins.jenkins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

import com.google.common.collect.Lists;
import hudson.AbortException;
import hudson.EnvVars;
import hudson.FilePath;
import hudson.model.Run;
import hudson.model.TaskListener;

public class RunConfig {
    private static final String IMAGE_LIST_FILENAME = "rox_images_to_scan";
    private static final String REPORTS_DIR_NAME = "rox_image_security_reports";

    private final PrintStream log;
    private final FilePath baseWorkDir;
    private final FilePath reportsDir;
    private final FilePath imagesToScanFilePath;
    private final List<String> imageNames;
    private final String artifacts;

    public RunConfig(Run<?, ?> run, FilePath workspace, TaskListener listener) throws AbortException {
        try {
            EnvVars envVars = run.getEnvironment(listener);
            log = listener.getLogger();
            baseWorkDir = new FilePath(workspace, envVars.get("BUILD_TAG"));

            imagesToScanFilePath = new FilePath(baseWorkDir, IMAGE_LIST_FILENAME);
            if (!imagesToScanFilePath.exists()) {
                throw new AbortException(String.format("%s not found at %s, no images to scan.", IMAGE_LIST_FILENAME, imagesToScanFilePath));
            }

            reportsDir = new FilePath(baseWorkDir, REPORTS_DIR_NAME);
            reportsDir.mkdirs();
            artifacts = String.format("%s/%s/", envVars.get("BUILD_TAG"), REPORTS_DIR_NAME);

            try (BufferedReader br = new BufferedReader(new InputStreamReader(imagesToScanFilePath.read(), StandardCharsets.UTF_8))) {
                imageNames = Lists.newArrayList();
                String name;
                while ((name = br.readLine()) != null) {
                    imageNames.add(name);
                }
            }
        } catch (IOException | InterruptedException e) {
            throw new AbortException(String.format("Error in creating a run configuration: %s", e.getMessage()));
        }
    }

    public String getArtifacts() {
        return artifacts;
    }

    public FilePath getBaseWorkDir() {
        return baseWorkDir;
    }

    public FilePath getReportsDir() {
        return reportsDir;
    }

    public List<String> getImageNames() {
        return imageNames;
    }

    public PrintStream getLog() {
        return log;
    }

    public FilePath getImagesToScanFilePath() {
        return imagesToScanFilePath;
    }
}

