package com.stackrox.jenkins.plugins;

import com.google.common.base.Strings;
import java.util.List;

public class ViolatedPolicy {
    public static final String FAIL_BUILD_ENFORCEMENT = "FAIL_BUILD_ENFORCEMENT";
    public static final String NO_REMEDIATION_ACTIONS = "No remediation actions documented.";

    private String name;
    private String description;
    private String severity;
    private String remediation;

    private List<String> violations;

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
