package com.stackrox.jenkins.plugins.report;

import com.google.common.base.CharMatcher;
import com.stackrox.jenkins.plugins.data.CVE;
import com.stackrox.jenkins.plugins.data.ImageCheckResults;
import com.stackrox.jenkins.plugins.data.ViolatedPolicy;
import hudson.AbortException;
import hudson.FilePath;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.QuoteMode;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ReportGenerator {

    public static void generateBuildReport(List<ImageCheckResults> results, FilePath reportsDir) throws AbortException {
        try {
            for (ImageCheckResults result : results) {
                FilePath imageResultDir = new FilePath(reportsDir, CharMatcher.is(':').replaceFrom(result.getImageName(), '.'));
                imageResultDir.mkdirs();
                FilePath imageCveCsv = new FilePath(imageResultDir, "cves.csv");
                FilePath policyViolationsCsv = new FilePath(imageResultDir, "policyViolations.csv");

                if (!result.getCves().isEmpty()) {
                    try (CSVPrinter printer = new CSVPrinter(new OutputStreamWriter(imageCveCsv.write(), StandardCharsets.UTF_8), CSVFormat.EXCEL.withQuoteMode(QuoteMode.NON_NUMERIC))) {
                        printer.printRecord("CVE ID", "CVSS Score", "Score Type", "Package Name", "Package Version", "Fixable", "Publish Date", "Link");
                        for (CVE cve : result.getCves()) {
                            printer.printRecord(cve.getId(), cve.getCvssScore(), cve.getScoreType(), cve.getPackageName(), cve.getPackageVersion(), cve.isFixable(), cve.getPublishDate(), cve.getLink());
                        }
                    }
                }

                if (!result.getViolatedPolicies().isEmpty()) {
                    try (CSVPrinter printer = new CSVPrinter(new OutputStreamWriter(policyViolationsCsv.write(), StandardCharsets.UTF_8), CSVFormat.EXCEL.withQuoteMode(QuoteMode.NON_NUMERIC))) {
                        printer.printRecord("Policy Name", "Policy Description", "Severity", "Remediation");
                        for (ViolatedPolicy policy : result.getViolatedPolicies()) {
                            printer.printRecord(policy.getName(), policy.getDescription(), policy.getSeverity(), policy.getRemediation());
                        }
                    }
                }
            }
        } catch (IOException | InterruptedException e) {
            throw new AbortException(String.format("Failed to write image scan results. Error: %s", e.getMessage()));
        }
    }
}
