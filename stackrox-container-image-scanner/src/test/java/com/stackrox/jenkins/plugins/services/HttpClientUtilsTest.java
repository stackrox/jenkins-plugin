package com.stackrox.jenkins.plugins.services;

import static com.github.tomakehurst.wiremock.client.WireMock.anyUrl;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.ok;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import javax.json.JsonObject;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.apache.commons.io.FileUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class HttpClientUtilsTest {

    private final static String KEY_STORE_PATH = Paths.get("src", "test", "resources", "cert", "selfsigned.jks").toString();
    private final static String KEY_STORE_PASSWORD = "password";

    private final static WireMockServer SERVER = new WireMockServer(wireMockConfig().httpDisabled(true)
            .dynamicHttpsPort().keystorePath(KEY_STORE_PATH).keystorePassword(KEY_STORE_PASSWORD));

    @BeforeAll
    static void beforeAll() {
        SERVER.stubFor(get(anyUrl()).willReturn(ok().withBody("{}")));
        SERVER.start();
    }

    @AfterAll
    static void cleanup() {
        SERVER.stop();
    }

    @DisplayName("HTTPS should work when")
    @ParameterizedTest(name = "tlsVerify: {0} and custom PEM: {1}")
    @CsvSource({"true,true", "false,true", "false,false"})
    void shouldWorkWithProperlyConfiguredTLS(boolean tlsVerify, boolean useCaCert) throws IOException {
        File caPemFile = Paths.get("src", "test", "resources", "cert", "client.pem").toFile();
        String caPem = useCaCert ? FileUtils.readFileToString(caPemFile, StandardCharsets.UTF_8) : null;

        CloseableHttpClient closeableHttpClient = HttpClientUtils.get(tlsVerify, caPem);

        HttpGet req = new HttpGet(SERVER.baseUrl());
        CloseableHttpResponse response = closeableHttpClient.execute(req);
        JsonObject jsonObject = HttpClientUtils.getJsonObject(response.getEntity());

        assertEquals("{}", jsonObject.toString());
    }

    @Test
    @DisplayName("TLS should FAIL when tlsVerify: true and custom PEM: false")
    void shouldThrowWhenTLSCouldNotBeVerified() throws IOException {
        CloseableHttpClient closeableHttpClient = HttpClientUtils.get(true, null);

        HttpGet req = new HttpGet(SERVER.baseUrl());
        Exception exception = assertThrows(IOException.class, () -> closeableHttpClient.execute(req));

        String expected = "PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target";
        assertEquals(expected, exception.getMessage());
    }
}
