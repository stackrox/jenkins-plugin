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
                new TestCase(Stream.of(), "da39a3ee5e6b4b0d3255bfef95601890afd80709", ""),
                new TestCase(Stream.of(""), "da39a3ee5e6b4b0d3255bfef95601890afd80709", ""),
                new TestCase(Stream.of(" "), "b858cb282617fb0956d960215c8e84d1ccf909c6", " "),
                new TestCase(Stream.of("nginx:latest"), "e021805d28895ba97695d3db7563b11c2766f3b3", "nginx:latest"),
                new TestCase(Stream.of("nginx:latest", "ubuntu:bionic"), "dfdfc828833c2b2e77f4bf9068cfa72d36ee65a4", "nginx:latest, ubuntu:bionic"),
                new TestCase(Stream.of("ubuntu:bionic", "nginx:latest"), "e4358c9bd0ac3e446d4df99e4d49333cd595c280", "ubuntu:bionic, nginx:latest"),
                new TestCase(Stream.of("<html>", "<alert>", ""), "f7b8ceff87bcbfe1ad536aae577d3266a50c47d9", "<html>, <alert>, ")
        );
    }
}
