import com.google.gson.Gson
import spock.lang.Specification
import Data.DataUtil
import Data.Token

class BaseSpecification extends Specification {
    Gson gson
    RestApiClient restApiClient
    public String token
    def setup() {
        gson = new Gson()
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
