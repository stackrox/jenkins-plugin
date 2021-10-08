import static com.jayway.restassured.RestAssured.given

import com.jayway.restassured.specification.RequestSpecification
import groovy.transform.CompileStatic
import okhttp3.OkHttpClient

import com.stackrox.api.ApiTokenServiceApi
import com.stackrox.api.PolicyServiceApi
import com.stackrox.invoker.ApiClient
import com.stackrox.model.StorageListPolicy
import com.stackrox.model.StoragePolicy
import com.stackrox.model.V1GenerateTokenRequest

import common.Constants

@CompileStatic
class RestApiClient {

    ApiClient apiClient
    String authHeaderValue
    PolicyServiceApi policyServiceApi

    RestApiClient() {
        def env = System.getenv()

        OkHttpClient client = UnsafeOkHttpClient.getUnsafeOkHttpClient()
        apiClient = new ApiClient(client)
        apiClient.setBasePath(Constants.BASEURL)
        apiClient.setUsername(Constants.CLUSTERUSERNAME)
        apiClient.setPassword(env['ROX_PASSWORD'])

        policyServiceApi = new PolicyServiceApi(apiClient)
    }

    protected RequestSpecification createRequestSpecification() {
        String header = "Authorization"
        String value = authHeaderValue
        return given().relaxedHTTPSValidation().header(header, value)
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

