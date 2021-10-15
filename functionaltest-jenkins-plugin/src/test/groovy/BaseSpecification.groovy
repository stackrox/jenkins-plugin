import spock.lang.Specification

class BaseSpecification extends Specification {
    JenkinsClient jenkins
    RestApiClient restApiClient
    String token

    def setup() {
        jenkins = new JenkinsClient()
        restApiClient = new RestApiClient()

        token = restApiClient.getToken("automation", "Continuous Integration")
        println "Jenkins Version: ${jenkins.version()}"
        println restApiClient.metadata
    }
}
