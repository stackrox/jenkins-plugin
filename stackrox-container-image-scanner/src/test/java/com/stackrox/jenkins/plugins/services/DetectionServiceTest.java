package com.stackrox.jenkins.plugins.services;

import static com.github.tomakehurst.wiremock.client.WireMock.anyUrl;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.equalToJson;
import static com.github.tomakehurst.wiremock.client.WireMock.ok;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.serverError;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.stackrox.model.StorageEnforcementAction.FAIL_BUILD_ENFORCEMENT;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.google.common.collect.ImmutableList;

import com.stackrox.jenkins.plugins.data.PolicyViolation;
import com.stackrox.model.StorageEnforcementAction;
import com.stackrox.model.StoragePolicy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DetectionServiceTest extends AbstractServiceTest {

    private static final List<StorageEnforcementAction> FAIL_BUILD_ENFORCEMENTS = ImmutableList.of(FAIL_BUILD_ENFORCEMENT);


    DetectionService detectionService;

    @BeforeEach
    void beforeEach() {
        detectionService = new DetectionService(client);
    }

    @Test
    public void shouldThrowOn500() {
        MOCK_SERVER.stubFor(post(anyUrl()).willReturn(serverError()
                .withBodyFile("v1/detect/build/error.json")));

        Exception exception = assertThrows(IOException.class, () -> detectionService.getPolicyViolations("jenkins:lts"));
        String expected = "Failed build time detection request. Status code: 500. Error: image enrichment error: error getting metadata for image: docker.io/library/jenkins:lts errors: [error getting metadata from registry: \"Public DockerHub\": Failed to get the manifest digest : Head \"https://registry-1.docker.io/v2/library/jenkins/manifests/lts\": http: non-successful response (status=404 body=\"\"), error getting metadata from registry: \"Autogenerated https://registry-1.docker.io for cluster remote\": Failed to get the manifest digest : Head \"https://registry-1.docker.io/v2/library/jenkins/manifests/lts\": http: non-successful response (status=404 body=\"\")]";
        assertEquals(expected, exception.getMessage());
    }

    @Test
    public void shouldNotThrowWhenNoDataFor200() throws IOException {
        MOCK_SERVER.stubFor(postDetectBuild().willReturn(
                ok().withBody("{}")));
        List<PolicyViolation> violations = detectionService.getPolicyViolations("nginx:latest");
        assertEquals(0, violations.size());
    }

    @Test
    public void shouldNotFailOnMissingData() throws IOException {
        MOCK_SERVER.stubFor(postDetectBuild().willReturn(
                ok().withBodyFile("v1/detect/build/minimal.json")));
        List<PolicyViolation> actual = detectionService.getPolicyViolations("nginx:latest");

        List<PolicyViolation> expected = ImmutableList.of(new PolicyViolation(new StoragePolicy().enforcementActions(FAIL_BUILD_ENFORCEMENTS), ""));

        assertEquals(expected, actual);
    }

    @Test
    public void shouldJoinViolations() throws IOException {
        MOCK_SERVER.stubFor(postDetectBuild().willReturn(
                ok().withBodyFile("v1/detect/build/violations.json")));
        List<PolicyViolation> actual = detectionService.getPolicyViolations("nginx:latest");

        List<PolicyViolation> expected = ImmutableList.of(new PolicyViolation(new StoragePolicy().enforcementActions(Collections.emptyList()), "A - B - C"));

        assertEquals(expected, actual);
    }

    private MappingBuilder postDetectBuild() {
        return post(urlEqualTo("/v1/detect/build"))
                .withHeader("Authorization", equalTo("Bearer {some token}"))
                .withRequestBody(equalToJson("{\"imageName\" : \"nginx:latest\", \"policyCategories\" : [ ]}"));
    }

}
