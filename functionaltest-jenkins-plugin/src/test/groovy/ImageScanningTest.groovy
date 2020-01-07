import Data.BuildDetectRequest
import Data.Alert
import Data.DataUtil



class ImageScanningTest extends BaseSpecification {


    def "image scanning test with the docker image" () {
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
        "docker.io/jenkins/jenkins:lts" | null
        "gcr.io/projectcalico-org/cni:v3.2.7" | null
        "k8s.gcr.io/k8s-dns-dnsmasq-nanny-amd64:1.15.4" | null
        "docker.io/stackrox/monitoring:3.0.36.x-76-ge2cd63ab34" | null
        "k8s.gcr.io/cluster-proportional-autoscaler-amd64:1.1.2-r2" | null
        "gcr.io/projectcalico-org/cni:v3.2.7" | null
        "k8s.gcr.io/k8s-dns-dnsmasq-nanny-amd64:1.15.4" | null
        "k8s.gcr.io/k8s-dns-kube-dns-amd64:1.15.4" | null
        "k8s.gcr.io/k8s-dns-sidecar-amd64:1.15.4" | null
        "k8s.gcr.io/cluster-proportional-autoscaler-amd64:1.3.0" | null
        "k8s.gcr.io/prometheus-to-sd:v0.8.2" | null
        "k8s.gcr.io/addon-resizer:1.8.3" | null
        "k8s.gcr.io/prometheus-to-sd:v0.5.0" | null
        "k8s.gcr.io/cpvpa-amd64:v0.7.1" | null
        "gcr.io/projectcalico-org/typha:v3.2.7" |  null
        "k8s.gcr.io/defaultbackend-amd64:1.5" | null
        "k8s.gcr.io/metrics-server-amd64:v0.3.1" | null
        "k8s.gcr.io/addon-resizer:1.8.4" | null
        "docker.io/stackrox/scanner-db:2.0.2" | null
        "docker.io/stackrox/scanner:2.0.2" | null
        "docker.io/stackrox/main:3.0.36.x-76-ge2cd63ab34" | null
        "k8s.gcr.io/prometheus-to-sd:v0.4.2" | null
        "docker.io/stackrox/collector:2.5.9-latest" | null

    }




}
