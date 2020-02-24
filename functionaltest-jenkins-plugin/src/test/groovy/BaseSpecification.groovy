import com.google.gson.Gson
import spock.lang.Specification
import data.DataUtil
import data.Token

class BaseSpecification extends Specification {
    RestApiClient restApiClient
    public String token
    public jenkinsAddress

    def setup() {
        restApiClient = new RestApiClient()
        Token tokenobject = new Token()
        tokenobject.setName("automation")
        tokenobject.setRole("Continuous Integration")
        token = restApiClient.getToken(tokenobject)
        Service svc = new Service("jenkins", "jenkins")
        jenkinsAddress = svc.getLoadBalancer(60)
    }

    def cleanup() {
        def checkDeleted = DataUtil.deleteFileFromDisk("src/test/resources/temp.xml")
        if (checkDeleted) {
            println("Test completed and file deleted")
        }
    }
}
