import data.Policy
import spock.lang.Specification
import data.Token
import groovy.io.FileType

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
    }

    def cleanup() {
        def folderPath = "."
        new File(folderPath).eachFile (FileType.FILES) { file ->
            if (file.name.contains('temp')) { file.delete() }
        }
    }
}
