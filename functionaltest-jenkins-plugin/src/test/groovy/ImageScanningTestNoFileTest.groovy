import static JenkinsClient.createJobConfigNoFile

class ImageScanningTestNoFileTest extends ImageScanningTest {
    @Override
    String getJobConfig(String imageName, Boolean policyEvalCheck, Boolean failOnCriticalPluginError) {
        String image = QUAY_REPO + imageName
        return createJobConfigNoFile(image, CENTRAL_URI, token, policyEvalCheck, failOnCriticalPluginError)
    }
}
