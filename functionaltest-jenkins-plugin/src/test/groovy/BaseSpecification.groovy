import static io.stackrox.proto.api.v1.ApiTokenService.GenerateTokenResponse
import services.ApiTokenService
import services.MetadataService
import spock.lang.Specification

class BaseSpecification extends Specification {
    JenkinsClient jenkins
    GenerateTokenResponse tokenResponse

    def setup() {
        jenkins = new JenkinsClient()
        tokenResponse = ApiTokenService.generateToken("automation", "Continuous Integration")
        println "Jenkins Version: ${jenkins.version()}"
        println "StackRox Metadata\n${MetadataService.metadata}"
    }

    def cleanup() {
        ApiTokenService.revokeToken(tokenResponse.metadata.id)
    }

    String getToken() {
        return tokenResponse.token
    }
}
