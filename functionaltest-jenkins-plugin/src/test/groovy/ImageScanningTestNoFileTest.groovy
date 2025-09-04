class ImageScanningTestNoFileTest extends ImageScanningTest {
    @Override
    String getJobConfig(String imageName, Boolean policyEvalCheck, Boolean failOnCriticalPluginError) {
        return new JenkinsClient.Config(
                imageName: QUAY_REPO + imageName,
                portalAddress: CENTRAL_URI,
                token: token,
                policyEvalCheck: policyEvalCheck,
                failOnCriticalPluginError: failOnCriticalPluginError,
                ).createJobConfigNoFile()
    }
}
