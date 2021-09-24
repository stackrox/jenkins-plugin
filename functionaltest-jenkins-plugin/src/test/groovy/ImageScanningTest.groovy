import data.DataUtil
import data.Policies
import data.Policy
import spock.lang.Unroll

class ImageScanningTest extends BaseSpecification {

    @Unroll
    def "image scanning test with toggle enforcement(#imageName, #policyName,  #enforcements, #endStatus)"() {
        given:
        Policies policies = restApiClient.getPolicies()
        def policyId = policies.policies.find { it.name == policyName }?.id
        assert policyId != null

        when:
        Policy updatedPolicy = restApiClient.getPolicy(policyId)
        updatedPolicy.with {
            lifecycleStages = ["BUILD"]
            severity = "MEDIUM_SEVERITY"
            categories = ["Image Assurance"]
            enforcementActions = enforcements
        }
        restApiClient.updatePolicy(updatedPolicy, policyId)
        Policy enforcementPolicy = restApiClient.getPolicy(policyId)

        then:
        assert enforcementPolicy.enforcementActions == enforcements
        assert enforcementPolicy.lifecycleStages == ["BUILD"]

//        when:
//        File configfile = DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, true, true)
//        String jobName = jenkins.createJob(configfile)
//        jenkins.startBuild(jobName)
//
//        then:
//        String status = jenkins.getBuildStatus(jobName, 60)
//        println "Jenkins job status is ${status}, expecting ${endStatus}"
//        assert status == endStatus
//
//        cleanup:
//        jenkins.deleteJob(jobName)

        where:
        imageName      | policyName          | enforcements               | endStatus
        "nginx:latest" | "Fixable CVSS >= 7" | []                         | "SUCCESS"
        "nginx:latest" | "Fixable CVSS >= 7" | ["FAIL_BUILD_ENFORCEMENT"] | "FAILURE"
    }

    @Unroll
    def "image scanning test with images enforcement turned on (#imageName, #policyName, #tag, FAIL_BUILD_ENFORCEMENT)"() {
        when:
        Policy updatedPolicy = policyObj.getUpdatedPolicy(policyName, tag, ["FAIL_BUILD_ENFORCEMENT"])
        Policies policies = restApiClient.getPolicies()

        then:
        def policyId = policies.policies.find { it.name == policyName }?.id
        assert policyId != null

        when:
        println("Updating the policy $policyName")
        restApiClient.updatePolicy(updatedPolicy, policyId)

        then:
        Policy enforcementPolicy = restApiClient.getPolicy(policyId)
        assert enforcementPolicy.enforcementActions == ["FAIL_BUILD_ENFORCEMENT"]
        assert enforcementPolicy.lifecycleStages == ["BUILD"]

        when:
        File configFile = DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token,
                true, true)
        String jobName = jenkins.createJob(configFile)
        jenkins.startBuild(jobName)

        then:
        String status = jenkins.getBuildStatus(jobName, 60)
        assert status == "FAILURE"

        cleanup:
        jenkins.deleteJob(jobName)

        where:
        imageName             | policyName          | tag
        "jenkins/jenkins:lts" | "Fixable CVSS >= 7" | "lts"
        "nginx:latest"        | "Latest tag"        | "latest"
    }

    @Unroll
    def "Negative image scanning tests (#imageName, #failOnCriticalPluginError,#endStatus)"() {
        given:
        "a repo with images in the scanner repo"
        File configFile = DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token,
                false, failOnCriticalPluginError)
        String jobName = jenkins.createJob(configFile)

        when:
        "job is stared"
        jenkins.startBuild(jobName)

        then:
        String status = jenkins.getBuildStatus(jobName, 60)
        assert status == endStatus

        cleanup:
        jenkins.deleteJob(jobName)

        where:
        "data inputs are: "
        imageName         | failOnCriticalPluginError | endStatus
        "postgres:latest" | true                      | "SUCCESS"
        "mis-spelled:lts" | true                      | "FAILURE"
        "mis-spelled:lts" | false                     | "SUCCESS"
    }
}
