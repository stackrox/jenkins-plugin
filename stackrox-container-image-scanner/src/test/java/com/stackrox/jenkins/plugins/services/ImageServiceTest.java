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
import java.util.List;

import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.google.common.collect.ImmutableList;
import org.threeten.bp.OffsetDateTime;

import com.stackrox.jenkins.plugins.data.CVE;
import com.stackrox.model.StorageEmbeddedVulnerability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

        Exception exception = assertThrows(IOException.class, () -> imageService.getImageScanResults("nginx:latest"));
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
    public void shouldNotThrowWhenNoDataFor200() throws IOException {
        MOCK_SERVER.stubFor(postImagesScan().willReturn(
                ok().withBody("{}")));
        List<CVE> imageScanResults = imageService.getImageScanResults("nginx:latest");
        assertEquals(0, imageScanResults.size());
    }

    @Test
    public void shouldParseDataFromServer() throws IOException {
        MOCK_SERVER.stubFor(postImagesScan().willReturn(
                ok().withBodyFile("v1/images/scan/nginx.latest.json")));
        List<CVE> actual = imageService.getImageScanResults("nginx:latest");
        ImmutableList<CVE> expected = ImmutableList.of(
                new CVE("openssl", "1.1.1d-0+deb10u7", new StorageEmbeddedVulnerability()
                        .cve("CVE-2007-6755")
                        .cvss(5.8F)
                        .scoreVersion(V2)
                        .fixedBy("")
                        .publishedOn(OffsetDateTime.parse("2013-10-11T22:55:00Z"))
                        .link("https://security-tracker.debian.org/tracker/CVE-2007-6755")),
                new CVE("openssl", "1.1.1d-0+deb10u7", new StorageEmbeddedVulnerability()
                        .cve("CVE-2010-0928")
                        .cvss(4.0F)
                        .scoreVersion(V2)
                        .fixedBy("")
                        .publishedOn(OffsetDateTime.parse("2010-03-05T19:30:00Z"))
                        .link("https://security-tracker.debian.org/tracker/CVE-2010-0928")),
                new CVE("libseccomp", "2.3.3-4", new StorageEmbeddedVulnerability()
                        .cve("CVE-2019-9893")
                        .cvss(9.8F)
                        .scoreVersion(V3)
                        .publishedOn(OffsetDateTime.parse("2019-03-21T16:01:00Z"))
                        .fixedBy("2.3.3-5")
                        .link("https://security-tracker.debian.org/tracker/CVE-2019-9893"))
        );
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFailOnMissingData() throws IOException {
        MOCK_SERVER.stubFor(postImagesScan().willReturn(
                ok().withBodyFile("v1/images/scan/minimal.json")));
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
