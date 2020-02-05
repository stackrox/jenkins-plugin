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
        Service centralSvc = new Service("stackrox", "central")
        def central = centralSvc.getLoadBalancer(60)
        Service svc = new Service("qa", "jenkinsep")
        def jenkinsEp = svc.getLoadBalancer(60)
        DataUtil.createJenkinsConfig(imageName, "https://${central}:443", token, true, true)
        File file = new File("src/test/resources/temp.xml")
        String jobName = restApiClient.createJenkinsJob(jenkinsEp, file)
        restApiClient.startJenkinsBuild(jobName, jenkinsEp)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, jenkinsEp)
        BuildDetectRequest buildDetectRequest = new BuildDetectRequest()
        buildDetectRequest.setProperty("image_name", imageName)
        Alerts alerts = restApiClient.getAlerts(buildDetectRequest)
        for (Alert alert : alerts.alerts ) {
            println alert.policy.lifecycle_stages
        }
        assert status == "SUCCESS"
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
        println("Testing image ${imageName} and ${test}")
        Service centralSvc = new Service("stackrox", "central")
        def central = centralSvc.getLoadBalancer(60)
        Service svc = new Service("qa", "jenkinsep")
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
        def jenkinsEp = svc.getLoadBalancer(60)
        DataUtil.createJenkinsConfig(imageName, "https://${central}:443", token, true, true)
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
        Service centralSvc = new Service("stackrox", "central")
        def central = centralSvc.getLoadBalancer(60)
        Service svc = new Service("qa", "jenkinsep")
        def jenkinsEp = svc.getLoadBalancer(60)
        DataUtil.createJenkinsConfig(imageName, "https://${central}:443", token, false, true)
        File file = new File("src/test/resources/temp.xml")
        String jobName = restApiClient.createJenkinsJob(jenkinsEp, file)
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
        Service centralSvc = new Service("stackrox", "central")
        def central = centralSvc.getLoadBalancer(60)
        Service svc = new Service("qa", "jenkinsep")
        def jenkinsEp = svc.getLoadBalancer(60)
        DataUtil.createJenkinsConfig(imageName, "https://${central}:443", token, false, false)
        File file = new File("src/test/resources/temp.xml")
        String jobName = restApiClient.createJenkinsJob(jenkinsEp, file)
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
