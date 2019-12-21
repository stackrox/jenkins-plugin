package com.stackrox.jenkins.plugins;

import com.google.common.collect.Lists;
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

    private EnvVars envVars;
    private PrintStream log;
    private FilePath jenkinsWorkspace;
    private FilePath baseWorkDir;
    private FilePath reportsDir;
    private FilePath imagesToScanFilePath;
    private List<String> imageNames;

    public RunConfig(Run<?, ?> run, FilePath workspace, Launcher launcher, TaskListener listener) throws IOException, InterruptedException {
        envVars = run.getEnvironment(listener);
        log = listener.getLogger();
        jenkinsWorkspace = workspace;
        baseWorkDir = new FilePath(workspace, envVars.get("BUILD_TAG"));
        reportsDir = new FilePath(baseWorkDir, "StackRoxImageSecurityReports");
        reportsDir.mkdirs();

        imagesToScanFilePath = new FilePath(baseWorkDir, IMAGE_LIST_FILENAME);

        if (!imagesToScanFilePath.exists()) {
            throw new IOException(String.format("%s not found at %s, no images to scan.", IMAGE_LIST_FILENAME, imagesToScanFilePath));
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(imagesToScanFilePath.read()))) {
            imageNames = Lists.newArrayList();
            String name;
            while ((name = br.readLine()) != null) {
                imageNames.add(name);
            }
        }
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

