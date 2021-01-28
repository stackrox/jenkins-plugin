package com.stackrox.jenkins.plugins;

public class PolicyEvalException extends Exception {
    public PolicyEvalException() {
    }

    public PolicyEvalException(String message) {
        super(message);
    }
}
