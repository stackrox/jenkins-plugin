import data.BuildDetectRequest
import data.DataUtil
import data.ListPolicyResponse
import data.Policy
import data.Policies
import spock.lang.Unroll

class ImageScanningTest extends BaseSpecification {

    final String cachedJenkinsIp = getJenkinsAddress()

    def "image scanning test with the docker image + scenarios"() {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        println("Testing image ${imageName} and ${test}")
        DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, true, true)
        File tempJenkinsConfigFile = new File("src/test/resources/temp.xml")
        String jobName = restApiClient.createJenkinsJob(cachedJenkinsIp, tempJenkinsConfigFile)
        restApiClient.startJenkinsBuild(jenkinsAddress,  jobName)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, jenkinsAddress)
        assert status == "SUCCESS"
        where:
        "data inputs are: "
        imageName                            | test
        "k8s.gcr.io/prometheus-to-sd:v0.4.2" | "Test prometheus image used in stackrox"
    }

    @Unroll
    def "image scanning test with the docker image -ve scenarios"() {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        println("Testing image ${imageName} and ${test}")
        Policy newpolicy = new Policy()
        Policy.PolicyFields policyFields = new Policy.PolicyFields()
        Policy.PolicyFields.ImageNamePolicy imageNamePolicy = new Policy.PolicyFields.ImageNamePolicy()
        policyFields.setImage_name(imageNamePolicy)
        imageNamePolicy.setTag("latest")
        newpolicy.with {
            name = "Latest tag"
            description = "Violation against latest tag"
            rationale = "Make sure the builds are latest"
            categories = ["Image Assurance"]
            fields = policyFields
            lifecycle_stages = ["BUILD"]
            severity = "MEDIUM_SEVERITY"
            enforcement_actions = ["FAIL_BUILD_ENFORCEMENT"]
        }
        Policies policies = restApiClient.getPolicies()
        for (ListPolicyResponse policy : policies.policies) {
            if (policy.name == "Latest tag") {
                println("Updating the latest tag policy")
                restApiClient.updatePolicy(newpolicy, policy.id)
            }
        }
        DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, true, true)
        File tempJenkinsConfigFile = new File("src/test/resources/temp.xml")
        String jobName = restApiClient.createJenkinsJob(cachedJenkinsIp, tempJenkinsConfigFile)
        restApiClient.startJenkinsBuild(cachedJenkinsIp, jobName)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, cachedJenkinsIp)
        assert status == "FAILURE"
        where:
        "data inputs are: "
        imageName             | test
        "nginx:latest"        | "Testing nginx with latest tag"
    }

    @Unroll
    def "image scanning test with docker hub images -ve scenario"() {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        println("Testing image ${imageName} and ${test}")
        DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, true, true)
        File tempJenkinsConfigFile = new File("src/test/resources/temp.xml")
        String jobName = restApiClient.createJenkinsJob(cachedJenkinsIp, tempJenkinsConfigFile)
        restApiClient.startJenkinsBuild(cachedJenkinsIp, jobName)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, cachedJenkinsIp)
        assert status == "FAILURE"
        where:
        "data inputs are: "
        imageName             | test
        "jenkins/jenkins:lts" | "Testing jenkins/jenkins:lts for policy Fixable CVSS >= 7"
    }

    @Unroll
    def "image scanning test with the docker image -ve scenarios with ignore policy eval check"() {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        println("Testing image ${imageName} and ${test}")
        DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, false, failOnCriticalPluginError)
        File tempJenkinsConfigFile = new File("src/test/resources/temp.xml")
        String jobName = restApiClient.createJenkinsJob(cachedJenkinsIp, tempJenkinsConfigFile)
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
