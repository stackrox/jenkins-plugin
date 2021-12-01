package com.stackrox.jenkins.plugins;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import hudson.model.Action;
import hudson.model.Run;
import jenkins.model.Jenkins;
import lombok.Data;

import com.stackrox.jenkins.plugins.data.ImageCheckResults;

@Data
public class ViewStackroxResultsAction implements Action {
    private final List<ImageCheckResults> results;
    private final Run<?, ?> build;

    @Override
    public String getIconFileName() {
        return Jenkins.RESOURCE_PATH + "/plugin/stackrox-container-image-scanner/images/sr-logo.png";
    }

    @Override
    public String getDisplayName() {
        return "StackRox Report for " + getNames().collect(Collectors.joining(", "));
    }

    @Override
    public String getUrlName() {
        String images = getNames().collect(Collectors.joining("-"));
        return String.format("stackrox-image-security-results-%08x", images.hashCode());
    }

    private Stream<String> getNames() {
        return getResults()
                .stream()
                .map(ImageCheckResults::getImageName);
    }
}
