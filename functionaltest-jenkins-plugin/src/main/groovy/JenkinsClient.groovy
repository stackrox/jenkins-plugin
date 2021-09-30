import static com.jayway.restassured.RestAssured.given
import com.google.gson.Gson
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
    private final Gson gson = new Gson()

    class JobStatus {
        class Artifact {
            String displayPath
            String relativePath
        }
        String result
        String url
        List<Artifact> artifacts
    }

    JenkinsClient() {
        def env = System.getenv()
        jenkinsAddress = env.getOrDefault('JENKINS_IP', "localhost")
    }

    protected RequestSpecification jenkins() {
        String jenkinsUri = "${JENKINSPROTOCOL}://${jenkinsAddress}:${JENKINSPORT}"
        def r = given().when().get("${jenkinsUri}/crumbIssuer/api/json")
        return given().header(
                r.jsonPath().getString("crumbRequestField"),
                r.jsonPath().getString("crumb")
        ).cookies(r.cookies()).baseUri(jenkinsUri)
    }

    String version() {
        return jenkins().get().header('X-Jenkins')
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
        Timer timer = new Timer(timeout, 1)
        JobStatus result = null
        while (result?.result == null && timer.IsValid()) {
            try {
                def url = "/job/${job}/lastBuild/api/json"
                Response response = jenkins().when()
                        .post(url)
                result = gson.fromJson(response.asString(), JobStatus)
            } catch (Exception ex) {
                println(ex.toString())
            }
        }

        result.artifacts.each {
            def content = jenkins().get("${result.url}artifact/${it.relativePath}").body()
            println it.displayPath
            println content.asString()
        }

        def jobOutputUrl = "/job/${job}/lastBuild/consoleText"
        Response outputResponse = jenkins().when()
                .get(jobOutputUrl)
        println "***Output of Jenkins build:"
        println outputResponse.asString()

        return result.result
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
                enableTLSVerification    : false,
        ]
        // def engine = new XmlTemplateEngine()
        // We can't use XML Template here as generated output wraps values with new lines
        // that are not trimmed by Jenkins and causes errors.
        // See: https://stackoverflow.com/a/45127021
        def engine = new GStringTemplateEngine()
        def template = engine.createTemplate(xml).make(param)
        File file = File.createTempFile("temp", ".xml", new File("."))
        println("Writing to a temp file: ${file.path}")
        file.write(template.toString())
        return file
    }
}
