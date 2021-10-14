package com.stackrox.jenkins.plugins.report;

import static com.stackrox.model.StorageEmbeddedVulnerabilityScoreVersion.V2;
import static com.stackrox.model.StorageEmbeddedVulnerabilityScoreVersion.V3;
import static com.stackrox.model.StorageSeverity.HIGH_SEVERITY;
import static com.stackrox.model.StorageSeverity.MEDIUM_SEVERITY;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;
import hudson.AbortException;
import hudson.FilePath;
import org.apache.commons.io.FileUtils;
import org.threeten.bp.OffsetDateTime;

import com.stackrox.jenkins.plugins.data.CVE;
import com.stackrox.jenkins.plugins.data.ImageCheckResults;
import com.stackrox.model.StorageEmbeddedVulnerability;
import com.stackrox.model.StoragePolicy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

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
                new CVE("util-linux", "2.25.2-6", new StorageEmbeddedVulnerability()
                        .cve("CVE-2015-5224")
                        .cvss((float) 9.8)
                        .scoreVersion(V3)
                        .publishedOn(OffsetDateTime.parse("2017-08-23T15:29:00Z"))
                        .link("https://security-tracker.debian.org/tracker/CVE-2015-5224")),
                new CVE("gcc-4.8", "4.8.4-1", new StorageEmbeddedVulnerability()
                        .cve("CVE-2017-11671")
                        .cvss((float) 4.0)
                        .scoreVersion(V3)
                        .publishedOn(OffsetDateTime.parse("2017-07-26T21:29:00Z"))
                        .link("https://security-tracker.debian.org/tracker/CVE-2017-11671")),
                new CVE("bzip2", "1.0.6-7", new StorageEmbeddedVulnerability()
                        .cve("CVE-2016-3189")
                        .cvss((float) 6.5)
                        .scoreVersion(V3)
                        .publishedOn(OffsetDateTime.parse("2016-06-30T17:59:00Z"))
                        .link("https://security-tracker.debian.org/tracker/CVE-2016-3189")
                        .fixedBy("1.0.6-8"))
        ), ImmutableList.of(
                new StoragePolicy()
                        .name("Fixable Severity at least Important")
                        .description("Alert on deployments with fixable vulnerabilities with a Severity Rating at least Important")
                        .severity(HIGH_SEVERITY)
                        .remediation("Use your package manager to update to a fixed version in future builds or speak with your security team to mitigate the vulnerabilities.")
        )), new ImageCheckResults("nginx:latest",
                ImmutableList.of(
                        new CVE("openssl", "1.1.1d-0+deb10u7", new StorageEmbeddedVulnerability()
                                .cve("CVE-2007-6755")
                                .cvss((float) 5.8)
                                .scoreVersion(V2)
                                .publishedOn(OffsetDateTime.parse("2013-10-11T22:55:00Z"))
                                .link("https://security-tracker.debian.org/tracker/CVE-2007-6755")),
                        new CVE(null, null, new StorageEmbeddedVulnerability()
                                .cve("CVE-MISSING-DATA")
                                .scoreVersion(null)
                                .cvss(0F))),
                ImmutableList.of(
                        new StoragePolicy().name("Latest Tag")
                                .description("")
                                .severity(MEDIUM_SEVERITY)
                                .remediation("No remediation actions documented."),
                        new StoragePolicy()
                                .name("Fixable Severity at least Important")
                                .description("Alert on deployments with fixable vulnerabilities with a Severity Rating at least Important")
                                .severity(HIGH_SEVERITY)
                                .remediation("Use your package manager to update to a fixed version in future builds or speak with your security team to mitigate the vulnerabilities.")
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
