package com.stackrox.jenkins.plugins.data;

import com.stackrox.model.StorageEmbeddedVulnerability;
import com.stackrox.model.StorageVulnerabilitySeverity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CVE {
    private final String packageName;
    private final String packageVersion;
    private final StorageVulnerabilitySeverity severity;
    private final String id;
    private final String link;

    public CVE(String packageName, String packageVersion, StorageEmbeddedVulnerability vulnerability) {
        this(
                packageName,
                packageVersion,
                vulnerability.getSeverity(),
                vulnerability.getCve(),
                vulnerability.getLink()
        );
    }
}
