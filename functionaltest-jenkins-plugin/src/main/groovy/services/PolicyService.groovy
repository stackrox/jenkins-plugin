package services


import static io.stackrox.proto.api.v1.PolicyServiceGrpc.PolicyServiceBlockingStub
import static io.stackrox.proto.api.v1.PolicyServiceGrpc.newBlockingStub
import groovy.transform.CompileStatic
import io.stackrox.proto.api.v1.Common
import io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery
import io.stackrox.proto.storage.PolicyOuterClass

@CompileStatic
class PolicyService extends BaseService {
    static PolicyServiceBlockingStub getPolicyClient() {
        return newBlockingStub(getChannel())
    }

    static PolicyOuterClass.Policy getPolicy(String id) {
        return getPolicyClient().getPolicy(Common.ResourceByID.newBuilder().setId(id).build())
    }

    static List<PolicyOuterClass.ListPolicy> getPolicies(RawQuery query = RawQuery.newBuilder().build()) {
        return getPolicyClient().listPolicies(query).policiesList
    }

    static void updatePolicy(PolicyOuterClass.Policy policy) {
        getPolicyClient().putPolicy(policy)
    }
}
