package util

import java.security.KeyStore
import javax.net.ssl.KeyManagerFactory
import javax.net.ssl.TrustManagerFactory

class Keys {

    static KeyManagerFactory keyManagerFactory() {
        def keyStore = KeyStore.getInstance("PKCS12")
        keyStore.load(new FileInputStream(Env.mustGetKeystorePath()), "".toCharArray())

        def kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm())
        kmf.init(keyStore, "".toCharArray())
        return kmf
    }
}
