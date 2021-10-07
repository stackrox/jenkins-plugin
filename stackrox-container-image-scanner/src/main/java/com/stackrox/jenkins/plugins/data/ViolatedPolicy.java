package com.stackrox.jenkins.plugins.data;

import com.google.common.base.Strings;

import java.util.List;

public class ViolatedPolicy {
    public static final String NO_REMEDIATION_ACTIONS = "No remediation actions documented.";

    private final String name;
    private final String description;
    private final String severity;
    private final String remediation;

    private final List<String> violations;

    public ViolatedPolicy(String name, String description, String severity, String remediation, List<String> violations) {
        this.name = name;
        this.description = description;
        this.severity = severity.split("_")[0];
        this.remediation = remediation;
        this.violations = violations;
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

    public List<String> getViolations() {
        return violations;
    }

}
