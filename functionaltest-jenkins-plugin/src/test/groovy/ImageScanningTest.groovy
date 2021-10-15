import static com.offbytwo.jenkins.model.BuildResult.FAILURE
import static com.offbytwo.jenkins.model.BuildResult.SUCCESS
import static com.stackrox.model.StorageEnforcementAction.FAIL_BUILD_ENFORCEMENT
import static com.stackrox.model.StorageLifecycleStage.BUILD

import com.offbytwo.jenkins.model.BuildResult

import com.stackrox.model.StorageEnforcementAction
import com.stackrox.model.StorageImageNamePolicy
import com.stackrox.model.StorageListPolicy
import com.stackrox.model.StoragePolicy
import com.stackrox.model.StoragePolicyFields
import com.stackrox.model.StorageSeverity

import spock.lang.Unroll

class ImageScanningTest extends BaseSpecification {

    private static final String CENTRAL_URI = "https://central.stackrox:443"

    @Unroll
    def "image scanning test with toggle enforcement(#imageName, #policyName,  #enforcements, #endStatus)"() {
        when:
        StoragePolicy enforcementPolicy = updatePolicy(policyName, "latest", enforcements)

        then:
        assert enforcementPolicy.enforcementActions == enforcements
        assert enforcementPolicy.lifecycleStages == [BUILD]

        when:
        BuildResult status = jenkins.createAndRunJob(imageName, CENTRAL_URI, token, true, true)

        then:
        assert status == endStatus

        where:
        "data inputs are: "
        imageName      | policyName          | enforcements             | endStatus
        "nginx:latest" | "Fixable CVSS >= 7" | []                       | SUCCESS
        "nginx:latest" | "Fixable CVSS >= 7" | [FAIL_BUILD_ENFORCEMENT] | FAILURE
    }

    @Unroll
    def "image scanning test with images enforcement turned on (#imageName, #policyName, #tag, #enforcement)"() {
        when:
        StoragePolicy enforcementPolicy = updatePolicy(policyName, tag, [enforcement])

        then:
        assert enforcementPolicy.enforcementActions == [FAIL_BUILD_ENFORCEMENT]
        assert enforcementPolicy.lifecycleStages == [BUILD]

        when:
        BuildResult status = jenkins.createAndRunJob(imageName, CENTRAL_URI, token, true, true)

        then:
        assert status == FAILURE

        where:
        "data inputs are: "
        imageName             | policyName          | tag      | enforcement
        "jenkins/jenkins:lts" | "Fixable CVSS >= 7" | "lts"    | FAIL_BUILD_ENFORCEMENT
        "nginx:latest"        | "Latest tag"        | "latest" | FAIL_BUILD_ENFORCEMENT
    }

    @Unroll
    def "Negative image scanning tests (#imageName, #failOnCriticalPluginError,#endStatus)"() {
        when:
        BuildResult status = jenkins.createAndRunJob(imageName, CENTRAL_URI, token, false, failOnCriticalPluginError)

        then:
        assert status == endStatus

        where:
        "data inputs are: "
        imageName         | failOnCriticalPluginError | endStatus
        "postgres:latest" | true                      | SUCCESS
        "mis-spelled:lts" | true                      | FAILURE
        "mis-spelled:lts" | false                     | SUCCESS
    }

    StoragePolicy updatePolicy(String policyName, String tag, List<StorageEnforcementAction> enforcements) {
        List<StorageListPolicy> policies = restApiClient.policies
        def policyId = policies.find { it.name == policyName }?.id
        assert policyId != null

        StoragePolicy updatedPolicy = getUpdatedPolicy(policyName, tag, enforcements)
        restApiClient.updatePolicy(updatedPolicy, policyId)
        return restApiClient.getPolicy(policyId)
    }

    StoragePolicy getUpdatedPolicy(String policyName, String tag, List<StorageEnforcementAction> enforcements) {
        StoragePolicy updatedPolicy = new StoragePolicy()
                .name(policyName)
                .lifecycleStages([BUILD])
                .severity(StorageSeverity.MEDIUM_SEVERITY)
                .fields(new StoragePolicyFields().imageName(
                        new StorageImageNamePolicy().tag(tag)))
                .categories(["Image Assurance"])
                .enforcementActions(enforcements)
        return updatedPolicy
    }
}
