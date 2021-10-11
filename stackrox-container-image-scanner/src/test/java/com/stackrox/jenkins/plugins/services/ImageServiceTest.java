package com.stackrox.jenkins.plugins.services;

import com.github.tomakehurst.wiremock.WireMockServer;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalToJson;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import com.stackrox.jenkins.plugins.report.ReportGenerator;
import hudson.AbortException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class ImageServiceTest {

    WireMockServer wireMockServer;
    ImageService imageService;

    @BeforeEach
    public void setup() {
        wireMockServer = new WireMockServer();
        wireMockServer.start();
        setupStub();
    }

    public void setupStub() {
        wireMockServer.stubFor(post(urlEqualTo("/v1/images/scan"))
                .withRequestBody(equalToJson("{\"imageName\" : \"jenkins:lts\",\"force\" : true}")
                ).willReturn(aResponse().withStatus(500).withBody("{\"error\": \"some error\"}")));
    }

    @Test
    public void shouldThrowOn500() throws IOException {
        imageService = new ImageService(wireMockServer.baseUrl(), "some token", HttpClientUtils.get(false, null));
        Exception exception = assertThrows(IOException.class, () -> imageService.getImageScanResults("jenkins:lts"));
        String expected = "Failed image scan request. Status code: 500. Error: ResponseEntityProxy{[Chunked: true]}";
        assertEquals(expected, exception.getMessage());
    }
}