import data.BuildDetectRequest
import data.Alerts
import data.Alert
import data.DataUtil
import data.ListPolicyResponse
import data.Policy
import data.Policies

class ImageScanningTest extends BaseSpecification {

    def "image scanning test with the docker image + scenarios" () {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        println("Testing image ${imageName} and ${test}")
        Service svc = new Service("jenkins", "jenkins")
        def jenkinsEp = svc.getLoadBalancer(60)
        DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, true, true)
        File jenkinsTemplateFile = new File("src/test/resources/temp.xml")
        String jobName = restApiClient.createJenkinsJob(jenkinsEp, jenkinsTemplateFile)
        restApiClient.startJenkinsBuild(jobName, jenkinsEp)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, jenkinsEp)
        BuildDetectRequest buildDetectRequest = new BuildDetectRequest()
        buildDetectRequest.setProperty("image_name", imageName)
        Alerts alerts = restApiClient.getAlerts(buildDetectRequest)
        def policyEnforcement = true
        for (Alert alert : alerts.alerts ) {
            if (alert.policy.enforcement_actions == null) {
                 policyEnforcement = false
            }
        }
        assert status == "SUCCESS"
        assert policyEnforcement == false
        where:
        "data inputs are: "
         imageName | test
        "k8s.gcr.io/prometheus-to-sd:v0.4.2" | "Test prometheus image used in stackrox"

    }

    def "image scanning test with the docker image -ve scenarios" () {
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
        Service svc = new Service("jenkins", "jenkins")
        def jenkinsEp = svc.getLoadBalancer(60)
        DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, true, true)
        File file = new File("src/test/resources/temp.xml")
        String jobName = restApiClient.createJenkinsJob(jenkinsEp, file)
        restApiClient.startJenkinsBuild(jobName, jenkinsEp)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, jenkinsEp)
        assert status == "FAILURE"

        where:
        "data inputs are: "
        imageName | test
        "ngixn:latest" | "Tesing nginx with latest tag"
        "jenkins/jenkins:lts" | "testing jenkins image with latest tag"
    }


    def "image scanning test with the docker image -ve scenarios with ignore policy eval check" () {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        println("Testing image ${imageName} and ${test}")
        Service svc = new Service("jenkins", "jenkins")
        def jenkinsEp = svc.getLoadBalancer(60)
        DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, false, true)
        File jenkinsTemplateFile = new File("src/test/resources/temp.xml")
        String jobName = restApiClient.createJenkinsJob(jenkinsEp,  jenkinsTemplateFile)
        restApiClient.startJenkinsBuild(jobName, jenkinsEp)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, jenkinsEp)
        println("printing status")
        println status
        assert status == "SUCCESS"
        where:
        "data inputs are: "
        imageName | test
        "jenkins/jenkins:lts" | "testing jenkins image with latest tag"
    }

    def "image scanning test with the docker image -ve scenarios with ignore policy eval check + ignore fail configuration error" () {
        given:
        "a repo with images in the scanner repo"
        when:
        "Jenkins is setup"
        then:
        println("Testing image ${imageName} and ${test}")
        Service svc = new Service("jenkins", "jenkins")
        def jenkinsEp = svc.getLoadBalancer(60)
        DataUtil.createJenkinsConfig(imageName, "https://central.stackrox:443", token, false, false)
        File templateFile = new File("src/test/resources/temp.xml")
        String jobName = restApiClient.createJenkinsJob(jenkinsEp, templateFile)
        restApiClient.startJenkinsBuild(jobName, jenkinsEp)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, jenkinsEp)
        println("printing status")
        println status
        assert status == "SUCCESS"
        where:
        "data inputs are: "
        imageName | test
        "jenkins/jenkins:lts" | "testing jenkins image with latest tag"
    }
}
