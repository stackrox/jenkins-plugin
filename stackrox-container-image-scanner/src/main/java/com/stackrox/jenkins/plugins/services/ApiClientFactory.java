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

import com.google.common.base.Strings;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import hudson.PluginWrapper;
import jenkins.model.Jenkins;
import lombok.Data;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

import com.stackrox.invoker.ApiClient;

import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

public class ApiClientFactory {

    public enum StackRoxTlsValidationMode {
        VALIDATE,
        INSECURE_ACCEPT_ANY
    }

    private static final Duration TIMEOUT = Duration.ofSeconds(30);
    private static final int MAXIMUM_CACHE_SIZE = 5; // arbitrary chosen as there are no data to support this decision

    @Data
    private static class CacheKey {
        private final String caCert;
        private final StackRoxTlsValidationMode tlsValidationMode;
    }

    // It is good practice to avoid creating OkHttpClient on each request.
    // In our case it is parameterized by tlsValidationMode and caCert settings
    // that are configured externally, therefore we can't just store one OkHttpClient
    // in a static variable and have to use a cache.
    private static final LoadingCache<CacheKey, OkHttpClient> CLIENT_CACHE =
            CacheBuilder.newBuilder().maximumSize(MAXIMUM_CACHE_SIZE).build(
                    new CacheLoader<CacheKey, OkHttpClient>() {
                        @Override
                        public OkHttpClient load(@Nonnull CacheKey key) throws IOException {
                            return newHttpClient(key.caCert, key.tlsValidationMode);
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
            return CLIENT_CACHE.get(new CacheKey(caCert, tlsValidationMode));
        } catch (ExecutionException e) {
            throw new IOException("Could not get HTTP client from cache", e);
        }
    }

    @Nonnull
    private static OkHttpClient newHttpClient(@Nullable String caCert, StackRoxTlsValidationMode tlsValidationMode) throws IOException {
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
        builder.addNetworkInterceptor(new UserAgentInterceptor());
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
    private static SSLContext getSslContext(TrustManager[] trustManagers) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, trustManagers, null);
        return sslContext;
    }

    public static class UserAgentInterceptor implements Interceptor {
        private static final String STACKROX_CONTAINER_IMAGE_SCANNER = "stackrox-container-image-scanner";
        private static final String VALUE = String.format("%s%s (%s; %s) %s",
                STACKROX_CONTAINER_IMAGE_SCANNER,
                getVersion(),
                System.getProperty("os.name"),
                System.getProperty("os.arch"),
                "CI"
        );

        @NotNull
        @Override
        public Response intercept(@NotNull Chain chain) throws IOException {
            return chain.proceed(
                    chain.request()
                            .newBuilder()
                            .header("User-Agent", VALUE)
                            .build()
            );
        }

        static String getVersion() {
            Jenkins jenkins = Jenkins.getInstanceOrNull();
            if (jenkins == null) {
                return "";
            }

            PluginWrapper plugin = jenkins.pluginManager.getPlugin(STACKROX_CONTAINER_IMAGE_SCANNER);
            if (plugin == null) {
                return "";
            }
            return String.format("/%s:%s", plugin.getVersion(), Jenkins.getVersion()).replaceAll("\\s+", "_");
        }
    }
}
