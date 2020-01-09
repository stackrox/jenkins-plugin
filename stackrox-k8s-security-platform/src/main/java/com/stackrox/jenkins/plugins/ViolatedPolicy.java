package com.stackrox.jenkins.plugins;

public class ViolatedPolicy {
    public static final String FAIL_BUILD_ENFORCEMENT = "FAIL_BUILD_ENFORCEMENT";

    private String name;
    private String description;
    private String severity;
    private boolean enforced;

    public ViolatedPolicy(String name, String description, String severity, boolean enforced) {
        this.name = name;
        this.description = description;
        this.severity = severity.split("_")[0];
        this.enforced = enforced;
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

    public boolean isEnforced() {
        return enforced;
    }

}
