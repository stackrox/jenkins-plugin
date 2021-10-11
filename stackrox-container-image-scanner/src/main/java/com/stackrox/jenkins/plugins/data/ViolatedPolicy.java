package com.stackrox.jenkins.plugins.data;

import com.google.common.base.Strings;

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
}
