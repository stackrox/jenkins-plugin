package com.stackrox.jenkins.plugins;

public class ViolatedPolicy {
    public static int BUILD_TIME_ENFORCEMENT = 4;

    public enum Severity {
        UNKNOWN,
        LOW,
        MEDIUM,
        HIGH,
        CRITICAL,
    }

    private String name;
    private String description;
    private Severity severity;
    private boolean enforced;

    public ViolatedPolicy (String name, String description, int severity, boolean enforced) {
        this.name = name;
        this.description = description;
        switch (severity) {
            case 1:
                this.severity = Severity.LOW;
                break;
            case 2:
                this.severity = Severity.MEDIUM;
                break;
            case 3:
                this.severity = Severity.HIGH;
                break;
            case 4:
                this.severity = Severity.CRITICAL;
                break;
            default:
                this.severity = Severity.UNKNOWN;
                break;
        }
        this.enforced = enforced;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Severity getSeverity() {
        return severity;
    }

    public boolean isEnforced() {
        return enforced;
    }


}
