package com.stackrox.jenkins.plugins;

import java.util.List;

import hudson.model.Action;
import hudson.model.Run;
import jenkins.model.Jenkins;

import com.stackrox.jenkins.plugins.data.ImageCheckResults;

public class ViewStackroxResultsAction implements Action {
    private final Run<?, ?> build;
    private final List<ImageCheckResults> results;

    public ViewStackroxResultsAction(List<ImageCheckResults> results, Run<?, ?> build) {
        this.build = build;
        this.results = results;
    }

    public Run<?, ?> getBuild() {
        return build;
    }

    public List<ImageCheckResults> getResults() {
        return results;
    }

    @Override
    public String getIconFileName() {
        return Jenkins.RESOURCE_PATH + "/plugin/stackrox-container-image-scanner/images/sr-logo.png";
    }

    @Override
    public String getDisplayName() {
        return "StackRox Image Security Report";
    }

    @Override
    public String getUrlName() {
        return "stackrox-image-security-results";
    }
}
