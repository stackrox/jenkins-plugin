package com.stackrox.jenkins.plugins;

import hudson.model.Action;
import hudson.model.Run;
import jenkins.model.Jenkins;
import java.util.List;

public class ViewStackroxResultsAction implements Action {
    private Run<?, ?> build;
    private List<ImageCheckResults> results;

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
        return Jenkins.RESOURCE_PATH + "/plugin/stackrox-k8s-security-platform/images/sr-logo.png";
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
