import Data.BuildDetectRequest
import Data.Alert
import Data.DataUtil
import Data.ListPolicyResponse
import Data.Policy


class ImageScanningTest extends BaseSpecification {

    def "image scanning test with the docker image + scenarios" () {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        println("Testing image $imageName")
        Service centralSvc = new Service("stackrox", "central")
        def central = centralSvc.getLoadBalancer()
        Service svc = new Service("qa", "jenkinsep")
        def jenkinsEp = svc.getLoadBalancer()
        DataUtil.formatXml("src/main/resources/template.xml", imageName, "https://${central}:443", token)
        String jobName = restApiClient.createJenkinsJob(jenkinsEp)
        restApiClient.startJenkinsBuild(jobName, jenkinsEp)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, jenkinsEp)
        BuildDetectRequest buildDetectRequest = new BuildDetectRequest();
        buildDetectRequest.setProperty("image_name", imageName)
        Alert[] alerts = restApiClient.getAlerts(buildDetectRequest)
        def alertFlag = false
        for (Alert alert : alerts) {
            if (alert.policy.enforcement_actions != null) {
                  alertFlag = true
            }
        }
        assert status == "SUCCESS"
        assert alertFlag == false

        where:
        "data inputs are: "
         imageName | test
        "k8s.gcr.io/k8s-dns-dnsmasq-nanny-amd64:1.15.4" | "Test dns image with +ve scenario"
        "k8s.gcr.io/prometheus-to-sd:v0.8.2" | "Testing prometheus image with +ve scenario"
    }

    def "image scanning test with the docker image -ve scenarios" () {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        println("Testing image $imageName")
        Service centralSvc = new Service("stackrox", "central")
        def central = centralSvc.getLoadBalancer()
        Service svc = new Service("qa", "jenkinsep")
        ListPolicyResponse[] policies = restApiClient.getPolicies()
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
        for (ListPolicyResponse policy1 : policies) {
            if (policy1.name == "Latest tag") {
                restApiClient.updatePolicy(newpolicy, policy1.id)
            }
        }
        def jenkinsEp = svc.getLoadBalancer()
        DataUtil.formatXml("src/main/resources/template.xml", imageName, "https://${central}:443", token)
        String jobName = restApiClient.createJenkinsJob(jenkinsEp)
        restApiClient.startJenkinsBuild(jobName, jenkinsEp)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, jenkinsEp)
        assert status == "FAILURE"

        where:
        "data inputs are: "
        imageName | test
        "ngixn:latest" | "Tesing nginx with latest tag"
        "docker.io/stackrox/collector:2.5.9-latest" | "testing collector image with latest tag"
    }
}
