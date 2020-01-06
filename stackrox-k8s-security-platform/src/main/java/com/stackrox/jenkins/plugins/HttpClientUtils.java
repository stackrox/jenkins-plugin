package com.stackrox.jenkins.plugins;

import com.google.common.base.Strings;
import javax.net.ssl.SSLContext;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContextBuilder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.SocketException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class HttpClientUtils {
    //TODO: Create a client with tls verification turned on
    public static final int maxRetries = 3;

    public static CloseableHttpClient Get(final boolean tlsVerify, final String caCertPEM) throws IOException {
        try {
            // use the TrustSelfSignedStrategy to allow Self Signed Certificates
            SSLContext sslContext;

            if (tlsVerify && !Strings.isNullOrEmpty(caCertPEM)) {

                KeyStore keyStore = KeyStore.getInstance("pkcs12");
                keyStore.load(null, "".toCharArray());

                CertificateFactory cf = CertificateFactory.getInstance("X.509");
                X509Certificate cert = (X509Certificate) cf.generateCertificate(new ByteArrayInputStream(caCertPEM.getBytes()));
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

            SSLConnectionSocketFactory connectionFactory = new SSLConnectionSocketFactory(sslContext, SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

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
        } catch (KeyStoreException | CertificateException | IOException | NoSuchAlgorithmException | KeyManagementException e) {
            throw new IOException(e);
        }
    }
}
