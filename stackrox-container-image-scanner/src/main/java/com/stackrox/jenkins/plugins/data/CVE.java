package com.stackrox.jenkins.plugins.data;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.stackrox.model.StorageEmbeddedVulnerability;

@Data
@AllArgsConstructor
public class CVE {
    private final String packageName;
    private final String packageVersion;
    private final String severity;
    private final String id;
    private final String link;

    public CVE(String packageName, String packageVersion, StorageEmbeddedVulnerability vulnerability) {
        this(
                packageName,
                packageVersion,
                SeverityUtil.prettySeverity(vulnerability.getSeverity()),
                vulnerability.getCve(),
                vulnerability.getLink()
        );
    }
}
