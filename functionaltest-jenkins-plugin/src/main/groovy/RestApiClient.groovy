import data.DataUtil
import data.Alerts
import data.Policy
import data.Policies
import data.TokenResponse
import util.Timer
import com.google.gson.Gson
import com.jayway.restassured.specification.RequestSpecification
import common.Constants
import static com.jayway.restassured.RestAssured.given
import com.jayway.restassured.response.Response


class RestApiClient {

    public Gson gson
    def env=System.getenv()
    def password=env['ROX_PASSWORD']
    def encodedpassword = "Basic " + DataUtil.base64Encode(common.Constants.cluserUserName+":"+ password)

    RestApiClient() {
        gson = new Gson()
    }

    protected RequestSpecification createRequestSpecification(String header, String value) {
        return given().relaxedHTTPSValidation().header(header, value)
    }

    String getToken(Object tokenObj) {
        String url = Constants.baseurl + Constants.tokenGenerate
        Response response =  createRequestSpecification("Authorization", encodedpassword)
                             .body(gson.toJson(tokenObj))
                             .post(url)
        TokenResponse token = gson.fromJson(response.asString(),TokenResponse )
        return token.token

    }

    protected Alerts getAlerts(Object requestObj) {
        String url = Constants.baseurl + Constants.buildDetect
        Response response =  createRequestSpecification("Authorization", encodedpassword)
                             .body(gson.toJson(requestObj))
                             .post(url)
        println(response.asString())
        Alerts alerts = gson.fromJson(response.asString(), Alerts)
        return alerts
    }

     Policy createPolicy(Object policyObj) {
        def url = Constants.baseurl + Constants.postPolicy
        Response response =  createRequestSpecification("Authorization", encodedpassword)
                .body(gson.toJson(policyObj))
                .post(url)
        Policy policy = gson.fromJson(response.asString(), Policy)
        return policy
     }

     Policies getPolicies() {
        def url = Constants.baseurl + Constants.getPolicies
        Response response =  createRequestSpecification("Authorization", encodedpassword)
                             .get(url)
        Policies policies = gson.fromJson(response.asString(), Policies)
        return policies
     }


    def updatePolicy(Object policyObj, String id) {
        def url = Constants.baseurl + Constants.putPolicy.replace("{id}",id)
        Response response =  createRequestSpecification("Authorization", encodedpassword)
                .body(gson.toJson(policyObj))
                .put(url)
        Policy policy = gson.fromJson(response.asString(), Policy)
        return policy
    }

    def getPolicy(String id) {
        def url = Constants.baseurl + Constants.putPolicy.replace("{id}",id)
        Response response =  createRequestSpecification("Authorization", encodedpassword)
                .get(url)
        Policy policy = gson.fromJson(response.asString(), Policy)
        return policy
    }

    String createJenkinsJob(String loadBalancer, File file) {
        def jobName = "testjob" +new Random().nextInt()
        def url = "${Constants.jenkinsProtocol}://${loadBalancer}:${Constants.jenkinsPort}/createItem?name=${jobName}"
        FileInputStream fileInputStream = new FileInputStream(file)
        byte [] bytes = fileInputStream.bytes
        println("Creating Jenkins job  ${jobName}")
        given().content(bytes)
            .contentType("text/xml")
            .when()
            .post(url)
            .then()
            .statusCode(200)
        return jobName
    }

     void startJenkinsBuild(String job, String loadBalancer ) {
        println("Starting Jenkins job ${job}")
        def url = "${Constants.jenkinsProtocol}://${loadBalancer}:${Constants.jenkinsPort}/job/${job}/build"
        print url
         given().when()
            .post(url)
            .then().statusCode(201)

    }

    String getJenkinsBuildStatus(String job, int timeout, String loadBalancer) {
        println("/n" +"Getting build status of ${job}")
        int interval = 1
        int iterations = timeout/interval
        Response response
        Timer timer = new Timer(iterations,interval)
        while ((response?.body() == null || response?.asString()?.startsWith("<") || response?.jsonPath()?.get("result") == null) && timer.IsValid()) {
            try {
                def url = "${Constants.jenkinsProtocol}://${loadBalancer}:${Constants.jenkinsPort}/job/${job}/lastBuild/api/json"
                response = given().when()
                           .post(url)
                }

               catch (Exception ex) {
                   println(ex.toString())
               }
        }
        return response.jsonPath().get("result")
    }
}

