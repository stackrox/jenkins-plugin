import Data.BuildDetectRequest
import Data.Alert


class ImageScanningTest extends BaseSpecification {

    def "image scanning test with the docker image" () {
        given:

        when:
        def imageName = "docker.io/stackrox/collector:2.5.9-latest"

        then:
        BuildDetectRequest buildDetectRequest = new BuildDetectRequest();
        buildDetectRequest.setProperty("image_name",imageName)
        Alert[] alerts =restApiClient.getAlerts(imageName, buildDetectRequest)
        assert alerts[0].violations[0].message != null
        assert alerts[0].id != null
        assert alerts[0].policy.categories != null
        assert alerts[0].policy.rationale != null
        assert alerts[0].policy.description != null
        assert alerts[0].violations.length != null
        assert alerts[0].enforcementaction == null
        assert alerts[0].policy.lifecycleStages != null
        assert alerts[0].policy.severity != null
        Service svc = new Service("qa","jenkinsep")
        String LoadBalancer = svc.getLoadBalancer()
        String jobName = restApiClient.createJenkinsJob(LoadBalancer)
        restApiClient.startJenkinsBuild(jobName, LoadBalancer)
        String status = restApiClient.getJenkinsBuildStatus(jobName, 60, LoadBalancer )
        assert status == "SUCCESS"
    }


}
