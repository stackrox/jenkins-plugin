package com.stackrox.jenkins.plugins.data;

import com.google.common.base.Objects;
import com.google.common.base.Strings;

import com.stackrox.model.StorageEmbeddedVulnerability;
import com.stackrox.model.StorageVulnerabilitySeverity;

import static java.time.format.DateTimeFormatter.ISO_DATE_TIME;

public class CVE {
    private final String packageName;
    private final String packageVersion;
    private final StorageEmbeddedVulnerability vulnerability;

    public CVE(String packageName, String packageVersion, StorageEmbeddedVulnerability vulnerability) {
        this.packageName = packageName;
        this.packageVersion = packageVersion;
        this.vulnerability = vulnerability;
    }

    public StorageVulnerabilitySeverity getSeverity() {
        return vulnerability.getSeverity();
    }

    public String getId() {
        return vulnerability.getCve();
    }

    public String getPackageName() {
        return packageName;
    }

    public String getPackageVersion() {
        return packageVersion;
    }

    public String getLink() {
        return vulnerability.getLink();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CVE cve = (CVE) o;
        return Objects.equal(getPackageName(), cve.getPackageName()) && Objects.equal(getPackageVersion(), cve.getPackageVersion()) && Objects.equal(vulnerability, cve.vulnerability);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPackageName(), getPackageVersion(), vulnerability);
    }

    @Override
    public String toString() {
        return "CVE{" +
                "packageName='" + packageName + '\'' +
                ", packageVersion='" + packageVersion + '\'' +
                ", vulnerability=" + vulnerability +
                '}';
    }
}
