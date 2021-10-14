package com.stackrox.jenkins.plugins.services;

import com.github.tomakehurst.wiremock.WireMockServer;
import hudson.util.Secret;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

public abstract class AbstractServiceTest {
    protected static final Secret TOKEN = Secret.fromString("{some token}");
    protected static final WireMockServer SERVER = new WireMockServer(wireMockConfig().httpDisabled(true).dynamicHttpsPort());

    @BeforeAll
    static void setup() {
        SERVER.start();
    }

    @AfterAll
    static void teardown() {
        SERVER.stop();
    }

    @BeforeEach
    void reset() {
        SERVER.resetAll();
    }
}
