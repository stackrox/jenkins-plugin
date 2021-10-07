package com.stackrox.jenkins.plugins.report;

import com.stackrox.jenkins.plugins.data.CVE;
import com.stackrox.jenkins.plugins.data.ImageCheckResults;
import com.stackrox.jenkins.plugins.data.ViolatedPolicy;
import hudson.AbortException;
import hudson.FilePath;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.QuoteMode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ReportGenerator {

    private static final String[] CVES_HEADER = {"CVE ID", "CVSS Score", "Score Type", "Package Name", "Package Version", "Fixable", "Publish Date", "Link"};
    private static final String[] VIOLATED_POLICIES_HEADER = {"Policy Name", "Policy Description", "Severity", "Remediation"};
    private static final String CVES_FILENAME = "cves.csv";
    private static final String POLICY_VIOLATIONS_FILENAME = "policyViolations.csv";

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
            OutputStream outputStream = new FilePath(imageResultDir, CVES_FILENAME).write();
            try (CSVPrinter printer = openCsv(outputStream, CVES_HEADER)) {
                for (CVE cve : result.getCves()) {
                    printer.printRecord(
                            cve.getId(),
                            cve.getCvssScore(),
                            cve.getScoreType(),
                            cve.getPackageName(),
                            cve.getPackageVersion(),
                            cve.isFixable(),
                            cve.getPublishDate(),
                            cve.getLink()
                    );
                }
            }
        }

        if (!result.getViolatedPolicies().isEmpty()) {
            try (OutputStream outputStream = new FilePath(imageResultDir, POLICY_VIOLATIONS_FILENAME).write();
                 CSVPrinter printer = openCsv(outputStream, VIOLATED_POLICIES_HEADER)) {
                for (ViolatedPolicy policy : result.getViolatedPolicies()) {
                    printer.printRecord(
                            policy.getName(),
                            policy.getDescription(),
                            policy.getSeverity(),
                            policy.getRemediation()
                    );
                }
            }
        }
    }

    private static CSVPrinter openCsv(OutputStream outputStream, String[] header) throws IOException {
        return new CSVPrinter(new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8)),
                CSVFormat.EXCEL
                        .withQuoteMode(QuoteMode.NON_NUMERIC)
                        .withHeader(header));
    }
}
