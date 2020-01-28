import com.google.gson.Gson
import spock.lang.Specification
import data.DataUtil
import data.Token

class BaseSpecification extends Specification {
    Gson gson
    RestApiClient restApiClient
    public String token
    def setup() {
        restApiClient = new RestApiClient()
        Token tokenobject = new Token()
        tokenobject.setName("automation")
        tokenobject.setRole("Continuous Integration")
        token = restApiClient.getToken(tokenobject)
    }
    def cleanup() {
        DataUtil.deleteFileFromDisk("src/main/resources/temp.xml")
    }
}
