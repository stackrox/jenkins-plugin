package com.stackrox.jenkins.plugins.jenkins;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

import hudson.AbortException;
import hudson.FilePath;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class RunConfig {
    private static final String IMAGE_LIST_FILENAME = "rox_images_to_scan";
    private static final String REPORTS_DIR_NAME = "rox_image_security_reports";

    private final PrintStream log;
    private final FilePath baseWorkDir;
    private final FilePath reportsDir;
    private final List<String> imageNames;
    private final String artifacts;

    public static RunConfig create(PrintStream log, String buildTag, FilePath workspace, List<String> images) throws AbortException {
        try {
            FilePath baseWorkDir = new FilePath(workspace, buildTag);
            String artifacts = String.format("%s/%s/", buildTag, REPORTS_DIR_NAME);
            FilePath reportsDir = new FilePath(baseWorkDir, REPORTS_DIR_NAME);

            reportsDir.mkdirs();
            List<String> imageNames = images.isEmpty() ? extractImagesFromFile(baseWorkDir) : images;
            return new RunConfig(
                    log,
                    baseWorkDir,
                    reportsDir,
                    imageNames,
                    artifacts
            );
        } catch (IOException | InterruptedException e) {
            throw new AbortException(String.format("Error in creating a run configuration: %s", e.getMessage()));
        }
    }

    @NotNull
    private static List<String> extractImagesFromFile(FilePath baseWorkDir) throws IOException, InterruptedException {
        FilePath imagesToScanFilePath = new FilePath(baseWorkDir, IMAGE_LIST_FILENAME);
        if (!imagesToScanFilePath.exists()) {
            throw new AbortException(String.format("%s not found at %s, no images to scan.", IMAGE_LIST_FILENAME, imagesToScanFilePath));
        }
        List<String> imageNames = Files.readAllLines(new File(imagesToScanFilePath.toURI()).toPath(), Charset.defaultCharset());
        if (imageNames.isEmpty()) {
            throw new AbortException("no images to scan");
        }
        return imageNames;
    }
}

