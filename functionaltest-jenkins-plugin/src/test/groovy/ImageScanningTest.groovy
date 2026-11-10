import static com.offbytwo.jenkins.model.BuildResult.FAILURE
import static com.offbytwo.jenkins.model.BuildResult.SUCCESS
import static com.stackrox.model.StorageEnforcementAction.FAIL_BUILD_ENFORCEMENT
import static com.stackrox.model.StorageLifecycleStage.BUILD
import static com.stackrox.model.StorageLifecycleStage.DEPLOY

import com.offbytwo.jenkins.model.BuildResult

import com.stackrox.model.StorageEnforcementAction
import com.stackrox.model.StorageListPolicy
import com.stackrox.model.StoragePolicy
import com.stackrox.model.StoragePolicyGroup
import com.stackrox.model.StoragePolicySection
import com.stackrox.model.StoragePolicyValue
import com.stackrox.model.StorageSeverity

import util.Config

import spock.lang.Unroll

class ImageScanningTest extends BaseSpecification {

    protected static final String CENTRAL_URI = Config.roxEndpoint
    protected static final String QUAY_REPO = "quay.io/openshifttest/"

    @Unroll
    def "image scanning test with toggle enforcement(#imageName, #policyName,  #enforcements, #endStatus)"() {
        given:
        updatePolicy("Fixable CVSS >= 5", [])
        updatePolicy("Fixable Severity at least Important", [])

        when:
        StoragePolicy enforcementPolicy = updatePolicy(policyName, enforcements)

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
        StoragePolicy enforcementPolicy = updatePolicy(policyName, enforcements)

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
        "nginx-alpine:1.2.1"  | "Fixable CVSS >= 5" | "1.2.1"
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

    String getJobConfig(String imageName,
                        Boolean policyEvalCheck,
                        Boolean failOnCriticalPluginError,
                        Integer readTimeoutSeconds = null) {
        return new JenkinsClient.Config(
                imageName: QUAY_REPO + imageName,
                portalAddress: CENTRAL_URI,
                token: token,
                policyEvalCheck: policyEvalCheck,
                failOnCriticalPluginError: failOnCriticalPluginError,
                readTimeoutSeconds: readTimeoutSeconds)
                .createJobConfig()
    }

    StoragePolicy updatePolicy(String policyName, List<StorageEnforcementAction> enforcements) {
        List<StorageListPolicy> policies = restApiClient.policies
        def policyId = policies.find { it.name == policyName }?.id
        if (policyId == null && policyName == "Fixable CVSS >= 5") {
            // The minimal bundle includes fixable CVE-2022-2097 with CVSS 5.3 for the test image.
            return restApiClient.policyServiceApi.policyServicePostPolicy(new StoragePolicy(
                    name: policyName, policyVersion: "1.1", severity: StorageSeverity.MEDIUM_SEVERITY,
                    categories: ["Vulnerability Management"], disabled: false,
                    lifecycleStages: [BUILD, DEPLOY], enforcementActions: enforcements,
                    policySections: [new StoragePolicySection(policyGroups:
                            ["Fixed By": ".*", "CVSS": ">= 5"].collect { field, value ->
                                new StoragePolicyGroup(fieldName: field, values: [new StoragePolicyValue(value: value)])
                            })]), true)
        }
        assert policyId != null

        def policy = restApiClient.getPolicy(policyId)
        policy.with {
            setEnforcementActions(enforcements)
            setDisabled(false)
            // Clear exclusions and scope to avoid serialization issues with null values
            setExclusions([])
            setScope([])
        }
        restApiClient.updatePolicy(policy, policyId)
        return restApiClient.getPolicy(policyId)
    }

}
