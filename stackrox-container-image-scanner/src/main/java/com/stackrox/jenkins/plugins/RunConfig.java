package com.stackrox.jenkins.plugins;

import com.google.common.collect.Lists;
import hudson.AbortException;
import hudson.EnvVars;
import hudson.FilePath;
import hudson.Launcher;
import hudson.model.Run;
import hudson.model.TaskListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.List;

public class RunConfig {
    private static final String IMAGE_LIST_FILENAME = "rox_images_to_scan";
    private static final String REPORTS_DIR_NAME = "rox_image_security_reports";

    private EnvVars envVars;
    private PrintStream log;
    private FilePath jenkinsWorkspace;
    private FilePath baseWorkDir;
    private FilePath reportsDir;
    private FilePath imagesToScanFilePath;
    private List<String> imageNames;
    private String artifacts;

    public RunConfig(Run<?, ?> run, FilePath workspace, Launcher launcher, TaskListener listener) throws AbortException {
        try {
            envVars = run.getEnvironment(listener);
            log = listener.getLogger();
            jenkinsWorkspace = workspace;
            baseWorkDir = new FilePath(workspace, envVars.get("BUILD_TAG"));

            imagesToScanFilePath = new FilePath(baseWorkDir, IMAGE_LIST_FILENAME);
            if (!imagesToScanFilePath.exists()) {
                throw new AbortException(String.format("%s not found at %s, no images to scan.", IMAGE_LIST_FILENAME, imagesToScanFilePath));
            }

            reportsDir = new FilePath(baseWorkDir, REPORTS_DIR_NAME);
            reportsDir.mkdirs();
            artifacts = String.format("%s/%s/", envVars.get("BUILD_TAG"), REPORTS_DIR_NAME);

            try (BufferedReader br = new BufferedReader(new InputStreamReader(imagesToScanFilePath.read()))) {
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

    public EnvVars getEnvVars() {
        return envVars;
    }

    public FilePath getJenkinsWorkspace() {
        return jenkinsWorkspace;
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

