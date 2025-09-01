import spock.lang.Shared
import spock.lang.Specification

class BaseSpecification extends Specification {
    @Shared
    JenkinsClient jenkins
    @Shared
    RestApiClient restApiClient
    @Shared
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
                if (restApiClient.isHealthy()) {
                    println "Everything OK"
                    return
                }
            } catch (Exception e) {
                println "Error checking scanner health: ${e.message}"
            }

            println "Cluster is unhealthy"
            Thread.sleep(retryDelay)
        }

        throw new RuntimeException("Timeout waiting for cluster healthy.")
    }
}
