import Data.BuildDetectRequest
import Data.Alert
import Data.DataUtil
import Data.ListPolicyResponse
import Data.Policy

class ImageScanningTest extends BaseSpecification {

    def setup() {

    }

    def "image scanning test with the docker image" () {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        def imageName = "docker.io/jenkins/jenkins:lts"
        Service centralSvc = new Service("stackrox","central")
        def central = centralSvc.getLoadBalancer()
        Service svc = new Service("stackrox","jenkinsep")
        def jenkinsEp = svc.getLoadBalancer()
        DataUtil.formatXml("src/main/resources/template.xml", imageName,"https://${central}:443", token)
        String jobName = restApiClient.createJenkinsJob(jenkinsEp)
        restApiClient.startJenkinsBuild(jobName, jenkinsEp)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 600, jenkinsEp)
        assert status == "SUCCESS"
        Policy policy = new Policy()
        Policy.PolicyFields policyFields = new Policy.PolicyFields()
        Policy.PolicyFields.ImageNamePolicy imageNamePolicy = new Policy.PolicyFields.ImageNamePolicy()
        policyFields.setImage_name(imageNamePolicy)
        imageNamePolicy.setTag("latest")
        policy.with {
                name = "Latest Tag" + new Random().nextInt(500)
                description = "Policy violation agaist latest Tag"
                rationale = "Test Rationale"
                categories = ["Image Assurance"]
                fields = policyFields
                lifecycle_stages = ["BUILD"]
                severity = "MEDIUM_SEVERITY"
                enforcement_actions = ["FAIL_BUILD_ENFORCEMENT"]
            }
        Policy responsePolicy = restApiClient.createPolicy(policy)
        println responsePolicy.name
        ListPolicyResponse [] policies = restApiClient.getPolicies()
        for (ListPolicyResponse policy1 : policies) {
            if (policy1.name == "Latest tag") {
                println("printing latest tag policy id")
                println(policy1.id)
            }
        }

        Policy newpolicy = new Policy()
        newpolicy.with {
            name = "Test image Tag1111"
            description = "Test image tag12"
            rationale = "Test image tag12"
            categories = ["Image Assurance"]
            fields = policyFields
            lifecycle_stages = ["BUILD","DEPLOY"]
            severity = "MEDIUM_SEVERITY"
            enforcement_actions = ["FAIL_BUILD_ENFORCEMENT"]
        }
        restApiClient.updatePolicy(newpolicy,"2e90874a-3521-44de-85c6-5720f519a701")
        Policy policy1 = restApiClient.getPolicy("2e90874a-3521-44de-85c6-5720f519a701")
        BuildDetectRequest buildDetectRequest = new BuildDetectRequest();
        buildDetectRequest.setProperty("image_name",imageName)
        Alert[] alerts =restApiClient.getAlerts(buildDetectRequest)
        for (Alert alert : alerts) {
            if (alert.policy.name == "Ubuntu Package Manager in Image") {
                println(alert.policy.enforcement_actions)
            }
        }

    }
}
