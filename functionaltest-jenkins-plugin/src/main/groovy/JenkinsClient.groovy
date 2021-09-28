import static com.jayway.restassured.RestAssured.given
import com.jayway.restassured.response.Response
import com.jayway.restassured.specification.RequestSpecification
import groovy.text.GStringTemplateEngine
import groovy.transform.CompileStatic
import java.security.SecureRandom
import util.Timer

@CompileStatic
class JenkinsClient {
    private final static JENKINSPORT = "8080"
    private final static JENKINSPROTOCOL = "http"
    private final String jenkinsAddress

    JenkinsClient() {
        def env = System.getenv()
        jenkinsAddress = env.getOrDefault('JENKINS_IP', getJenkinsAddressFromK8s())
    }

    protected static String getJenkinsAddressFromK8s() {
        Service svc = new Service("jenkins", "jenkins")
        return svc.getLoadBalancer(60)
    }

    protected RequestSpecification jenkins() {
        String jenkinsUri = "${JENKINSPROTOCOL}://${jenkinsAddress}:${JENKINSPORT}"
        def r = given().when().get("${jenkinsUri}/crumbIssuer/api/json")
        return given().header(
                r.jsonPath().getString("crumbRequestField"),
                r.jsonPath().getString("crumb")
        ).cookies(r.cookies()).baseUri(jenkinsUri)
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

    String deleteJob(String job) {
        println("Deleting Jenkins job ${job}")
        def url = "/job/${job}"
        jenkins().when()
                .delete(url)
                .then().statusCode(302)
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
        Response response = null
        Timer timer = new Timer(timeout, 1)
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

    static File createJobConfig(String imageName, String portalAddress, String token, Boolean policyEvalCheck,
                                    Boolean failOnCriticalPluginError) {
        String path = "resources/template.xml"
        String xml = new File(path).text
        def param = [
                command                  : """mkdir \$BUILD_TAG
                               cd \$BUILD_TAG
                               echo '${imageName}' >> rox_images_to_scan""",
                portalAddress            : portalAddress,
                apiToken                 : token,
                failOnPolicyEvalFailure  : policyEvalCheck,
                failOnCriticalPluginError: failOnCriticalPluginError,
                enableTLSVerification    : false
        ]
        // We can't use XML Template here as Jenkins incorrectly treat newlines in XML
        def engine = new GStringTemplateEngine()
        def template = engine.createTemplate(xml).make(param)
        File file = File.createTempFile("temp", ".xml", new File("."))
        println("Writing to a temp file: ${file.path}")
        file.write(template.toString())
        return file
    }
}
