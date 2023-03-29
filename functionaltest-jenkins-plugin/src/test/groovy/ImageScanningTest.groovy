import static JenkinsClient.createJobConfig
import static com.offbytwo.jenkins.model.BuildResult.FAILURE
import static com.offbytwo.jenkins.model.BuildResult.SUCCESS
import static com.stackrox.model.StorageEnforcementAction.FAIL_BUILD_ENFORCEMENT
import static com.stackrox.model.StorageLifecycleStage.BUILD
import static com.stackrox.model.StorageLifecycleStage.DEPLOY

import com.offbytwo.jenkins.model.BuildResult

import com.stackrox.model.StorageEnforcementAction
import com.stackrox.model.StorageImageNamePolicy
import com.stackrox.model.StorageListPolicy
import com.stackrox.model.StoragePolicy
import com.stackrox.model.StoragePolicyFields

import util.Config

import spock.lang.Unroll

class ImageScanningTest extends BaseSpecification {

    protected static final String CENTRAL_URI = Config.centralUri
    protected static final String QUAY_REPO = "quay.io/openshifttest/"

    @Unroll
    def "image scanning test with toggle enforcement(#imageName, #policyName,  #enforcements, #endStatus)"() {
        given:
        updatePolicy("Fixable CVSS >= 7", "latest", [])
        updatePolicy("Fixable Severity at least Important", "latest", [])

        when:
        StoragePolicy enforcementPolicy = updatePolicy(policyName, "latest", enforcements)

        then:
        assert enforcementPolicy.enforcementActions == enforcements
        assert enforcementPolicy.lifecycleStages == [BUILD, DEPLOY]

        when:
        BuildResult status = jenkins.createAndRunJob(
                getJobConfig(imageName, true, true))

        then:
        assert status == endStatus

        where:
        "data inputs are: "
        imageName             | policyName   | enforcements             | endStatus
        "nginx-alpine:latest" | "Latest tag" | []                       | SUCCESS
        "nginx-alpine:latest" | "Latest tag" | [FAIL_BUILD_ENFORCEMENT] | FAILURE
    }

    @Unroll
    def "image scanning test with images enforcement turned on (#imageName, #policyName, #tag)"() {
        when:
        def enforcements = [FAIL_BUILD_ENFORCEMENT]
        StoragePolicy enforcementPolicy = updatePolicy(policyName, tag, enforcements)

        then:
        assert enforcementPolicy.enforcementActions == enforcements
        assert enforcementPolicy.lifecycleStages == [BUILD, DEPLOY]

        when:
        BuildResult status = jenkins.createAndRunJob(
                getJobConfig(imageName, true, true))

        then:
        assert status == FAILURE

        where:
        "data inputs are: "
        imageName             | policyName          | tag
        "nginx-alpine:1.2.1"  | "Fixable CVSS >= 7" | "1.2.1"
        "nginx-alpine:latest" | "Latest tag"        | "latest"
    }

    @Unroll
    def "Negative image scanning tests (#imageName, #failOnCriticalPluginError,#endStatus)"() {
        when:
        BuildResult status = jenkins.createAndRunJob(
                getJobConfig(imageName, false, failOnCriticalPluginError))

        then:
        assert status == endStatus

        where:
        "data inputs are: "
        imageName             | failOnCriticalPluginError | endStatus
        "nginx-alpine:latest" | true                      | SUCCESS
        "mis-spelled:lts"     | true                      | FAILURE
        "mis-spelled:lts"     | false                     | SUCCESS
    }

    String getJobConfig(String imageName, Boolean policyEvalCheck, Boolean failOnCriticalPluginError) {
        return createJobConfig(QUAY_REPO + imageName, CENTRAL_URI, token, policyEvalCheck, failOnCriticalPluginError)
    }

    StoragePolicy updatePolicy(String policyName, String tag, List<StorageEnforcementAction> enforcements) {
        List<StorageListPolicy> policies = restApiClient.policies
        def policyId = policies.find { it.name == policyName }?.id
        assert policyId != null

        def policy = restApiClient.getPolicy(policyId)
        policy.setEnforcementActions(enforcements)
        policy.setFields(new StoragePolicyFields().imageName(new StorageImageNamePolicy().tag(tag)))
        policy.setDisabled(false)
        restApiClient.updatePolicy(policy, policyId)
        return restApiClient.getPolicy(policyId)
    }

}
