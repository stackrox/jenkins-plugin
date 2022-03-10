package com.stackrox.jenkins.plugins.data;

import com.google.common.base.Strings;

import com.stackrox.model.StorageEmbeddedVulnerability;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.Nonnull;

import static java.time.format.DateTimeFormatter.ISO_DATE_TIME;

@Data
@AllArgsConstructor
public class CVE {
    private final String id;
    private final Float cvssScore;
    private final String scoreType;
    private final String publishDate;
    private final String packageName;
    private final String packageVersion;
    private final boolean fixable;
    private final String link;
    private final String severity;

    public CVE(String packageName, String packageVersion, @Nonnull StorageEmbeddedVulnerability vulnerability) {
        this(
                vulnerability.getCve(),
                vulnerability.getCvss(),
                vulnerability.getScoreVersion() != null ? vulnerability.getScoreVersion().toString() : null,
                vulnerability.getPublishedOn() != null ? vulnerability.getPublishedOn().format(ISO_DATE_TIME) : null,
                packageName,
                packageVersion,
                !Strings.isNullOrEmpty(vulnerability.getFixedBy()),
                vulnerability.getLink(),
                SeverityUtil.prettySeverity(vulnerability.getSeverity())
        );
    }
}
