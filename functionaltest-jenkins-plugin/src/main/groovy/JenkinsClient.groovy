import static com.jayway.restassured.RestAssured.given
import com.jayway.restassured.response.Response
import com.jayway.restassured.specification.RequestSpecification
import java.security.SecureRandom
import util.Timer

class JenkinsClient {
    public final static JENKINSPORT = "8080"
    public final static JENKINSPROTOCOL = "http"
    String jenkinsAddress = ""

    protected RequestSpecification jenkins() {
        String jenkinsUri = "${JENKINSPROTOCOL}://${cachedIp}:${JENKINSPORT}"
        def r = given().when().get("${jenkinsUri}/crumbIssuer/api/json")
        return given().header(
                r.jsonPath().getString("crumbRequestField"),
                r.jsonPath().getString("crumb")
        ).cookies(r.cookies()).baseUri(jenkinsUri)
    }

    String getCachedIp() {
        def env = System.getenv()
        jenkinsAddress = env['JENKINS_IP']
        if (jenkinsAddress == "") {
            Service svc = new Service("jenkins", "jenkins")
            jenkinsAddress = svc.getLoadBalancer(60)
        }
        return jenkinsAddress
    }

    String createJob(File configfile) {
        def jobName = "testjob" + new SecureRandom().nextInt()
        def url = "/createItem?name=${jobName}"
        FileInputStream fileInputStream = new FileInputStream(configfile)
        byte[] bytes = fileInputStream.bytes
        println("Creating Jenkins job  ${jobName}")
        jenkins().content(bytes)
                .contentType("text/xml")
                .when()
                .post(url)
                .then()
                .statusCode(200)
        return jobName
    }

    void startBuild(String job) {
        println("Starting Jenkins job ${job}")
        def url = "/job/${job}/build"
        print url
        jenkins().when()
                .post(url)
                .then().statusCode(201)
    }

    String getBuildStatus(String job, int timeout) {
        println("\nGetting build status of ${job}")
        int interval = 1
        int iterations = timeout / interval
        Response response
        Timer timer = new Timer(iterations, interval)
        while ((response?.body() == null || response?.asString()?.startsWith("<") ||
                response?.jsonPath()?.get("result") == null) && timer.IsValid()) {
            try {
                def url = "/job/${job}/lastBuild/api/json"
                response = jenkins().when()
                        .post(url)
            }

            catch (Exception ex) {
                println(ex.toString())
            }
        }
        println "***Full response from Jenkins build status API: " + response.asString()

        // MORE DEBUG INFO
        def jobOutputUrl = "/job/${job}/lastBuild/consoleText"
        Response outputResponse = jenkins().when()
                .get(jobOutputUrl)
        println "***Output of Jenkins build:"
        println outputResponse.asString()

        return response.jsonPath().get("result")
    }
}
