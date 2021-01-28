import static com.jayway.restassured.RestAssured.given
import data.DataUtil
import data.Alerts
import data.Policy
import data.Policies
import data.TokenResponse
import util.Timer
import com.google.gson.Gson
import com.jayway.restassured.specification.RequestSpecification
import common.Constants
import com.jayway.restassured.response.Response
import java.security.SecureRandom

class RestApiClient {

    Gson gson
    String authHeaderValue
    static String jenkinsAddress

    RestApiClient() {
        gson = new Gson()
        def env = System.getenv()
        def password = env['ROX_PASSWORD']
        authHeaderValue = "Basic " + DataUtil.base64Encode(common.Constants.CLUSTERUSERNAME + ":" + password)
     }

    protected RequestSpecification createRequestSpecification() {
        String header = "Authorization"
        String value = authHeaderValue
        return given().relaxedHTTPSValidation().header(header, value)
    }

    final static String getCachedIp() {
        Service svc = new Service("jenkins", "jenkins")
        jenkinsAddress = svc.getLoadBalancer(60)
        return jenkinsAddress
    }

    String getToken(Object tokenObj) {
        String url = Constants.BASEURL + Constants.TOKENGENERATE
        Response response = createRequestSpecification()
                .body(gson.toJson(tokenObj))
                .post(url)
        TokenResponse token = gson.fromJson(response.asString(), TokenResponse)
        return token.token
    }

    protected Alerts getAlerts(Object requestObj) {
        String url = Constants.BASEURL + Constants.BUILDDETECT
        Response response = createRequestSpecification()
                .body(gson.toJson(requestObj))
                .post(url)
        println(response.asString())
        Alerts alerts = gson.fromJson(response.asString(), Alerts)
        return alerts
    }

    Policy createPolicy(Object policyObj) {
        def url = Constants.BASEURL + Constants.POSTPOLICY
        Response response = createRequestSpecification()
                .body(gson.toJson(policyObj))
                .post(url)
        Policy policy = gson.fromJson(response.asString(), Policy)
        return policy
    }

    Policies getPolicies() {
        def url = Constants.BASEURL + Constants.GETPOLICIES
        Response response = createRequestSpecification()
                .get(url)
        Policies policies = gson.fromJson(response.asString(), Policies)
        return policies
    }

    def updatePolicy(Object policyObj, String id) {
        def url = Constants.BASEURL + Constants.PUTPOLICY.replace("{id}", id)
        Response response = createRequestSpecification()
                .body(gson.toJson(policyObj))
                .put(url)
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

    String createJenkinsJob(String jenkinsAddress, File configfile) {
        def jobName = "testjob" + new SecureRandom().nextInt()
        def url = "${Constants.JENKINSPROTOCOL}://${jenkinsAddress}:${Constants.JENKINSPORT}/createItem?name=${jobName}"
        FileInputStream fileInputStream = new FileInputStream(configfile)
        byte[] bytes = fileInputStream.bytes
        println("Creating Jenkins job  ${jobName}")
        given().content(bytes)
                .contentType("text/xml")
                .when()
                .post(url)
                .then()
                .statusCode(200)
        return jobName
    }

    void startJenkinsBuild(String jenkinsAddress, String job) {
        println("Starting Jenkins job ${job}")
        def url = "${Constants.JENKINSPROTOCOL}://${jenkinsAddress}:${Constants.JENKINSPORT}/job/${job}/build"
        print url
        given().when()
                .post(url)
                .then().statusCode(201)
    }

    String getJenkinsBuildStatus(String job, int timeout, String jenkinsAddress) {
        println("\nGetting build status of ${job}")
        int interval = 1
        int iterations = timeout / interval
        Response response
        Timer timer = new Timer(iterations, interval)
        while ((response?.body() == null || response?.asString()?.startsWith("<") ||
                response?.jsonPath()?.get("result") == null) && timer.IsValid()) {
            try {
                def url = "${Constants.JENKINSPROTOCOL}://${jenkinsAddress}:${Constants.JENKINSPORT}" +
                          "/job/${job}/lastBuild/api/json"
                response = given().when()
                        .post(url)
            }

            catch (Exception ex) {
                println(ex.toString())
            }
        }
        println "***Full response from Jenkins build status API: " + response.asString()

        // MORE DEBUG INFO
        def jobOutputUrl = "${Constants.JENKINSPROTOCOL}://${jenkinsAddress}:${Constants.JENKINSPORT}" +
                          "/job/${job}/lastBuild/consoleText"
        Response outputResponse = given().when()
                        .get(jobOutputUrl)
        println "***Output of Jenkins build:"
        println outputResponse.asString()

        return response.jsonPath().get("result")
    }
}

