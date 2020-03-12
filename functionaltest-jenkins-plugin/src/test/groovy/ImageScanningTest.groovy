import data.DataUtil
import data.Policies
import data.Policy
import spock.lang.Unroll

import javax.validation.constraints.Null

class ImageScanningTest extends BaseSpecification {

    final String cachedJenkinsIp = getJenkinsAddress()

    @Unroll
    def "image scanning test with toggle enforcement(#imageName, #test, #policyName, #enforcement)"() {
        given:
        "a scanner repo with images"
        when:
        "Jenkins is setup"
        then:
        Policy updatedPolicy = policyObj.getUpdatedPolicy(policyName, "v0.4.2", enforcement)
        Policies policies = restApiClient.getPolicies()
        def policyId = policies.policies.find { it.name == policyName }?.id
        if (policyId != null) {
            restApiClient.updatePolicy(updatedPolicy, policyId)
        }
        else {
            println("Policy id is null")
            throw new NullPointerException()
        }
        Policy enforcementPolicy = restApiClient.getPolicy(policyId)
        if ( enforcement == "UNSET_ENFORCEMENT") {
            assert enforcementPolicy.enforcementActions.empty
        } else {
            assert enforcementPolicy.enforcementActions == [enforcement]
        }
        assert enforcementPolicy.lifecycleStages == ["BUILD"]
        File configfile = DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, true, true)
        String jobName = restApiClient.createJenkinsJob(cachedJenkinsIp, configfile)
        restApiClient.startJenkinsBuild(jenkinsAddress, jobName)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, jenkinsAddress)
        assert status == endStatus
        where:
        "data inputs are: "
        imageName                            | test                                     | policyName         | enforcement              | endStatus
        "k8s.gcr.io/prometheus-to-sd:v0.4.2" | "Test prometheus image used in stackrox" | "90-Day Image Age" | "UNSET_ENFORCEMENT"      | "SUCCESS"
        "k8s.gcr.io/prometheus-to-sd:v0.4.2" | "Test prometheus image used in stackrox" | "90-Day Image Age" | "FAIL_BUILD_ENFORCEMENT" | "FAILURE"

    }

    @Unroll
    def "image scanning test with images enforcement turned on (#imageName, #test, #policyName, #tag)"() {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        Policy updatedPolicy = policyObj.getUpdatedPolicy(policyName, tag)
        Policies policies = restApiClient.getPolicies()
        def policyId = policies.policies.find { it.name == policyName }?.id
        println("Updating the policy $policyName")
        if (policyId != null ) {
            restApiClient.updatePolicy(updatedPolicy, policyId)
        }
        else {
            println("Policy id is null")
            throw new NullPointerException()
        }
        Policy enforcementPolicy = restApiClient.getPolicy(policyId)
        assert enforcementPolicy.enforcementActions == ["FAIL_BUILD_ENFORCEMENT"]
        assert enforcementPolicy.lifecycleStages == ["BUILD"]
        File configFile = DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, true, true)
        String jobName = restApiClient.createJenkinsJob(cachedJenkinsIp, configFile)
        restApiClient.startJenkinsBuild(cachedJenkinsIp, jobName)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, cachedJenkinsIp)
        assert status == "FAILURE"
        where:
        "data inputs are: "
        imageName             | policyName                     | tag
        "jenkins/jenkins:lts" |  "Fixable CVSS >= 7"           | "lts"
        "nginx:latest"        | "Testing nginx with latest tag"| "Latest tag"
    }

    @Unroll
    def "Jenkins plugin image scanning with configuration error"() {
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
        imageName             | failOnCriticalPluginError | test                                 | endStatus
        "jenkins/jenkins:lts" | true                      | "testing jenkins image with lts tag" | "SUCCESS"
        "mis-spelled:lts"     | true                      | "testing jenkins image with lts tag" | "FAILURE"
        "mis-spelled:lts"     | false                     | "testing jenkins image with lts tag" | "SUCCESS"

    }
}
