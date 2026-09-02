import java.time.Duration

import groovy.transform.CompileStatic
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

import com.stackrox.api.ApiTokenServiceApi
import com.stackrox.api.MetadataServiceApi
import com.stackrox.api.PolicyServiceApi
import com.stackrox.invoker.ApiClient
import com.stackrox.model.PolicyServicePutPolicyBody
import com.stackrox.model.StorageListPolicy
import com.stackrox.model.StoragePolicy
import com.stackrox.model.V1GenerateTokenRequest
import com.stackrox.model.V1Metadata

import util.Config

@CompileStatic
class RestApiClient {
    private static final Duration TIMEOUT = Duration.ofSeconds(30)

    PolicyServiceApi policyServiceApi
    MetadataServiceApi metadataApi
    ApiTokenServiceApi tokenApi

    RestApiClient() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            void log(String message) {
                println("[HTTP] ${message}")
            }
        })
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        OkHttpClient client = OkHttpClient.Builder.newInstance()
                .addInterceptor(loggingInterceptor)
                .retryOnConnectionFailure(true)
                .connectTimeout(TIMEOUT)
                .readTimeout(TIMEOUT)
                .writeTimeout(TIMEOUT)
                .build()
        ApiClient apiClient = new ApiClient(client)
        apiClient.setBearerToken(null as String)
        apiClient.setUsername("admin")
        apiClient.setPassword(Config.roxPassword)
        apiClient.setBasePath(Config.roxEndpoint)

        policyServiceApi = new PolicyServiceApi(apiClient)
        metadataApi = new MetadataServiceApi(apiClient)
        tokenApi = new ApiTokenServiceApi(apiClient)
    }

    V1Metadata getMetadata() {
        metadataApi.metadataServiceGetMetadata()
    }

    String getToken(String name, String role) {
        V1GenerateTokenRequest tokenRequest = new V1GenerateTokenRequest().name(name).role(role)
        return tokenApi.aPITokenServiceGenerateToken(tokenRequest).token
    }

    List<StorageListPolicy> getPolicies() {
        return policyServiceApi.policyServiceListPolicies(null, null, null, null, null, null, null).getPolicies()
    }

    void updatePolicy(StoragePolicy policyObj, String id) {
        // Convert StoragePolicy to PolicyServicePutPolicyBody for openapi-generator 7.25.0
        PolicyServicePutPolicyBody body = new PolicyServicePutPolicyBody()
        body.with {
            setName(policyObj.getName())
            setDescription(policyObj.getDescription())
            setRationale(policyObj.getRationale())
            setRemediation(policyObj.getRemediation())
            setDisabled(policyObj.getDisabled())
            setCategories(policyObj.getCategories())
            setLifecycleStages(policyObj.getLifecycleStages())
            setEventSource(policyObj.getEventSource())
            setExclusions(policyObj.getExclusions())
            setScope(policyObj.getScope())
            setSeverity(policyObj.getSeverity())
            setEnforcementActions(policyObj.getEnforcementActions())
            setNotifiers(policyObj.getNotifiers())
            setSoRTName(policyObj.getSoRTName())
            setSoRTLifecycleStage(policyObj.getSoRTLifecycleStage())
            setSoRTEnforcement(policyObj.getSoRTEnforcement())
            setPolicyVersion(policyObj.getPolicyVersion())
            setPolicySections(policyObj.getPolicySections())
            setMitreAttackVectors(policyObj.getMitreAttackVectors())
            setCriteriaLocked(policyObj.getCriteriaLocked())
            setMitreVectorsLocked(policyObj.getMitreVectorsLocked())
            setIsDefault(policyObj.getIsDefault())
            setSource(policyObj.getSource())
        }

        policyServiceApi.policyServicePutPolicy(id, body)
    }

    StoragePolicy getPolicy(String id) {
        return policyServiceApi.policyServiceGetPolicy(id)
    }
}

