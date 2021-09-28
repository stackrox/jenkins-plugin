import static io.stackrox.proto.api.v1.ApiTokenService.*
import data.Token
import groovy.io.FileType
import services.ApiTokenService
import services.BaseService
import spock.lang.Specification

class BaseSpecification extends Specification {
    JenkinsClient jenkins
    GenerateTokenResponse tokenResponse

    def setup() {
        jenkins = new JenkinsClient()
        BaseService.useBasicAuth()
        tokenResponse = ApiTokenService.generateToken("automation", "Continuous Integration")
    }

    def cleanup() {
        ApiTokenService.revokeToken(tokenResponse.metadata.id)
        def folderPath = "."
        new File(folderPath).eachFile(FileType.FILES) { file ->
            if (file.name.contains('temp')) {
                file.delete()
            }
        }
    }

    String getToken() {
        return tokenResponse.token
    }
}
