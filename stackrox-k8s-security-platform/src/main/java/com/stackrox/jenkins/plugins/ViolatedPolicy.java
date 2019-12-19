package com.stackrox.jenkins.plugins;

import javax.print.attribute.standard.Severity;

public class ViolatedPolicy {
    public static int BUILD_TIME_ENFORCEMENT = 4;

    private String name;
    private String description;
    private String severity;
    private boolean enforced;

    public ViolatedPolicy(String name, String description, String severity, boolean enforced) {
        this.name = name;
        this.description = description;
        this.severity = severity;
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
