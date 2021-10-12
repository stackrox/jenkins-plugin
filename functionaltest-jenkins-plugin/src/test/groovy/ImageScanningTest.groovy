import static com.offbytwo.jenkins.model.BuildResult.FAILURE
import static com.offbytwo.jenkins.model.BuildResult.SUCCESS

import com.offbytwo.jenkins.model.BuildResult
import data.Policies
import data.Policy

import spock.lang.Unroll

class ImageScanningTest extends BaseSpecification {

    private static final String CENTRAL_URI = "https://central.stackrox:443"

    @Unroll
    def "image scanning test with toggle enforcement(#imageName, #policyName,  #enforcement, #endStatus)"() {
        given:
        "a scanner repo with images"
        when:
        "Jenkins is setup"
        then:
        Policy updatedPolicy = policyObj.getUpdatedPolicy(policyName, "latest", enforcement)
        Policies policies = restApiClient.getPolicies()
        def policyId = policies.policies.find { it.name == policyName }?.id
        assert policyId != null
        restApiClient.updatePolicy(updatedPolicy, policyId)
        Policy enforcementPolicy = restApiClient.getPolicy(policyId)
        if (enforcement == "UNSET_ENFORCEMENT") {
            assert enforcementPolicy.enforcementActions.empty
        } else {
            assert enforcementPolicy.enforcementActions == [enforcement]
        }
        assert enforcementPolicy.lifecycleStages == ["BUILD"]
        BuildResult status = jenkins.createAndRunJob(imageName, CENTRAL_URI, token, true, true)
        println "Jenkins job status is ${status}, expecting ${endStatus}"
        assert status == endStatus

        where:
        "data inputs are: "
        imageName      | policyName          | enforcement              | endStatus
        "nginx:latest" | "Fixable CVSS >= 7" | "UNSET_ENFORCEMENT"      | SUCCESS
        "nginx:latest" | "Fixable CVSS >= 7" | "FAIL_BUILD_ENFORCEMENT" | FAILURE
    }

    @Unroll
    def "image scanning test with images enforcement turned on (#imageName, #policyName, #tag, #enforcement)"() {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        Policy updatedPolicy = policyObj.getUpdatedPolicy(policyName, tag, enforcement)
        Policies policies = restApiClient.getPolicies()
        def policyId = policies.policies.find { it.name == policyName }?.id
        println "Updating the policy $policyName"
        assert policyId != null
        restApiClient.updatePolicy(updatedPolicy, policyId)
        Policy enforcementPolicy = restApiClient.getPolicy(policyId)
        assert enforcementPolicy.enforcementActions == ["FAIL_BUILD_ENFORCEMENT"]
        assert enforcementPolicy.lifecycleStages == ["BUILD"]
        BuildResult status = jenkins.createAndRunJob(imageName, CENTRAL_URI, token, true, true)
        assert status == FAILURE

        where:
        "data inputs are: "
        imageName             | policyName          | tag      | enforcement
        "jenkins/jenkins:lts" | "Fixable CVSS >= 7" | "lts"    | "FAIL_BUILD_ENFORCEMENT"
        "nginx:latest"        | "Latest tag"        | "latest" | "FAIL_BUILD_ENFORCEMENT"
    }

    @Unroll
    def "Negative image scanning tests (#imageName, #failOnCriticalPluginError,#endStatus)"() {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        BuildResult status = jenkins.createAndRunJob(imageName, CENTRAL_URI, token, false, failOnCriticalPluginError)
        println "Jenkins job status is ${status}, expecting ${endStatus}"
        assert status == endStatus

        where:
        "data inputs are: "
        imageName         | failOnCriticalPluginError | endStatus
        "postgres:latest" | true                      | SUCCESS
        "mis-spelled:lts" | true                      | FAILURE
        "mis-spelled:lts" | false                     | SUCCESS
    }
}
