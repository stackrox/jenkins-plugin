package util

import groovy.transform.CompileStatic

@CompileStatic
class Env {
    private static final Map<String, String> DEFAULT_VALUES = [
            "API_HOSTNAME": "localhost",
            "API_PORT"    : "8000",
            "ROX_USERNAME": "admin",
    ]

    private static final Env INSTANCE = new Env()

    private final Properties envVars = new Properties()

    private Env() {
        envVars.putAll(System.getenv())
        assignFallbackValues()
    }

    protected String mustGetInternal(String key) {
        def value = envVars.get(key)
        if (value == null) {
            throw new RuntimeException("No value assigned for required key ${key}")
        }
        return value
    }

    private void assignFallbackValues() {
        for (def entry : DEFAULT_VALUES.entrySet()) {
            if (isEnvVarEmpty(entry.key)) {
                envVars.put(entry.key, entry.value)
            }
        }

        if (isEnvVarEmpty("ROX_PASSWORD")) {
            String password
            try {
                def cluster = envVars.getOrDefault("CLUSTER", "k8s").toString().toLowerCase()
                def passwordPath = "../../rox/deploy/${cluster}/central-deploy/password"
                BufferedReader br = new BufferedReader(new FileReader(passwordPath))
                password = br.readLine()
            } catch (Exception ex) {
                throw new RuntimeException("Failed to load password for current deployment", ex)
            }

            if (password != null) {
                envVars.put("ROX_PASSWORD", password)
            }
        }
    }

    protected boolean isEnvVarEmpty(String key) {
        return (envVars.get(key) ?: "null") == "null"
    }

    static String mustGet(String key) {
        return INSTANCE.mustGetInternal(key)
    }

    static String mustGetUsername() {
        return mustGet("ROX_USERNAME")
    }

    static String mustGetPassword() {
        return mustGet("ROX_PASSWORD")
    }

    static int mustGetPort() {
        String portString = mustGet("API_PORT")
        int port
        try {
            port = Integer.parseInt(portString)
        } catch (NumberFormatException e) {
            throw new RuntimeException("API_PORT " + portString + " is not a valid number ", e)
        }
        return port
    }

    static String mustGetHostname() {
        return mustGet("API_HOSTNAME")
    }

    static String mustGetKeystorePath() {
        return mustGet("KEYSTORE_PATH")
    }
}

