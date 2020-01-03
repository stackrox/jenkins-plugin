import spock.lang.Specification

class BaseSpecification extends Specification {

    RestApiClient restApiClient
    def setup() {
        restApiClient = new RestApiClient()
    }
    def cleanup() { }
}
