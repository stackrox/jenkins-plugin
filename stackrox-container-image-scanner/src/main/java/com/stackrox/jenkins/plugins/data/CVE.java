package com.stackrox.jenkins.plugins.data;

import com.google.common.base.Strings;

import com.stackrox.model.StorageEmbeddedVulnerability;

import java.util.Objects;

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


    public String getId() {
        return vulnerability.getCve();
    }

    public Float getCvssScore() {
        return vulnerability.getCvss();
    }

    public String getScoreType() {
        return vulnerability.getScoreVersion() != null ? vulnerability.getScoreVersion().toString() : null;
    }

    public String getPublishDate() {
        return vulnerability.getPublishedOn() != null ? vulnerability.getPublishedOn().format(ISO_DATE_TIME) : null;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getPackageVersion() {
        return packageVersion;
    }

    public boolean isFixable() {
        return !Strings.isNullOrEmpty(vulnerability.getFixedBy());
    }

    public String getLink() {
        return vulnerability.getLink();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CVE cve = (CVE) o;

        if (getPackageName() != null ? !getPackageName().equals(cve.getPackageName()) : cve.getPackageName() != null)
            return false;
        if (getPackageVersion() != null ? !getPackageVersion().equals(cve.getPackageVersion()) : cve.getPackageVersion() != null)
            return false;
        return Objects.equals(vulnerability, cve.vulnerability);
    }

    @Override
    public int hashCode() {
        int result = getPackageName() != null ? getPackageName().hashCode() : 0;
        result = 31 * result + (getPackageVersion() != null ? getPackageVersion().hashCode() : 0);
        result = 31 * result + (vulnerability != null ? vulnerability.hashCode() : 0);
        return result;
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
