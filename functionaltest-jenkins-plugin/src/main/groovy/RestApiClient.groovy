import static com.stackrox.jenkins.plugins.services.ApiClientFactory.StackRoxTlsValidationMode.INSECURE_ACCEPT_ANY

import groovy.transform.CompileStatic

import com.stackrox.api.ApiTokenServiceApi
import com.stackrox.api.MetadataServiceApi
import com.stackrox.api.PolicyServiceApi
import com.stackrox.invoker.ApiClient
import com.stackrox.jenkins.plugins.services.ApiClientFactory
import com.stackrox.model.StorageListPolicy
import com.stackrox.model.StoragePolicy
import com.stackrox.model.V1GenerateTokenRequest
import com.stackrox.model.V1Metadata

import util.Config

@CompileStatic
class RestApiClient {

    PolicyServiceApi policyServiceApi
    MetadataServiceApi metadataApi
    ApiTokenServiceApi tokenApi

    RestApiClient() {
        ApiClient apiClient = ApiClientFactory.newApiClient(Config.roxEndpoint, "", "", INSECURE_ACCEPT_ANY)
        apiClient.setBearerToken(null as String)
        apiClient.setUsername("admin")
        apiClient.setPassword(Config.roxPassword)

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
        return policyServiceApi.policyServiceListPolicies(null, null, null, null, null).getPolicies()
    }

    void updatePolicy(StoragePolicy policyObj, String id) {
        policyServiceApi.policyServicePutPolicy(id, policyObj)
    }

    StoragePolicy getPolicy(String id) {
        return policyServiceApi.policyServiceGetPolicy(id)
    }
}

