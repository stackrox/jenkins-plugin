import data.DataUtil
import data.Alert
import data.ListPolicyResponse
import data.Policy
import Util.Timer
import com.google.gson.Gson
import com.jayway.restassured.specification.RequestSpecification
import common.Constants
import static com.jayway.restassured.RestAssured.given
import com.jayway.restassured.response.Response
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser


class RestApiClient {

    public Gson gson
    public JSONParser parser
    private final static encodedpassword = "Basic " + DataUtil.base64Encode(common.Constants.cluserUserName+":"+common.Constants.clusterPassword)

    RestApiClient() {
        gson = new Gson()
        parser = new JSONParser()
    }

    protected RequestSpecification CreateRequestSpecification(String header, String value) {
        return given().relaxedHTTPSValidation().header(header, value)
    }

    String getToken(Object tokenObj) {
        String url = Constants.baseurl + Constants.tokenGenerate
        Response response =  CreateRequestSpecification("Authorization", encodedpassword)
                             .body(gson.toJson(tokenObj))
                             .post(url)
        JSONObject jsonObject = (JSONObject) parser.parse(response.asString())
        return jsonObject.get("token")

    }

    protected Alert[] getAlerts(Object requestObj) {
        String url = Constants.baseurl + Constants.buildDetect
        Response response =  CreateRequestSpecification("Authorization", encodedpassword)
                             .body(gson.toJson(requestObj))
                             .post(url)
        JSONObject jsonObject = (JSONObject) parser.parse(response.asString())
        Alert[] alerts = gson.fromJson(jsonObject.get("alerts").toString(), Alert[])
        return alerts
    }

     Policy createPolicy(Object policyObj) {
        def url = Constants.baseurl + Constants.postPolicy
        Response response =  CreateRequestSpecification("Authorization", encodedpassword)
                .body(gson.toJson(policyObj))
                .post(url)
        Policy policy = gson.fromJson(response.asString(), Policy)
        return policy
     }

     ListPolicyResponse [] getPolicies() {
        def url = Constants.baseurl + Constants.getPolicies
        Response response =  CreateRequestSpecification("Authorization", encodedpassword)
                             .get(url)
        JSONObject jsonObject = (JSONObject) parser.parse(response.asString())
        ListPolicyResponse [] policies = gson.fromJson(jsonObject.get("policies").toString(), ListPolicyResponse[])
        return policies
     }


    def updatePolicy(Object policyObj, String id) {
        def url = Constants.baseurl + Constants.putPolicy.replace("{id}",id)
        Response response =  CreateRequestSpecification("Authorization", encodedpassword)
                .body(gson.toJson(policyObj))
                .put(url)
        Policy policy = gson.fromJson(response.asString(), Policy)
        return policy
    }

    def getPolicy(String id) {
        def url = Constants.baseurl + Constants.putPolicy.replace("{id}",id)
        Response response =  CreateRequestSpecification("Authorization", encodedpassword)
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
        println("Getting build status of ${job}")
        int interval = 1
        int iterations = timeout/interval
        Response response
        Timer timer = new Timer(iterations,interval)
        while ((response?.body() == null || response?.asString()?.startsWith("<") || response?.jsonPath()?.get("result") == null) && timer.IsValid()) {
            try {
                def url = "${Constants.jenkinsProtocol}://${loadBalancer}:${Constants.jenkinsPort}/job/${job}/lastBuild/api/json"
                println(url)
                response = given().when()
                           .post(url)
                println(response.asString())
                }

               catch (Exception ex) {
                   println(ex.toString())
               }
        }
        return response.jsonPath().get("result")
    }
}

