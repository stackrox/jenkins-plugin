package com.stackrox.jenkins.plugins.services;

import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.equalToJson;
import static com.github.tomakehurst.wiremock.client.WireMock.ok;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.serverError;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.util.List;

import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.google.common.collect.ImmutableList;

import com.stackrox.jenkins.plugins.data.ViolatedPolicy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DetectionServiceTest extends AbstractServiceTest {

    DetectionService detectionService;

    @BeforeEach
    void beforeEach() throws IOException {
        detectionService = new DetectionService(SERVER.baseUrl(), TOKEN, HttpClientUtils.get(false, null));
    }

    @Test
    public void shouldThrowOn500() throws IOException {
        SERVER.stubFor(postDetectBuild().willReturn(serverError()
                .withBodyFile("v1/detect/build/error.json")));

        detectionService = new DetectionService(SERVER.baseUrl(), TOKEN, HttpClientUtils.get(false, null));
        Exception exception = assertThrows(IOException.class, () -> detectionService.getPolicyViolations("nginx:latest"));
        String expected = "Failed build time detection request. Status code: 500. Error: ResponseEntityProxy{[Chunked: true]}";
        assertEquals(expected, exception.getMessage());
    }

    @Test
    public void shouldThrowWhenNoDataFor200() {
        SERVER.stubFor(postDetectBuild().willReturn(
                ok().withBody("{}")));
        assertThrows(NullPointerException.class, () -> detectionService.getPolicyViolations("nginx:latest"));
    }

    @Test
    public void shouldParseDataFromServer() throws IOException {
        SERVER.stubFor(postDetectBuild().willReturn(
                ok().withBodyFile("v1/detect/build/nginx.latest.json")));
        List<ViolatedPolicy> actual = detectionService.getPolicyViolations("nginx:latest");

        List<ViolatedPolicy> expected = ImmutableList.of(new ViolatedPolicy("Docker CIS 4.4: Ensure images are scanned and rebuilt to include security patches",
                        "Images should be scanned frequently for any vulnerabilities...",
                        "MEDIUM",
                        "Images should be re-built ensuring that the latest version of the base images are used..."),
                new ViolatedPolicy("Latest tag", "", "MEDIUM", ""));

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFailOnMissingData() throws IOException {
        SERVER.stubFor(postDetectBuild().willReturn(
                ok().withBodyFile("v1/detect/build/minimal.json")));
        List<ViolatedPolicy> actual = detectionService.getPolicyViolations("nginx:latest");

        List<ViolatedPolicy> expected = ImmutableList.of(new ViolatedPolicy(null, null, "LOW", null));

        assertEquals(expected, actual);
    }

    private MappingBuilder postDetectBuild() {
        return post(urlEqualTo("/v1/detect/build"))
                .withHeader("Authorization", equalTo("Bearer {some token}"))
                .withRequestBody(equalToJson("{\"imageName\" : \"nginx:latest\"}"));
    }

}
