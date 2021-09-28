import static io.stackrox.proto.storage.PolicyOuterClass.EnforcementAction.FAIL_BUILD_ENFORCEMENT
import static io.stackrox.proto.storage.PolicyOuterClass.LifecycleStage.BUILD
import static io.stackrox.proto.storage.PolicyOuterClass.Policy
import static io.stackrox.proto.storage.PolicyOuterClass.Severity.MEDIUM_SEVERITY
import services.PolicyService
import spock.lang.Unroll

class ImageScanningTest extends BaseSpecification {

    private static final String CENTRAL_URI = "https://central.stackrox:443"

    @Unroll
    def "image scanning test with toggle enforcement(#imageName, #policyName,  #enforcements, #endStatus)"() {
        given:
        def policies = PolicyService.getPolicies()
        def policyId = policies.find { it.name == policyName }?.id
        assert policyId != null

        when:
        Policy policy = PolicyService.getPolicy(policyId)
        Policy updatedPolicy = Policy.newBuilder(policy)
                .clearLifecycleStages()
                .addAllLifecycleStages([BUILD])
                .setSeverity(MEDIUM_SEVERITY)
                .clearCategories()
                .addAllCategories(["Image Assurance"])
                .clearEnforcementActions()
                .addAllEnforcementActions(enforcements)
                .build()

        PolicyService.updatePolicy(updatedPolicy)
        Policy enforcementPolicy = PolicyService.getPolicy(policyId)

        then:
        assert enforcementPolicy.enforcementActionsList == enforcements
        assert enforcementPolicy.lifecycleStagesList == [BUILD]

        when:
        File configFile = jenkins.createJobConfig(imageName, CENTRAL_URI, token, true, true)
        String jobName = jenkins.createJob(configFile)
        jenkins.startBuild(jobName)

        then:
        String status = jenkins.getBuildStatus(jobName, 60)
        println "Jenkins job status is ${status}, expecting ${endStatus}"
        assert status == endStatus

        cleanup:
        jenkins.deleteJob(jobName)

        where:
        imageName      | policyName   | enforcements             | endStatus
        "nginx:latest" | "Latest tag" | []                       | "SUCCESS"
        "nginx:latest" | "Latest tag" | [FAIL_BUILD_ENFORCEMENT] | "FAILURE"
    }

    @Unroll
    def "image scanning test with images enforcement turned on (#imageName, #policyName, #tag)"() {
        given:
        def policies = PolicyService.getPolicies()
        def policyId = policies.find { it.name == policyName }?.id
        assert policyId != null

        when:
        Policy policy = PolicyService.getPolicy(policyId)
        Policy updatedPolicy = Policy.newBuilder(policy)
                .clearLifecycleStages()
                .addAllLifecycleStages([BUILD])
                .setSeverity(MEDIUM_SEVERITY)
                .clearCategories()
                .addAllCategories(["Image Assurance"])
                .clearEnforcementActions()
                .addAllEnforcementActions([FAIL_BUILD_ENFORCEMENT])
                .build()

        PolicyService.updatePolicy(updatedPolicy)
        Policy enforcementPolicy = PolicyService.getPolicy(policyId)

        then:
        assert enforcementPolicy.enforcementActionsList == [FAIL_BUILD_ENFORCEMENT]
        assert enforcementPolicy.lifecycleStagesList == [BUILD]

        when:
        File configFile = jenkins.createJobConfig(imageName, CENTRAL_URI, token, true, true)
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
        File configFile = jenkins.createJobConfig(imageName, CENTRAL_URI, token, false, failOnCriticalPluginError)
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
