import static com.jayway.restassured.RestAssured.given
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.jayway.restassured.response.Response
import com.jayway.restassured.specification.RequestSpecification
import common.Constants
import data.DataUtil
import data.Policies
import data.Policy
import data.TokenResponse
import groovy.transform.CompileStatic

@CompileStatic
class RestApiClient {

    Gson gson
    String authHeaderValue

    RestApiClient() {
        gson = new GsonBuilder().setPrettyPrinting().create()
        def env = System.getenv()
        String password = env['ROX_PASSWORD']
        authHeaderValue = "Basic " + DataUtil.base64Encode(Constants.CLUSTERUSERNAME + ':' + password)
    }

    protected RequestSpecification createRequestSpecification() {
        String header = "Authorization"
        String value = authHeaderValue
        return given().relaxedHTTPSValidation().header(header, value)
    }

    String getToken(Object tokenObj) {
        String url = Constants.BASEURL + Constants.TOKENGENERATE
        Response response = createRequestSpecification()
                .body(gson.toJson(tokenObj))
                .post(url)
        TokenResponse token = gson.fromJson(response.asString(), TokenResponse)
        return token.token
    }

    Policies getPolicies() {
        def url = Constants.BASEURL + Constants.GETPOLICIES
        Response response = createRequestSpecification()
                .get(url)
        println(response.asString())
        response.then().statusCode(200)
        Policies policies = gson.fromJson(response.asString(), Policies)
        return policies
    }

    def updatePolicy(Object policyObj, String id) {
        def url = Constants.BASEURL + Constants.PUTPOLICY.replace("{id}", id)
        Response response = createRequestSpecification()
                .body(gson.toJson(policyObj))
                .put(url)
        println(response.asString())
        response.then().statusCode(200)
        Policy policy = gson.fromJson(response.asString(), Policy)
        return policy
    }

    Policy getPolicy(String id) {
        def url = Constants.BASEURL + Constants.GETPOLICY.replace("{id}", id)
        println url
        Response response = createRequestSpecification()
                .get(url)
        Policy policy = gson.fromJson(response.asString(), Policy)
        return policy
    }
}

