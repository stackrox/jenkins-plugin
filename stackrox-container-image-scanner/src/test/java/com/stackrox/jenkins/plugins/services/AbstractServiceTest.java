package com.stackrox.jenkins.plugins.services;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

import java.io.IOException;

import com.github.tomakehurst.wiremock.WireMockServer;
import hudson.util.Secret;

import com.stackrox.invoker.ApiClient;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public abstract class AbstractServiceTest {
    protected static final Secret MOCK_TOKEN = Secret.fromString("{some token}");
    protected static final WireMockServer MOCK_SERVER = new WireMockServer(wireMockConfig().httpDisabled(true).dynamicHttpsPort());

    protected static ApiClient client;


    @BeforeAll
    static void setup() throws IOException {
        MOCK_SERVER.start();
        client = ApiClientFactory.newInsecureApiClient(MOCK_SERVER.baseUrl(), MOCK_TOKEN.getPlainText());
    }

    @AfterAll
    static void teardown() {
        MOCK_SERVER.stop();
    }

    @BeforeEach
    void reset() {
        MOCK_SERVER.resetAll();
    }
}
