import spock.lang.Specification

class BaseSpecification extends Specification {
    JenkinsClient jenkins
    RestApiClient restApiClient
    String token

    def setupSpec() {
        jenkins = new JenkinsClient()
        restApiClient = new RestApiClient()

        token = restApiClient.getToken("automation", "Continuous Integration")
        println "Jenkins Version: ${jenkins.version()}"
        println restApiClient.metadata

        waitForScannerRegistration()
    }

    def waitForScannerRegistration() {
        println "Waiting for at least one scanner to be registered..."
        int maxRetries = 30
        int retryDelay = 10000 // 10 seconds

        for (int i = 0; i < maxRetries; i++) {
            try {
                if (restApiClient.hasRegisteredScanners()) {
                    def integrations = restApiClient.getImageIntegrations()
                    println "Found ${integrations.integrations.size()} scanner integration(s) registered"
                    return
                }
            } catch (Exception e) {
                println "Error checking scanner integrations: ${e.message}"
            }

            println "No scanners registered yet, " +
                            "waiting ${retryDelay / 1000} seconds... (attempt ${i + 1}/${maxRetries})"
            Thread.sleep(retryDelay)
        }

        throw new RuntimeException(
                "Timeout waiting for scanner registration. " +
                        "No scanners were registered after ${maxRetries * retryDelay / 1000} seconds.")
    }
}
