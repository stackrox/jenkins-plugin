import java.security.SecureRandom

import com.offbytwo.jenkins.JenkinsServer
import com.offbytwo.jenkins.JenkinsTriggerHelper
import com.offbytwo.jenkins.model.BuildResult
import groovy.transform.CompileStatic
import groovy.transform.TypeCheckingMode
import groovy.util.slurpersupport.NodeChild
import groovy.xml.XmlUtil

@CompileStatic
class JenkinsClient {
    private final static JENKINSPORT = "8080"
    private final static JENKINSPROTOCOL = "http"
    private final static boolean USE_CRUMB_AUTHENTICATION = true
    public static final String JOB_TEMPLATE_WITH_IMAGE_NAMES = "resources/templateNoFile.xml"
    public static final String TEMPLATE_WITHOUT_IMAGE_NAMES = "resources/template.xml"
    private final JenkinsServer jenkins

    JenkinsClient() {
        def env = System.getenv()
        String jenkinsAddress = env.getOrDefault('JENKINS_IP', "localhost")
        jenkins = new JenkinsServer(new URI("${JENKINSPROTOCOL}://${jenkinsAddress}:${JENKINSPORT}"))
    }

    String version() {
        return jenkins.version.toString()
    }

    BuildResult createAndRunJob(String config) {
        String job = createJob(config)
        return startBuild(job)
    }

    String createJob(String config) {
        def jobName = "testjob" + new SecureRandom().nextInt()
        println("Creating Jenkins job  ${jobName}")
        jenkins.createJob(jobName, config, USE_CRUMB_AUTHENTICATION)
        return jobName
    }

    BuildResult startBuild(String job) {
        println "Starting Jenkins job ${job}"
        def trigger = new JenkinsTriggerHelper(jenkins)
        def result = trigger.triggerJobAndWaitUntilFinished(job, USE_CRUMB_AUTHENTICATION)
        println "***Output of Jenkins build:"
        println result.consoleOutputText
        return result.result
    }

    static String createJobConfig(String imageName, String portalAddress, String token, Boolean policyEvalCheck,
                                  Boolean failOnCriticalPluginError) {
        Map<String, Serializable> param = createConfigMap(
                imageName, portalAddress, token, policyEvalCheck, failOnCriticalPluginError)
        // parse the xml
        String path = TEMPLATE_WITHOUT_IMAGE_NAMES
        return createJobConfigFromPath(path, param)
    }

    static String createJobConfigNoFile(String imageName, String portalAddress, String token, Boolean policyEvalCheck,
                                        Boolean failOnCriticalPluginError) {
        Map<String, Serializable> param = createConfigMap(
                imageName, portalAddress, token, policyEvalCheck, failOnCriticalPluginError)
        // parse the xml
        String path = JOB_TEMPLATE_WITH_IMAGE_NAMES
        return createJobConfigFromPath(path, param)
    }

    //TODO(ROX-8458): add tests for pipeline
    private static Map<String, Serializable> createConfigMap(String imageName, String portalAddress, String token,
                                                             boolean policyEvalCheck,
                                                             boolean failOnCriticalPluginError) {
        return [  // codenarc-disable UnnecessaryCast
                command                  : """mkdir \$BUILD_TAG
                               cd \$BUILD_TAG
                               echo '${imageName}' >> rox_images_to_scan""",
                portalAddress            : portalAddress,
                apiToken                 : token,
                failOnPolicyEvalFailure  : policyEvalCheck,
                failOnCriticalPluginError: failOnCriticalPluginError,
                enableTLSVerification    : false,
                imageNames               : imageName,
        ] as Map<String, Serializable>
    }

    @CompileStatic(TypeCheckingMode.SKIP)
    private static String createJobConfigFromPath(String path, Map<String, Serializable> param) {
        def parsexml = new XmlSlurper().parse(new File(path))
        param.each { key, value ->
            parsexml.breadthFirst().findAll { NodeChild it ->
                if (it.name() == key) {
                    it.replaceBody value
                }
            }
        }
        return XmlUtil.serialize(parsexml)
    }
}
