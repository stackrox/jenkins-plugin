package com.stackrox.jenkins.plugins;

import com.stackrox.jenkins.plugins.data.ImageCheckResults;

import lombok.Data;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ViewStackroxResultsActionTest {
    @MethodSource
    @DisplayName("getUrl/DisplayName should return joined and escaped image names")
    @ParameterizedTest(name = "{0}")
    void getNameShouldReturnJoinedAndEscapedNames(TestCase tc) {
        ViewStackroxResultsAction action = new ViewStackroxResultsAction(tc.imageCheckResults, null);
        assertEquals(tc.getDisplayName(), action.getDisplayName());
        assertEquals(tc.getUrlName(), action.getUrlName());
    }

    @Data
    private static class TestCase {
        private final List<ImageCheckResults> imageCheckResults;
        private final String urlName;
        private final String displayName;

        TestCase(Stream<String> imageNames, String url, String displayName) {
            this.imageCheckResults = imageNames.map(
                    name -> new ImageCheckResults(name, Collections.emptyList(), Collections.emptyList())
            ).collect(Collectors.toList());
            this.urlName = "stackrox-image-security-results-" + url;
            this.displayName = "StackRox Report for " + displayName;
        }
    }

    private static Stream<TestCase> getNameShouldReturnJoinedAndEscapedNames() {
        return Stream.of(
                new TestCase(Stream.of(), "", ""),
                new TestCase(Stream.of(""), "", ""),
                new TestCase(Stream.of(" "), "%20", " "),
                new TestCase(Stream.of("nginx:latest"), "nginx_latest", "nginx:latest"),
                new TestCase(Stream.of("nginx:latest", "ubuntu:bionic"), "nginx_latest-ubuntu_bionic", "nginx:latest, ubuntu:bionic"),
                new TestCase(Stream.of("<html>", "<alert>", ""), "%3Chtml%3E-%3Calert%3E-", "<html>, <alert>, ")
        );
    }
}
