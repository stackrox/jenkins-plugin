package services

import groovy.transform.CompileStatic
import io.stackrox.proto.api.v1.Common
import io.stackrox.proto.api.v1.PolicyServiceGrpc
import io.stackrox.proto.api.v1.SearchServiceOuterClass.RawQuery
import io.stackrox.proto.storage.PolicyOuterClass

@CompileStatic
class PolicyService extends BaseService {
    static getPolicyClient() {
        return PolicyServiceGrpc.newBlockingStub(getChannel())
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

    static deletePolicy(String policyID) {
        try {
            getPolicyClient().deletePolicy(
                    Common.ResourceByID.newBuilder()
                            .setId(policyID)
                            .build()
            )
        } catch (Exception e) {
            println e.toString()
        }
    }
}
