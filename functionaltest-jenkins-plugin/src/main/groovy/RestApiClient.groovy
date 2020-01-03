import Data.DataUtil
import Data.Alert
import Util.Timer
import com.google.gson.Gson
import com.jayway.restassured.specification.RequestSpecification
import common.Constants
import static com.jayway.restassured.RestAssured.given
import com.jayway.restassured.response.Response
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

class RestApiClient {
    public Gson gson
    RestApiClient() {
        gson = new Gson();
    }

    protected  RequestSpecification CreateRequestSpecification(String header, String value) {
        return given().relaxedHTTPSValidation().header(header, value)
    }

    protected Alert[] getAlerts(String imageName, Object requestObj) {
        String url = Constants.baseurl + Constants.buildDetect
        def encodedpassword = "Basic " + DataUtil.base64Encode(common.Constants.cluserUserName+":"+common.Constants.clusterPassword)
        Response response =  CreateRequestSpecification("Authorization", encodedpassword)
                             .body(gson.toJson(requestObj))
                             .post(url)
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(response.asString())
        Alert[] alerts = gson.fromJson(jsonObject.get("alerts").toString(), Alert[])
        return alerts
    }

    String createJenkinsJob(String loadBalancer) {
        def jobName = "testjob" +new Random().nextInt()
        def url = "${Constants.jenkinsProtocol}://${loadBalancer}:${Constants.jenkinsPort}/createItem?name=${jobName}"
        print (url)
        File file = new File("src/main/resources/config-vuln-management.xml")
        FileInputStream fileInputStream = new FileInputStream(file)
        byte [] bytes = fileInputStream.bytes
        given().relaxedHTTPSValidation()
            .content(bytes)
            .contentType("text/xml")
            .when()
            .post(url)
            .then()
            .statusCode(200)

        return jobName
    }

    static void startJenkinsBuild(String job, String loadBalancer ) {
        def url = "http://${loadBalancer}:8080/job/${job}/build"
        given().relaxedHTTPSValidation()
            .when()
            .post(url)
            .then().statusCode(201)

    }

    String getJenkinsBuildStatus(String job, int timeout, String loadBalancer) {
        int interval = 1
        int iterations = timeout/interval
        Response response
        Timer timer = new Timer(iterations,interval)
        while (response?.statusCode() != 200 && timer.IsValid()) {
            try {
                def url = "http://${loadBalancer}:8080/job/${job}/lastBuild/api/json"
                response = given().relaxedHTTPSValidation()
                        .when()
                        .post(url)
                }
            catch (Exception ex) {
                println("Catching 404 exception")
            }
        }
        return response.jsonPath().get("result")
    }
}

