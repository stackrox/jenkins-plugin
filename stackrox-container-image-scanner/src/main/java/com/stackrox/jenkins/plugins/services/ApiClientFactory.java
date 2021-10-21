package com.stackrox.jenkins.plugins.services;

import static com.stackrox.jenkins.plugins.services.ApiClientFactory.StackRoxTlsValidationMode.INSECURE_ACCEPT_ANY;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.time.Duration;
import java.util.concurrent.ExecutionException;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

import com.google.common.base.Objects;
import com.google.common.base.Strings;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import okhttp3.OkHttpClient;

import com.stackrox.invoker.ApiClient;

public class ApiClientFactory {

    public enum StackRoxTlsValidationMode {
        VALIDATE,
        INSECURE_ACCEPT_ANY
    }

    private static final Duration TIMEOUT = Duration.ofSeconds(30);
    private static final int MAXIMUM_CACHE_SIZE = 5; // arbitrary chosen as there are no data to support this decision

    private static class CacheKey {
        final private String caCert;
        final private StackRoxTlsValidationMode tlsValidationMode;

        private CacheKey(@Nullable String caCert, StackRoxTlsValidationMode tlsValidationMode) {
            this.caCert = caCert;
            this.tlsValidationMode = tlsValidationMode;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CacheKey cacheKey = (CacheKey) o;
            return Objects.equal(caCert, cacheKey.caCert) && tlsValidationMode == cacheKey.tlsValidationMode;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(caCert, tlsValidationMode);
        }
    }

    private static final LoadingCache<CacheKey, OkHttpClient> clientCache =
            CacheBuilder.newBuilder().maximumSize(MAXIMUM_CACHE_SIZE).build(
                    new CacheLoader<CacheKey, OkHttpClient>() {
                        @Override
                        public OkHttpClient load(@Nonnull CacheKey key) throws IOException {
                            return newHttpClient(key.tlsValidationMode, key.caCert);
                        }
                    });


    public static ApiClient newApiClient(String basePath, String apiKey, @Nullable String caCert, StackRoxTlsValidationMode tlsValidationMode) throws IOException {
        OkHttpClient client = getClient(tlsValidationMode, caCert);
        ApiClient apiClient = new ApiClient(client);
        apiClient.setBearerToken(apiKey);
        apiClient.setBasePath(basePath);
        return apiClient;
    }

    @Nonnull
    static OkHttpClient getClient(StackRoxTlsValidationMode tlsValidationMode, @Nullable String caCert) throws IOException {
        try {
            return clientCache.get(new CacheKey(caCert, tlsValidationMode));
        } catch (ExecutionException e) {
            throw new IOException("Could not get HTTP client from cache", e);
        }
    }

    @Nonnull
    private static OkHttpClient newHttpClient(StackRoxTlsValidationMode tlsValidationMode, @Nullable String caCert) throws IOException {
        OkHttpClient.Builder builder;
        try {
            if (tlsValidationMode == INSECURE_ACCEPT_ANY) {
                builder = getUnsafeBuilder();
            } else {
                if (Strings.isNullOrEmpty(caCert)) {
                    builder = new OkHttpClient().newBuilder();
                } else {
                    builder = getSecureBuilder(caCert);
                }
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
        SSLContext sslContext = getSslContext(trustAllCerts);
        // Create an ssl socket factory with our all-trusting manager
        SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.sslSocketFactory(sslSocketFactory, (X509TrustManager) trustAllCerts[0]);
        builder.hostnameVerifier((hostname, session) -> true);

        return builder;
    }

    private static OkHttpClient.Builder getSecureBuilder(@Nonnull String caCertPEM) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("pkcs12");
        keyStore.load(null, "".toCharArray());

        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        X509Certificate cert = (X509Certificate) cf.generateCertificate(new ByteArrayInputStream(caCertPEM.getBytes(StandardCharsets.UTF_8)));
        keyStore.setCertificateEntry("ca.crt", cert);

        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        SSLContext sslContext = getSslContext(trustManagers);

        return new OkHttpClient.Builder()
                .sslSocketFactory(sslContext.getSocketFactory(), (X509TrustManager) trustManagers[0]);
    }

    @Nonnull
    private static SSLContext getSslContext(TrustManager[] trustAllCerts) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, trustAllCerts, null);
        return sslContext;
    }
}
