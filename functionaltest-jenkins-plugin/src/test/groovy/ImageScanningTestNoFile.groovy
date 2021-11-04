import static JenkinsClient.createJobConfigNoFile

class ImageScanningTestNoFileTest extends ImageScanningTest {
    @Override
    String getJobConfig(String imageName, Boolean policyEvalCheck, Boolean failOnCriticalPluginError) {
        return createJobConfigNoFile(imageName, CENTRAL_URI, token, policyEvalCheck, failOnCriticalPluginError)
    }
}
