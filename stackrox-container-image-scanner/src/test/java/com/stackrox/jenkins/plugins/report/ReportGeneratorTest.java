package com.stackrox.jenkins.plugins.report;

import com.google.common.collect.ImmutableList;
import com.stackrox.jenkins.plugins.data.CVE;
import com.stackrox.jenkins.plugins.data.ImageCheckResults;
import com.stackrox.jenkins.plugins.data.ViolatedPolicy;
import hudson.AbortException;
import hudson.FilePath;
import static java.nio.charset.StandardCharsets.UTF_8;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.stream.Collectors;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.jupiter.api.Assertions.*;

class ReportGeneratorTest {

    @TempDir
    Path folder;

    @Test
    void testGenerateReportFroEmptyResultGeneratesNothing() throws IOException, InterruptedException {
        FilePath reportsDir = new FilePath(folder.toFile());

        ReportGenerator.generateBuildReport(Collections.emptyList(), reportsDir);

        assertTrue(reportsDir.list().isEmpty());
    }

    @Test
    void testGenerateReportFroEmptyCVSAndViolationsGeneratesEmptyDir() throws IOException, InterruptedException {
        FilePath reportsDir = new FilePath(folder.toFile());

        ImmutableList<ImageCheckResults> results = ImmutableList.of(
                new ImageCheckResults("mis-spelled:lts", Collections.emptyList(), Collections.emptyList()));
        ReportGenerator.generateBuildReport(results, reportsDir);

        List<String> actual = reportsDir.list().stream().map(FilePath::getName).collect(Collectors.toList());
        assertEquals(ImmutableList.of("mis-spelled.lts"), actual);
        assertTrue(reportsDir.child("mis-spelled.lts").list().isEmpty());
    }

    @Test
    void testGenerateReportForResultsThrowsOnWriteException() throws IOException {
        Path tempFile = Files.createFile(folder.resolve("test.txt"));
        FilePath reportsDir = new FilePath(tempFile.toFile());
        List<ImageCheckResults> results = ImmutableList.of(
                new ImageCheckResults("jenkins:lts", Collections.emptyList(), Collections.emptyList()));

        Exception exception = assertThrows(AbortException.class, () -> ReportGenerator.generateBuildReport(results, reportsDir));

        String expected = String.format("Failed to write image scan results. Error: %s/jenkins.lts: Not a directory", reportsDir.getRemote());
        assertEquals(expected, exception.getMessage());
    }

    @Test
    void testGenerateReportForResultsWritesReportsForEveryImageInSeparatedDirectory() throws IOException {
        FilePath reportsDir = new FilePath(folder.toFile());
        List<ImageCheckResults> results = ImmutableList.of(new ImageCheckResults("jenkins:lts", ImmutableList.of(
                CVE.Builder.newInstance()
                        .withId("CVE-2015-5224")
                        .withCvssScore((float) 9.8)
                        .withScoreType("V3")
                        .withPublishDate("2017-08-23T15:29:00Z")
                        .withLink("https://security-tracker.debian.org/tracker/CVE-2015-5224")
                        .inPackage("util-linux")
                        .inVersion("2.25.2-6")
                        .isFixable(false)
                        .build(),
                CVE.Builder.newInstance()
                        .withId("CVE-2017-11671")
                        .withCvssScore((float) 4.0)
                        .withScoreType("V3")
                        .withPublishDate("2017-07-26T21:29:00Z")
                        .withLink("https://security-tracker.debian.org/tracker/CVE-2017-11671")
                        .inPackage("gcc-4.8")
                        .inVersion("4.8.4-1")
                        .isFixable(false)
                        .build(),
                CVE.Builder.newInstance()
                        .withId("CVE-2016-3189")
                        .withCvssScore((float) 6.5)
                        .withScoreType("V3")
                        .withPublishDate("2016-06-30T17:59:00Z")
                        .withLink("https://security-tracker.debian.org/tracker/CVE-2016-3189")
                        .inPackage("bzip2")
                        .inVersion("1.0.6-7")
                        .isFixable(true)
                        .build()
        ), ImmutableList.of(
                new ViolatedPolicy("Fixable Severity at least Important",
                        "Alert on deployments with fixable vulnerabilities with a Severity Rating at least Important",
                        "HIGH",
                        "Use your package manager to update to a fixed version in future builds or speak with your security team to mitigate the vulnerabilities.")
        )), new ImageCheckResults("nginx:latest",
                ImmutableList.of(
                        CVE.Builder.newInstance()
                                .withId("CVE-2007-6755")
                                .withCvssScore((float) 5.8)
                                .withScoreType("V2")
                                .withPublishDate("2013-10-11T22:55:00Z")
                                .withLink("https://security-tracker.debian.org/tracker/CVE-2007-6755")
                                .inPackage("openssl")
                                .inVersion("1.1.1d-0+deb10u7")
                                .isFixable(false)
                                .build()),
                ImmutableList.of(
                        new ViolatedPolicy("Latest Tag",
                                "",
                                "MEDIUM",
                                "No remediation actions documented."),
                        new ViolatedPolicy("Fixable Severity at least Important",
                                "Alert on deployments with fixable vulnerabilities with a Severity Rating at least Important",
                                "HIGH",
                                "Use your package manager to update to a fixed version in future builds or speak with your security team to mitigate the vulnerabilities.")
                )));
        ReportGenerator.generateBuildReport(results, reportsDir);

        assertDirsAreEqual(Paths.get("src", "test", "resources", "report"), folder);

    }

    /**
     * @link https://stackoverflow.com/a/39584230/1387612
     */
    private static void assertDirsAreEqual(Path expected, Path actual) throws IOException {
        Files.walkFileTree(expected, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                FileVisitResult result = super.preVisitDirectory(dir, attrs);

                Path relativize = expected.relativize(dir);
                File otherDir = actual.resolve(relativize).toFile();
                Set<String> expectedContents = Arrays.stream(Objects.requireNonNull(dir.toFile().list())).collect(Collectors.toSet());
                Set<String> actualContents = Arrays.stream(Objects.requireNonNull(otherDir.list())).collect(Collectors.toSet());
                assertEquals(expectedContents, actualContents, String.format("%s and %s don't contain same files", dir, otherDir));
                return result;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                    throws IOException {
                FileVisitResult result = super.visitFile(file, attrs);

                Path relativize = expected.relativize(file);
                Path actualFile = actual.resolve(relativize);

                String actualContent = FileUtils.readFileToString(actualFile.toFile(), UTF_8.name());
                String expectedContent = FileUtils.readFileToString(file.toFile(), UTF_8.name());
                assertEquals(expectedContent, actualContent, String.format("%s differs from %s", file, actualFile));
                return result;
            }
        });
    }

}