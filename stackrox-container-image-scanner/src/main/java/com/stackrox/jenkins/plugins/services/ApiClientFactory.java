package com.stackrox.jenkins.plugins.services;

import com.google.common.base.Strings;

import com.stackrox.invoker.ApiClient;

import okhttp3.OkHttpClient;

import javax.annotation.Nonnull;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.time.Duration;

public class ApiClientFactory {

    private static final Duration TIMEOUT = Duration.ofSeconds(30);

    public static ApiClient newApiClient(String basePath, String apiKey, String caCert, boolean insecure) throws IOException {
        OkHttpClient client = newHttpClient(insecure, caCert);
        ApiClient apiClient = new ApiClient(client);
        apiClient.setBearerToken(apiKey);
        apiClient.setBasePath(basePath);
        return apiClient;
    }

    static ApiClient newInsecureApiClient(String basePath, String apiKey) throws IOException {
        return newApiClient(basePath, apiKey, "", true);
    }

    @Nonnull
    public static OkHttpClient newHttpClient(boolean insecure, String caCert) throws IOException {
        OkHttpClient.Builder builder;
        try {
            if (insecure) {
                builder = getUnsafeBuilder();
            } else {
                builder = getSecureBuilder(caCert);
            }
        } catch (Exception e) {
            throw new IOException("Could not load certificate", e);
        }
        builder.retryOnConnectionFailure(true);
        builder.connectTimeout(TIMEOUT);
        builder.readTimeout(TIMEOUT);
        builder.writeTimeout(TIMEOUT);
        return builder.build();
    }

    /*
     * @link https://stackoverflow.com/a/25992879
     */
    private static OkHttpClient.Builder getUnsafeBuilder() throws KeyManagementException, NoSuchAlgorithmException {
        // Create a trust manager that does not validate certificate chains
        final TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    @Override
                    public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                    }

                    @Override
                    public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                    }

                    @Override
                    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                        return new java.security.cert.X509Certificate[]{};
                    }
                }
        };

        // Install the all-trusting trust manager
        final SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
        // Create an ssl socket factory with our all-trusting manager
        final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.sslSocketFactory(sslSocketFactory, (X509TrustManager) trustAllCerts[0]);
        builder.hostnameVerifier((hostname, session) -> true);

        return builder;
    }

    private static OkHttpClient.Builder getSecureBuilder(String caCertPEM) throws Exception {
        if (Strings.isNullOrEmpty(caCertPEM)) {
            return new OkHttpClient().newBuilder();
        }

        KeyStore keyStore = KeyStore.getInstance("pkcs12");
        keyStore.load(null, "".toCharArray());

        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        X509Certificate cert = (X509Certificate) cf.generateCertificate(new ByteArrayInputStream(caCertPEM.getBytes(StandardCharsets.UTF_8)));
        keyStore.setCertificateEntry("ca.crt", cert);

        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, trustManagers, null);


        return new OkHttpClient.Builder()
                .sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) trustManagers[0]);
    }
}
