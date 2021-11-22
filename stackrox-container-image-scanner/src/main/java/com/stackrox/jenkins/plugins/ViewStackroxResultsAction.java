package com.stackrox.jenkins.plugins;

import com.google.common.net.UrlEscapers;

import com.stackrox.jenkins.plugins.data.ImageCheckResults;

import hudson.model.Action;
import hudson.model.Run;
import jenkins.model.Jenkins;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        String images = getNames()
                .map(s -> s.replace(":", "_"))
                .collect(Collectors.joining("-"));
        return UrlEscapers.urlFragmentEscaper().escape("stackrox-image-security-results-" + images);
    }

    private Stream<String> getNames() {
        return getResults()
                .stream()
                .map(ImageCheckResults::getImageName);
    }
}
