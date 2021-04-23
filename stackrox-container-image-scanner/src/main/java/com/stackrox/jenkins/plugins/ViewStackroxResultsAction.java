package com.stackrox.jenkins.plugins;

import hudson.model.Action;
import hudson.model.Run;
import jenkins.model.Jenkins;
import java.util.List;

public class ViewStackroxResultsAction implements Action {
    private Run<?, ?> build;
    private List<ImageCheckResults> results;
    private String runTimesamp;

    public ViewStackroxResultsAction(List<ImageCheckResults> results, String runTimestamp, Run<?, ?> build) {
        this.build = build;
        this.results = results;
        this.runTimesamp = runTimestamp;
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
        return String.format("stackrox-image-security-results-%s", runTimesamp);
    }
}
