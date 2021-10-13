package com.stackrox.jenkins.plugins.services;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.net.ssl.SSLContext;

import com.google.common.base.Strings;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContextBuilder;

public class HttpClientUtils {
    //TODO: Create a client with tls verification turned on
    public static final int maxRetries = 3;

    public static CloseableHttpClient get(final boolean tlsVerify, final String caCertPEM) throws IOException {

        SSLConnectionSocketFactory connectionFactory = null;
        try {
            // use the TrustSelfSignedStrategy to allow Self Signed Certificates
            SSLContext sslContext = getSslContext(tlsVerify, caCertPEM);

            connectionFactory = new SSLConnectionSocketFactory(sslContext, SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException | KeyManagementException e) {
            throw new IOException(e);
        }

        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(60 * 1000) // 1 minute
                .setConnectionRequestTimeout(60 * 1000) // 1 minute
                .setSocketTimeout(10 * 60 * 1000) // 10 minutes
                .build();

        return HttpClients
                .custom()
                .setSSLSocketFactory(connectionFactory)
                .setDefaultRequestConfig(requestConfig)
                .setRetryHandler((IOException exception, int executionCount, HttpContext context) ->
                        executionCount <= maxRetries &&
                                exception instanceof SocketException
                )
                .build();
    }

    public static SSLContext getSslContext(boolean tlsVerify, String caCertPEM) throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException, KeyManagementException {
        SSLContext sslContext;

        if (tlsVerify && !Strings.isNullOrEmpty(caCertPEM)) {

            KeyStore keyStore = KeyStore.getInstance("pkcs12");
            keyStore.load(null, "".toCharArray());

            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            X509Certificate cert = (X509Certificate) cf.generateCertificate(new ByteArrayInputStream(caCertPEM.getBytes(StandardCharsets.UTF_8)));
            keyStore.setCertificateEntry("ca.crt", cert);

            sslContext = SSLContextBuilder
                    .create()
                    .loadTrustMaterial(keyStore, null)
                    .build();

        } else if (tlsVerify) {
            // Use default trust store to trust system root, caCertPEM is empty
            sslContext = SSLContextBuilder
                    .create()
                    .build();
        } else {
            sslContext = SSLContextBuilder
                    .create()
                    .loadTrustMaterial(new TrustSelfSignedStrategy())
                    .build();
        }
        return sslContext;
    }

    public static JsonObject getJsonObject(HttpEntity entity) throws IOException {
        try (InputStream contentStream = entity.getContent();
             JsonReader reader = Json.createReader(new BufferedReader(
                     new InputStreamReader(contentStream, StandardCharsets.UTF_8)))) {
            return reader.readObject();
        }
    }
}
