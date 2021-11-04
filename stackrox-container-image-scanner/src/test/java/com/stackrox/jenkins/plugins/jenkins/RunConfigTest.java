package com.stackrox.jenkins.plugins.jenkins;

import com.google.common.collect.ImmutableList;
import hudson.AbortException;
import hudson.FilePath;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;

import static org.apache.commons.io.output.NullOutputStream.NULL_OUTPUT_STREAM;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RunConfigTest {

    @TempDir
    Path folder;

    private static final PrintStream LOG = new PrintStream(NULL_OUTPUT_STREAM);

    @Test
    void createShouldFailWhenNoImagesSpecifiedAndFileDoesNotExist() {
        Exception exception = assertThrows(AbortException.class, () -> RunConfig.create(LOG, "", new FilePath(folder.toFile()), null));
        assertTrue(exception.getMessage().contains("Error in creating a run configuration: rox_images_to_scan not found at"));
    }

    @Test
    void createShouldFailWhenNoImagesToScan() throws IOException {
        assertTrue(new File(folder.toFile(), "rox_images_to_scan").createNewFile());
        Exception exception = assertThrows(AbortException.class, () -> RunConfig.create(LOG, "", new FilePath(folder.toFile()), null));
        assertEquals("Error in creating a run configuration: no images to scan", exception.getMessage());
    }

    @Test
    void createShouldReturnListOfProvidedImagesAndCreateRequiredDirs() throws IOException, InterruptedException {
        RunConfig runConfig = RunConfig.create(LOG, "", new FilePath(folder.toFile()), ImmutableList.of("A", "B", "C"));
        assertEquals(ImmutableList.of("A", "B", "C"), runConfig.getImageNames());
        assertTrue(runConfig.getReportsDir().exists());
        assertTrue(runConfig.getBaseWorkDir().exists());
    }

    @Test
    void createShouldReturnListOfFromFileAndCreateRequiredDirs() throws IOException, InterruptedException {
        File imagesToScan = new File(folder.toFile(), "rox_images_to_scan");
        FileWriter writer = new FileWriter(imagesToScan);
        writer.write("A\nB\nC\n");
        writer.close();
        RunConfig runConfig = RunConfig.create(LOG, "", new FilePath(folder.toFile()), null);
        assertEquals(ImmutableList.of("A", "B", "C"), runConfig.getImageNames());
        assertTrue(runConfig.getReportsDir().exists());
        assertTrue(runConfig.getBaseWorkDir().exists());
    }
}
