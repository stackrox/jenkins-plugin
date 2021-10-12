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
    private final JenkinsServer jenkins

    JenkinsClient() {
        def env = System.getenv()
        String jenkinsAddress = env.getOrDefault('JENKINS_IP', "localhost")
        jenkins = new JenkinsServer(new URI("${JENKINSPROTOCOL}://${jenkinsAddress}:${JENKINSPORT}"))
    }

    String version() {
        return jenkins.version.toString()
    }

    BuildResult createAndRunJob(String imageName, String portalAddress, String token, Boolean policyEvalCheck,
                                Boolean failOnCriticalPluginError) {
        String config = createJobConfig(imageName, portalAddress, token, policyEvalCheck, failOnCriticalPluginError)
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

    @CompileStatic(TypeCheckingMode.SKIP)
    static String createJobConfig(String imageName, String portalAddress, String token, Boolean policyEvalCheck,
                                  Boolean failOnCriticalPluginError) {
        String path = "resources/template.xml"
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
        // parse the xml
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
