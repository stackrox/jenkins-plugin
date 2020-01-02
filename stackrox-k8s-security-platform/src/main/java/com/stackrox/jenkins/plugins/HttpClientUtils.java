package com.stackrox.jenkins.plugins;

import javax.net.ssl.SSLContext;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContextBuilder;
import java.io.IOException;
import java.net.SocketException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class HttpClientUtils {
    //TODO: Create a client with tls verification turned on
    public static final int maxRetries = 3;

    public static CloseableHttpClient Get() throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        // use the TrustSelfSignedStrategy to allow Self Signed Certificates
        SSLContext sslContext = SSLContextBuilder
                .create()
                .loadTrustMaterial(new TrustSelfSignedStrategy())
                .build();

        // create an SSL Socket Factory to use the SSLContext with the trust self signed certificate strategy
        SSLConnectionSocketFactory connectionFactory = new SSLConnectionSocketFactory(sslContext);

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
}
