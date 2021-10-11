package com.stackrox.jenkins.plugins.services;

import com.github.tomakehurst.wiremock.WireMockServer;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.equalToJson;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import org.apache.http.HttpStatus;
import static org.apache.http.HttpStatus.SC_OK;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

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
        wireMockServer.stubFor(post(urlEqualTo("/v1/images/scan"))
                .withHeader("Authorization", equalTo("Bearer some token"))
                .withRequestBody(equalToJson("{\"imageName\" : \"jenkins:lts\",\"force\" : true}")
                ).willReturn(aResponse()
                        .withStatus(HttpStatus.SC_INTERNAL_SERVER_ERROR)
                        .withBody("{\"error\": \"some error\"}")));

        imageService = new ImageService(wireMockServer.baseUrl(), "some token", HttpClientUtils.get(false, null));
        Exception exception = assertThrows(IOException.class, () -> imageService.getImageScanResults("jenkins:lts"));
        String expected = "Failed image scan request. Status code: 500. Error: ResponseEntityProxy{[Chunked: true]}";
        assertEquals(expected, exception.getMessage());
    }

    @Test
    public void shouldThrowWhenNoDataFor200() throws IOException {
        wireMockServer.stubFor(post(urlEqualTo("/v1/images/scan"))
                .withHeader("Authorization", equalTo("Bearer some token"))
                .withRequestBody(equalToJson("{\"imageName\" : \"jenkins:lts\",\"force\" : true}")
                ).willReturn(aResponse().withStatus(SC_OK).withBody("{}")));
        imageService = new ImageService(wireMockServer.baseUrl(), "some token", HttpClientUtils.get(false, null));
        assertThrows(NullPointerException.class, () -> imageService.getImageScanResults("jenkins:lts"));
    }
}