import com.stackrox.api.MetadataServiceApi

import spock.lang.Specification

class BaseSpecification extends Specification {
    JenkinsClient jenkins
    RestApiClient restApiClient
    String token

    def setup() {
        jenkins = new JenkinsClient()
        restApiClient = new RestApiClient()

        def metadataApi = new MetadataServiceApi(restApiClient.apiClient)
        println metadataApi.metadataServiceGetMetadata()

        token = restApiClient.getToken("automation", "Continuous Integration")
        println "Jenkins Version: ${jenkins.version()}"
    }
}
