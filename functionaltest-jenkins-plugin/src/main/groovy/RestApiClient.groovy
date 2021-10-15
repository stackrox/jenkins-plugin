import groovy.transform.CompileStatic
import okhttp3.OkHttpClient

import com.stackrox.api.ApiTokenServiceApi
import com.stackrox.api.PolicyServiceApi
import com.stackrox.invoker.ApiClient
import com.stackrox.model.StorageListPolicy
import com.stackrox.model.StoragePolicy
import com.stackrox.model.V1GenerateTokenRequest

@CompileStatic
class RestApiClient {

    ApiClient apiClient
    String authHeaderValue
    PolicyServiceApi policyServiceApi

    RestApiClient() {
        def env = System.getenv()

        OkHttpClient client = UnsafeOkHttpClient.getUnsafeOkHttpClient()
        apiClient = new ApiClient(client)
        apiClient.setBasePath("https://localhost:8000")
        apiClient.setUsername("admin")
        apiClient.setPassword(env['ROX_PASSWORD'])

        policyServiceApi = new PolicyServiceApi(apiClient)
    }

    String getToken(String name, String role) {
        V1GenerateTokenRequest tokenRequest = new V1GenerateTokenRequest().name(name).role(role)
        return new ApiTokenServiceApi(apiClient).aPITokenServiceGenerateToken(tokenRequest).token
    }

    List<StorageListPolicy> getPolicies() {
        return policyServiceApi.policyServiceListPolicies(null, null, null, null, null).getPolicies()
    }

    def updatePolicy(StoragePolicy policyObj, String id) {
        return (StoragePolicy) policyServiceApi.policyServicePutPolicy(id, policyObj)
    }

    StoragePolicy getPolicy(String id) {
        return policyServiceApi.policyServiceGetPolicy(id)
    }
}

