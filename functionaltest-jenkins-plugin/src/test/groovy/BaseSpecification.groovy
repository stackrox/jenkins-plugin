import spock.lang.Specification
import java.util.Map
import java.util.HashMap



class BaseSpecification extends Specification {
    RestApiClient restApiClient
    def setup() {
        restApiClient = new RestApiClient()
    }
    def cleanup() { }




}
