import data.BuildDetectRequest
import data.DataUtil
import data.ListPolicyResponse
import data.Policy
import data.Policies
import spock.lang.Unroll
import data.Alerts
import data.Alert

class ImageScanningTest extends BaseSpecification {

    final String cachedJenkinsIp = getJenkinsAddress()

    @Unroll
    def "image scanning test with the docker image + scenarios(#imageName, #test)"() {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        println("Testing image ${imageName} and ${test}")
        File configfile = DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, true, true)
        String jobName = restApiClient.createJenkinsJob(cachedJenkinsIp, configfile)
        restApiClient.startJenkinsBuild(jenkinsAddress,  jobName)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, jenkinsAddress)
        assert status == "SUCCESS"
        BuildDetectRequest buildDetectRequest = new BuildDetectRequest()
        buildDetectRequest.setProperty("imageName", imageName)
        Alerts alerts = restApiClient.getAlerts(buildDetectRequest)
        for (Alert alert : alerts.alerts) {
              assert alert.enforcement == null
        }
        where:
        "data inputs are: "
        imageName                            | test
        "k8s.gcr.io/prometheus-to-sd:v0.4.2" | "Test prometheus image used in stackrox"
    }

    @Unroll
    def "image scanning test with docker hub images -ve scenario(#imageName, #test, #policyName)"() {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        Policy updatedPolicy = new Policy()
        updatedPolicy.with {
            lifecycleStages = ["BUILD","DEPLOY"]
            enforcementActions= ["FAIL_BUILD_ENFORCEMENT"]
        }
        Policies policies = restApiClient.getPolicies()
        for (ListPolicyResponse policy : policies.policies) {
            if (policy.name == policyName) {
                println("Updating the policy $policyName")
                restApiClient.updatePolicy(updatedPolicy, policy.id)
            }
        }
        File configFile = DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, true, true)
        String jobName = restApiClient.createJenkinsJob(cachedJenkinsIp, configFile)
        restApiClient.startJenkinsBuild(cachedJenkinsIp, jobName)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, cachedJenkinsIp)
        assert status == "FAILURE"
        where:
        "data inputs are: "
        imageName                               | test                                                       | policyName
        "jenkins/jenkins:lts"                   | "Testing jenkins/jenkins:lts for policy Fixable CVSS >= 7" | "Fixable CVSS >= 7"
        "docker.io/library/nginx:latest"        | "Testing nginx with latest tag"                            | "Latest tag"
    }

    @Unroll
    def "image scanning test with the docker image -ve scenarios with fail plugin error(#imageName, #failOnCriticalPluginError, #test, #endStatus)"() {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        File configFile = DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, false, failOnCriticalPluginError)
        String jobName = restApiClient.createJenkinsJob(cachedJenkinsIp, configFile)
        restApiClient.startJenkinsBuild(cachedJenkinsIp, jobName)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, cachedJenkinsIp)
        assert status == endStatus
        where:
        "data inputs are: "
        imageName             | failOnCriticalPluginError | test                                  | endStatus
        "jenkins/jenkins:lts" | true                      | "testing jenkins image with lts tag"  | "SUCCESS"
        "mis-spelled:lts"     | true                      | "testing jenkins image with lts tag"  | "FAILURE"
        "mis-spelled:lts"     | false                     | "testing jenkins image with lts tag"  | "SUCCESS"

    }
}
