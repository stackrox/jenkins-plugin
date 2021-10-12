import data.Policy
import data.Token

import spock.lang.Specification

class BaseSpecification extends Specification {
    JenkinsClient jenkins
    RestApiClient restApiClient
    String token
    Policy policyObj

    def setup() {
        jenkins = new JenkinsClient()
        restApiClient = new RestApiClient()
        Token tokenobject = new Token()
        tokenobject.setName("automation")
        tokenobject.setRole("Continuous Integration")
        token = restApiClient.getToken(tokenobject)
        policyObj = new Policy()
        println "Jenkins Version: ${jenkins.version()}"
    }
}
