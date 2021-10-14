package com.stackrox.jenkins.plugins.services;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.anyUrl;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

import com.github.tomakehurst.wiremock.WireMockServer;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpStatus;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ApiClientFactoryTest {

    private final static String KEY_STORE_PATH = Paths.get("src", "test", "resources", "cert", "localhost.jks").toString();
    private final static String KEY_STORE_PASSWORD = "password";

    private final static WireMockServer SERVER = new WireMockServer(wireMockConfig().httpDisabled(true)
            .dynamicHttpsPort().keystorePath(KEY_STORE_PATH).keystorePassword(KEY_STORE_PASSWORD));

    @BeforeAll
    static void beforeAll() {
        SERVER.stubFor(get(anyUrl()).willReturn(aResponse().withStatus(HttpStatus.SC_OK).withBody("{}")));
        SERVER.start();
    }

    @AfterAll
    static void cleanup() {
        SERVER.stop();
    }

    @DisplayName("TLS should work when")
    @ParameterizedTest(name = "tlsVerify: {0} and custom PEM: {1}")
    @CsvSource({"true,true", "false,true", "false,false"})
    void shouldBeAbleT(boolean tlsVerify, boolean caCert) throws IOException {
        File clientPem = Paths.get("src", "test", "resources", "cert", "localhost.pem").toFile();
        String pem = caCert ? FileUtils.readFileToString(clientPem, StandardCharsets.UTF_8) : null;

        OkHttpClient client = ApiClientFactory.newHttpClient(!tlsVerify, pem);

        Request request = new Request.Builder().url(SERVER.baseUrl()).build();
        Response response = client.newCall(request).execute();

        assertEquals(200, response.code());
    }

    @Test
    @DisplayName("TLS should FAIL when tlsVerify: true and custom PEM: false")
    void shouldThrowWhenTLSCouldNotBeVerified() throws IOException {
        OkHttpClient client = ApiClientFactory.newHttpClient(false, "");

        Request request = new Request.Builder().url(SERVER.baseUrl()).build();
        Exception exception = assertThrows(IOException.class, () -> client.newCall(request).execute());

        String expected = "PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target";
        assertEquals(expected, exception.getMessage());
    }

    @Test
    @DisplayName("TLS should FAIL when tlsVerify: true and custom PEM has wrong host")
    void shouldThrowWhenHostIsInvalid() throws IOException {
        String keyStorePath = Paths.get("src", "test", "resources", "cert", "selfsigned.jks").toString();
        File clientPem = Paths.get("src", "test", "resources", "cert", "client.pem").toFile();
        String pem = FileUtils.readFileToString(clientPem, StandardCharsets.UTF_8);

        WireMockServer server = new WireMockServer(wireMockConfig().httpDisabled(true)
                .dynamicHttpsPort().keystorePath(keyStorePath).keystorePassword(KEY_STORE_PASSWORD));
        server.stubFor(get(anyUrl()).willReturn(aResponse().withStatus(HttpStatus.SC_OK).withBody("{}")));
        server.start();

        OkHttpClient client = ApiClientFactory.newHttpClient(false, pem);

        Request request = new Request.Builder().url(server.baseUrl()).build();
        Exception exception = assertThrows(IOException.class, () -> client.newCall(request).execute());

        String expected = "Hostname localhost not verified:\n" +
                "    certificate: sha256/k5KiOTIJ3InAOqA6c35wu9YcIUC5TrMry7hvl/6Jn+E=\n" +
                "    DN: CN=test, OU=Unknown, O=Unknown, L=Unknown, ST=Unknown, C=Unknown\n" +
                "    subjectAltNames: []";
        assertEquals(expected, exception.getMessage());
    }
}
