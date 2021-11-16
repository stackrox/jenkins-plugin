package com.stackrox.jenkins.plugins.report;

import com.google.common.base.Strings;

import com.stackrox.jenkins.plugins.data.CVE;
import com.stackrox.jenkins.plugins.data.ImageCheckResults;
import com.stackrox.model.StoragePolicy;
import com.stackrox.model.StorageSeverity;

import hudson.AbortException;
import hudson.FilePath;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.QuoteMode;
import org.apache.commons.lang.StringUtils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReportGenerator {

    private static final String[] CVES_HEADER = {"COMPONENT", "VERSION", "CVE", "SEVERITY", "LINK"};
    private static final String[] VIOLATED_POLICIES_HEADER = {"Policy Name", "Policy Description", "Severity", "Remediation"};
    private static final String CVES_FILENAME = "cves.csv";
    private static final String POLICY_VIOLATIONS_FILENAME = "policyViolations.csv";
    private static final String NOT_AVAILABLE = "-";
    private static final String NO_REMEDIATION_ACTIONS = "No remediation actions documented.";

    public static void generateBuildReport(List<ImageCheckResults> results, FilePath reportsDir) throws AbortException {
        try {
            for (ImageCheckResults result : results) {
                generateReport(reportsDir, result);
            }
        } catch (IOException | InterruptedException e) {
            throw new AbortException(String.format("Failed to write image scan results. Error: %s", e.getMessage()));
        }
    }

    private static void generateReport(FilePath reportsDir, ImageCheckResults result) throws IOException, InterruptedException {
        FilePath imageResultDir = new FilePath(reportsDir, result.getImageName().replace(":", "."));
        imageResultDir.mkdirs();

        if (!result.getCves().isEmpty()) {
            try (OutputStream outputStream = new FilePath(imageResultDir, CVES_FILENAME).write();
                 CSVPrinter printer = openCsv(outputStream, CVES_HEADER)) {
                for (CVE cve : result.getCves()) {
                    printer.printRecord(nullIfEmpty(
                            cve.getPackageName(),
                            cve.getPackageVersion(),
                            cve.getId(),
                            prettySeverity(cve.getSeverity()),
                            cve.getLink()
                    ));
                }
            }
        }

        if (!result.getViolatedPolicies().isEmpty()) {
            try (OutputStream outputStream = new FilePath(imageResultDir, POLICY_VIOLATIONS_FILENAME).write();
                 CSVPrinter printer = openCsv(outputStream, VIOLATED_POLICIES_HEADER)) {
                for (StoragePolicy policy : result.getViolatedPolicies()) {
                    printer.printRecord(nullIfEmpty(
                            policy.getName(),
                            policy.getDescription(),
                            prettySeverity(policy.getSeverity()),
                            prettyRemediation(policy.getRemediation())
                    ));
                }
            }
        }
    }

    private static Object[] nullIfEmpty(Object... values) {
        return Arrays.stream(values).sequential().map(ReportGenerator::nullIfEmpty).toArray();
    }

    private static Object nullIfEmpty(Object s) {
        if (s == null) {
            return null;
        }
        if (s.getClass() != String.class) {
            return s;
        }
        return Strings.isNullOrEmpty(s.toString()) ? null : s;
    }

    private static String prettySeverity(Enum<?> severity) {
        if (severity == null) {
            return null;
        }
        return StringUtils.substringBefore(severity.toString(), "_");
    }

    private static String prettyRemediation(String remediation) {
        return Strings.isNullOrEmpty(remediation) ? NO_REMEDIATION_ACTIONS : remediation;
    }

    private static CSVPrinter openCsv(OutputStream outputStream, String[] header) throws IOException {
        return new CSVPrinter(new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8)),
                CSVFormat.EXCEL
                        .withQuoteMode(QuoteMode.MINIMAL)
                        .withNullString(NOT_AVAILABLE)
                        .withSystemRecordSeparator()
                        .withHeader(header));
    }
}
