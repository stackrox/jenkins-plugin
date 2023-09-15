package com.stackrox.jenkins.plugins.jenkins;

import com.google.common.collect.ImmutableList;

import com.stackrox.jenkins.plugins.StackroxBuilder;

import com.stackrox.jenkins.plugins.services.ApiClientFactory;

import hudson.AbortException;
import hudson.FilePath;

import hudson.util.Secret;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.util.Collections;

import static org.apache.commons.io.output.NullOutputStream.NULL_OUTPUT_STREAM;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RunConfigTest {

    @TempDir
    Path folder;

    private static final PrintStream LOG = new PrintStream(NULL_OUTPUT_STREAM);
    private static final String BUILD_TAG = "jenkins-JOB_NAME-BUILD_NUMBER";

    @Test
    void createShouldFailWhenNoImagesSpecifiedAndFileDoesNotExist() {
        Exception exception = assertThrows(IOException.class, () -> RunConfig.createForTest(LOG, BUILD_TAG, new FilePath(folder.toFile()), Collections.emptyList()));
        assertTrue(exception.getMessage().contains("rox_images_to_scan not found"));
    }

    @Test
    void createShouldFailWhenNoImagesToScan() throws IOException {
        assertTrue(imagesToScanFile().createNewFile());
        Exception exception = assertThrows(IOException.class, () -> RunConfig.createForTest(LOG, BUILD_TAG, new FilePath(folder.toFile()), Collections.emptyList()));
        assertEquals("no images to scan", exception.getMessage());
    }

    @Test
    void createShouldReturnListOfProvidedImagesAndCreateRequiredDirs() throws IOException, InterruptedException {
        RunConfig runConfig = RunConfig.createForTest(LOG, BUILD_TAG, new FilePath(folder.toFile()), ImmutableList.of("A", "B", "C"));
        assertEquals(ImmutableList.of("A", "B", "C"), runConfig.getImageNames());
        assertTrue(runConfig.getReportsDir().exists());
        assertFalse(runConfig.getBaseWorkDir().exists());
    }

    @Test
    void createShouldReturnListOfFromFileAndCreateRequiredDirs() throws IOException, InterruptedException {
        File imagesToScan = imagesToScanFile();
        FileWriter writer = new FileWriter(imagesToScan);
        writer.write("A\nB\nC\n");
        writer.close();
        RunConfig runConfig = RunConfig.createForTest(LOG, BUILD_TAG, new FilePath(folder.toFile()), Collections.emptyList());
        assertEquals(ImmutableList.of("A", "B", "C"), runConfig.getImageNames());
        assertTrue(runConfig.getReportsDir().exists());
        assertTrue(runConfig.getBaseWorkDir().exists());
        assertEquals("rox_image_security_reports/", runConfig.getArtifactsRelativePath());
    }

    @Test
    void shouldBeSerializable() throws IOException, InterruptedException, ClassNotFoundException {
        File imagesToScan = imagesToScanFile();
        FileWriter writer = new FileWriter(imagesToScan);
        writer.write("A\nB\nC\n");
        writer.close();

        ScanTask original = new ScanTask(BUILD_TAG, folder.toString(), ImmutableList.of( "A", "B", "C"), "", Secret.fromString(""), "", ApiClientFactory.StackRoxTlsValidationMode.VALIDATE);

        FileOutputStream fileOutputStream
                = new FileOutputStream("yourfile.txt");
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(original);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream
                = new FileInputStream("yourfile.txt");
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
        ScanTask copy = (ScanTask) objectInputStream.readObject();
        objectInputStream.close();

        assertEquals(ImmutableList.of("A", "B", "C"), copy.getImages());
        assertEquals(BUILD_TAG, copy.getBuildTag());
    }

    private File imagesToScanFile() {
        File workDir = new File(folder.toFile(), BUILD_TAG);
        workDir.mkdirs();
        return new File(workDir, "rox_images_to_scan");
    }
}
