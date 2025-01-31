package util

import groovy.transform.CompileStatic

@CompileStatic
class Config {
    static String getRoxEndpoint() {
        return getEnv("ROX_ENDPOINT")
    }

    static String getRoxPassword() {
        return getEnv("ROX_PASSWORD")
    }

    static String getEnv(String name) {
        String val = System.getenv(name)
        if (val == null) {
            throw new IllegalArgumentException(name + " is not specified!")
        }
        return val
    }
}
