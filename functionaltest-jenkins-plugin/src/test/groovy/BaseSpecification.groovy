import data.Policy
import spock.lang.Specification
import data.Token
import groovy.io.FileType

class BaseSpecification extends Specification {
    RestApiClient restApiClient
    String token
    static String jenkinsAddress
    Policy policyObj

    def setup() {
        restApiClient = new RestApiClient()
        Token tokenobject = new Token()
        tokenobject.setName("automation")
        tokenobject.setRole("Continuous Integration")
        token = restApiClient.getToken(tokenobject)
        policyObj = new Policy()
    }

    final static setJenkinsAddress() {
        jenkinsAddress = RestApiClient.getCachedIp()
    }

    final static getJenkinsAddress() {
        setJenkinsAddress()
        return jenkinsAddress
    }

    def cleanup() {
        def folderPath = "."
        new File(folderPath).eachFile (FileType.FILES) { file ->
            if (file.name.contains('temp')) { file.delete() }
        }
    }
}
