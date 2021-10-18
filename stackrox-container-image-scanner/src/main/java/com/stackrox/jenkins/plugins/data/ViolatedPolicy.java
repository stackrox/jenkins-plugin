package com.stackrox.jenkins.plugins.data;

import com.google.common.base.Strings;

import java.util.Objects;

public class ViolatedPolicy {
    private static final String NO_REMEDIATION_ACTIONS = "No remediation actions documented.";

    private final String name;
    private final String description;
    private final String severity;
    private final String remediation;

    public ViolatedPolicy(String name, String description, String severity, String remediation) {
        this.name = name;
        this.description = description;
        this.severity = severity.split("_")[0];
        this.remediation = remediation;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSeverity() {
        return severity;
    }

    public String getRemediation() {
        return Strings.isNullOrEmpty(remediation) ? ViolatedPolicy.NO_REMEDIATION_ACTIONS : remediation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViolatedPolicy that = (ViolatedPolicy) o;
        return Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(severity, that.severity) && Objects.equals(remediation, that.remediation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, severity, remediation);
    }

    @Override
    public String toString() {
        return "ViolatedPolicy{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", severity='" + severity + '\'' +
                ", remediation='" + remediation + '\'' +
                '}';
    }
}
