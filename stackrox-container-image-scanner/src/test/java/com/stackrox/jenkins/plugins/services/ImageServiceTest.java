package com.stackrox.jenkins.plugins.services;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.equalToJson;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.apache.http.HttpStatus.SC_OK;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.util.List;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.google.common.collect.ImmutableList;
import org.apache.http.HttpStatus;

import com.stackrox.jenkins.plugins.data.CVE;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ImageServiceTest {

    static WireMockServer wireMockServer;
    ImageService imageService;

    @BeforeAll
    static void setup() {
        wireMockServer = new WireMockServer(wireMockConfig().httpDisabled(true).dynamicHttpsPort());
        wireMockServer.start();
    }

    @AfterEach
    void afterEach() {
        wireMockServer.resetAll();
    }

    @Test
    public void shouldThrowOn500() throws IOException {
        wireMockServer.stubFor(postImagesScan().willReturn(aResponse()
                .withStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR)
                .withBodyFile("v1/images/scan/error.json")));

        imageService = new ImageService(wireMockServer.baseUrl(), "some token", HttpClientUtils.get(false, null));
        Exception exception = assertThrows(IOException.class, () -> imageService.getImageScanResults("nginx:latest"));
        String expected = "Failed image scan request. Status code: 500. Error: ResponseEntityProxy{[Chunked: true]}";
        assertEquals(expected, exception.getMessage());
    }

    @Test
    public void shouldThrowWhenNoDataFor200() throws IOException {
        wireMockServer.stubFor(postImagesScan().willReturn(
                aResponse().withStatus(SC_OK).withBody("{}")));
        imageService = new ImageService(wireMockServer.baseUrl(), "some token", HttpClientUtils.get(false, null));
        assertThrows(NullPointerException.class, () -> imageService.getImageScanResults("nginx:latest"));
    }

    @Test
    public void shouldParseDataFromServer() throws IOException {
        wireMockServer.stubFor(postImagesScan().willReturn(
                aResponse().withStatus(SC_OK).withBodyFile("v1/images/scan/nginx.latest.json")));
        imageService = new ImageService(wireMockServer.baseUrl(), "some token", HttpClientUtils.get(false, null));
        List<CVE> actual = imageService.getImageScanResults("nginx:latest");
        ImmutableList<CVE> expected = ImmutableList.of(
                CVE.Builder.newInstance().withId("CVE-2007-6755")
                        .withCvssScore(5.8F)
                        .withScoreType("V2")
                        .withPublishDate("2013-10-11T22:55:00Z")
                        .inPackage("openssl")
                        .inVersion("1.1.1d-0+deb10u7")
                        .isFixable(false)
                        .withLink("https://security-tracker.debian.org/tracker/CVE-2007-6755")
                        .build(),
                CVE.Builder.newInstance().withId("CVE-2010-0928")
                        .withCvssScore(4.0F)
                        .withScoreType("V2")
                        .withPublishDate("2010-03-05T19:30:00Z")
                        .inPackage("openssl")
                        .inVersion("1.1.1d-0+deb10u7")
                        .isFixable(false)
                        .withLink("https://security-tracker.debian.org/tracker/CVE-2010-0928")
                        .build(),
                CVE.Builder.newInstance().withId("CVE-2019-9893")
                        .withCvssScore(9.8F)
                        .withScoreType("V3")
                        .withPublishDate("2019-03-21T16:01:00Z")
                        .inPackage("libseccomp")
                        .inVersion("2.3.3-4")
                        .isFixable(true)
                        .withLink("https://security-tracker.debian.org/tracker/CVE-2019-9893")
                        .build());
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFailOnMissingData() throws IOException {
        wireMockServer.stubFor(postImagesScan().willReturn(
                aResponse().withStatus(SC_OK).withBodyFile("v1/images/scan/minimal.json")));
        imageService = new ImageService(wireMockServer.baseUrl(), "some token", HttpClientUtils.get(false, null));
        List<CVE> actual = imageService.getImageScanResults("nginx:latest");
        ImmutableList<CVE> expected = ImmutableList.of(
                CVE.Builder.newInstance().withId("CVE-MISSING-DATA")
                        .withCvssScore(0)
                        .isFixable(false)
                        .build());
        assertEquals(expected, actual);
    }

    private MappingBuilder postImagesScan() {
        return post(urlEqualTo("/v1/images/scan"))
                .withHeader("Authorization", equalTo("Bearer some token"))
                .withRequestBody(equalToJson("{\"imageName\" : \"nginx:latest\",\"force\" : true}"));
    }
}
