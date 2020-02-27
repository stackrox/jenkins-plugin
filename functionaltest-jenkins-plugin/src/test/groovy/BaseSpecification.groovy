import com.google.gson.Gson
import spock.lang.Specification
import data.DataUtil
import data.Token

class BaseSpecification extends Specification {
    RestApiClient restApiClient
    public String token
    public static String jenkinsAddress

    def setup() {
        restApiClient = new RestApiClient()
        Token tokenobject = new Token()
        tokenobject.setName("automation")
        tokenobject.setRole("Continuous Integration")
        token = restApiClient.getToken(tokenobject)
    }

    final static setJenkinsAddress() {
      jenkinsAddress = RestApiClient.getCachedIp()
    }

    final static getJenkinsAddress() {
        setJenkinsAddress()
        return jenkinsAddress
    }

    def cleanup() {
        new File("src/test/resources/temp.xml").delete()
    }
}
