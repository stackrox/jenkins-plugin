import data.Policy
import services.BaseService
import spock.lang.Specification
import data.Token
import groovy.io.FileType

class BaseSpecification extends Specification {
    JenkinsClient jenkins
    String token

    def setup() {
        jenkins = new JenkinsClient()
        def restApiClient = new RestApiClient()
        Token tokenobject = new Token()
        tokenobject.setName("automation")
        tokenobject.setRole("Continuous Integration")
        token = restApiClient.getToken(tokenobject)
        BaseService.useBasicAuth()
    }

    def cleanup() {
        def folderPath = "."
        new File(folderPath).eachFile (FileType.FILES) { file ->
            if (file.name.contains('temp')) { file.delete() }
        }
    }
}
