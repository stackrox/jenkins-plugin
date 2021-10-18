import java.security.KeyManagementException
import java.security.NoSuchAlgorithmException
import java.security.SecureRandom
import java.security.cert.X509Certificate
import javax.net.ssl.HostnameVerifier
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSession
import javax.net.ssl.SSLSocketFactory
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

// https://futurestud.io/tutorials/retrofit-2-how-to-trust-unsafe-ssl-certificates-self-signed-expired
class UnsafeOkHttpClient {
    static OkHttpClient getUnsafeOkHttpClient() throws KeyManagementException, NoSuchAlgorithmException {
        // Create a trust manager that does not validate certificate chains
        final TrustManager[] trustAllCerts = [new X509TrustManager() {
            @Override
            void checkClientTrusted(X509Certificate[] chain, String authType) { }

            @Override
            void checkServerTrusted(X509Certificate[] chain, String authType) { }

            @Override
            X509Certificate[] getAcceptedIssuers() {
                return []
            }
        }]

        // Install the all-trusting trust manager
        final SSLContext sslContext = SSLContext.getInstance("SSL")
        sslContext.init(null, trustAllCerts, null)

        // Create an ssl socket factory with our all-trusting manager
        final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory()

        OkHttpClient.Builder builder = new OkHttpClient.Builder()
        builder.sslSocketFactory(sslSocketFactory, (X509TrustManager) trustAllCerts[0])
        builder.hostnameVerifier(new HostnameVerifier() {
            @Override
            boolean verify(String hostname, SSLSession session) {
                return true
            }
        })

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC)
        builder.addInterceptor(logging)

        return builder.build()
    }
}
