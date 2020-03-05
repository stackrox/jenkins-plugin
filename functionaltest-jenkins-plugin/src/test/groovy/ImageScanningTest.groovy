import data.DataUtil
import data.ListPolicyResponse
import data.Policy
import data.Policies
import spock.lang.Unroll

class ImageScanningTest extends BaseSpecification {

    final String cachedJenkinsIp = getJenkinsAddress()

    @Unroll
    def "image scanning test with the docker image + scenarios(#imageName, #test, #policyName, #enforcement)"() {
        given:
        "a scanner repo with images"
        when:
        "Jenkins is setup"
        then:
        Policy updatedPolicy = policyObj.getUpdatedPolicy(policyName, "v0.4.2", enforcement )
        Policies policies = restApiClient.getPolicies()
        for (ListPolicyResponse policy : policies.policies) {
            if (policy.name == policyName) {
                println("Updating the policy $policyName")
                restApiClient.updatePolicy(updatedPolicy, policy.id)
                Policy enforcementPolicy  = restApiClient.getPolicy(policy.id)
                assert enforcementPolicy.enforcementActions.empty == true
                assert enforcementPolicy.lifecycleStages == ['BUILD']
            }
        }
        println("Testing image ${imageName} and ${test}")
        File configfile = DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, true, true)
        String jobName = restApiClient.createJenkinsJob(cachedJenkinsIp, configfile)
        restApiClient.startJenkinsBuild(jenkinsAddress,  jobName)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, jenkinsAddress)
        assert status == endStatus
        where:
        "data inputs are: "
        imageName                            | test                                        |  policyName             | enforcement              | endStatus
        "k8s.gcr.io/prometheus-to-sd:v0.4.2" | "Test prometheus image used in stackrox"    |  "90-Day Image Age"     | "UNSET_ENFORCEMENT"      | "SUCCESS"
        "k8s.gcr.io/prometheus-to-sd:v0.4.2" | "Test prometheus image used in stackrox"    |  "90-Day Image Age"     | "FAIL_BUILD_ENFORCEMENT" | "FAILURE"
    }

    @Unroll
    def "image scanning test with docker hub images -ve scenario(#imageName, #test, #policyName, #Enforcement, #tag, #enforcement)"() {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        Policy updatedPolicy = policyObj.getUpdatedPolicy(policyName, tag, enforcement)
        Policies policies = restApiClient.getPolicies()
        for (ListPolicyResponse policy : policies.policies) {
            if (policy.name == policyName) {
                println("Updating the policy $policyName")
                restApiClient.updatePolicy(updatedPolicy, policy.id)
                Policy enforcementPolicy  = restApiClient.getPolicy(policy.id)
                assert enforcementPolicy.enforcementActions == ["FAIL_BUILD_ENFORCEMENT"]
                assert enforcementPolicy.lifecycleStages == ['BUILD']
            }
        }
        File configFile = DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, true, true)
        String jobName = restApiClient.createJenkinsJob(cachedJenkinsIp, configFile)
        restApiClient.startJenkinsBuild(cachedJenkinsIp, jobName)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, cachedJenkinsIp)
        assert status == "FAILURE"
        where:
        "data inputs are: "
        imageName                               | test                                                       | policyName           | tag       | enforcement
        "jenkins/jenkins:lts"                   | "Testing jenkins/jenkins:lts for policy Fixable CVSS >= 7" | "Fixable CVSS >= 7"  | "lts"     | "FAIL_BUILD_ENFORCEMENT"
        "nginx:latest"                          | "Testing nginx with latest tag"                            | "Latest tag"         | "latest"  | "FAIL_BUILD_ENFORCEMENT"
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
