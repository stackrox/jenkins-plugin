import java.time.Duration

import groovy.transform.CompileStatic
import okhttp3.OkHttpClient

import com.stackrox.api.ApiTokenServiceApi
import com.stackrox.api.ClustersServiceApi
import com.stackrox.api.MetadataServiceApi
import com.stackrox.api.PolicyServiceApi
import com.stackrox.invoker.ApiClient
import com.stackrox.model.ClusterHealthStatusHealthStatusLabel
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
    ClustersServiceApi clusterServiceApi

    RestApiClient() {
        OkHttpClient client = OkHttpClient.Builder.newInstance()
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
        clusterServiceApi = new ClustersServiceApi(apiClient)
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

    boolean isHealthy() {
        return !clusterServiceApi.clustersServiceGetClusters("")?.clusters?.every {
            it.healthStatus.getOverallHealthStatus() != ClusterHealthStatusHealthStatusLabel.HEALTHY
        }
    }
}

