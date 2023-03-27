package com.stackrox.jenkins.plugins.services;

import static com.github.tomakehurst.wiremock.client.WireMock.anyUrl;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.equalToJson;
import static com.github.tomakehurst.wiremock.client.WireMock.ok;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.serverError;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.stackrox.model.StorageEmbeddedVulnerabilityScoreVersion.V2;
import static com.stackrox.model.StorageEmbeddedVulnerabilityScoreVersion.V3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.google.common.collect.ImmutableList;

import com.stackrox.jenkins.plugins.data.CVE;
import com.stackrox.model.StorageEmbeddedVulnerability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ImageServiceTest extends AbstractServiceTest {

    private ImageService imageService;

    @BeforeEach
    void beforeEach() {
        imageService = new ImageService(client);
    }

    @Test
    public void shouldThrowOn500() {
        MOCK_SERVER.stubFor(post(anyUrl()).willReturn(serverError()
                .withBodyFile("v1/images/scan/error.json")));

        Exception exception = assertThrows(IOException.class, () -> imageService.getImageScanResults("jenkins:lts"));
        String expected = "Failed image scan request. Status code: 500. Error" +
                ": image enrichment error" +
                ": error getting metadata for image: docker.io/library/jenkins:lts errors" +
                ": [error getting metadata from registry: \"Public DockerHub\"" +
                ": Failed to get the manifest digest : Head \"https://registry-1.docker.io/v2/library/jenkins/manifests/lts\"" +
                ": http: non-successful response (status=404 body=\"\"), error getting metadata from registry" +
                ": \"Autogenerated https://registry-1.docker.io for cluster remote\"" +
                ": Failed to get the manifest digest : Head \"https://registry-1.docker.io/v2/library/jenkins/manifests/lts\"" +
                ": http: non-successful response (status=404 body=\"\")]";
        assertEquals(expected, exception.getMessage());
    }

    @Test
    public void shouldThrowWhenNoDataFor200() throws IOException {
        MOCK_SERVER.stubFor(postImagesScan().willReturn(
                ok().withBody("{}")));
        Exception exception = assertThrows(NullPointerException.class, () -> imageService.getImageScanResults("nginx:latest"));
        assertEquals("Did not get scan results from StackRox", exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"minimal.json", "minimal-with-names.json", "minimal-with-unknown-fields.json"})
    public void shouldNotFailOnMissingData(String file) throws IOException {
        MOCK_SERVER.stubFor(postImagesScan().willReturn(
                ok().withBodyFile("v1/images/scan/" + file)));
        List<CVE> actual = imageService.getImageScanResults("nginx:latest");
        ImmutableList<CVE> expected = ImmutableList.of(
                new CVE(null, null, new StorageEmbeddedVulnerability()
                        .cve("CVE-MISSING-DATA")
                        .scoreVersion(V2))
        );
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFailOnUnknownEnumValue() throws IOException {
        MOCK_SERVER.stubFor(postImagesScan().willReturn(
                ok().withBodyFile("v1/images/scan/unknown-enum.json")));
        List<CVE> actual = imageService.getImageScanResults("nginx:latest");
        ImmutableList<CVE> expected = ImmutableList.of(
                new CVE(null, null, new StorageEmbeddedVulnerability()
                        .cve("CVE-MISSING-DATA")
                        .scoreVersion(V2))
        );
        assertEquals(expected, actual);
    }

    private MappingBuilder postImagesScan() {
        return post(urlEqualTo("/v1/images/scan"))
                .withHeader("Authorization", equalTo("Bearer {some token}"))
                .withRequestBody(equalToJson("{\"imageName\" : \"nginx:latest\",\"force\" : true}"));
    }
}
