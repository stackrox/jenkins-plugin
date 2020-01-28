package data

import com.google.gson.JsonElement

class ListPolicyResponse {
    String id
    String name
    String description
    Severity severity
    Boolean disabled
    //LifecycleStages lifecycleStages
    String [] notifiers
    JsonElement last_updated
    EnforcementAction enforcementAction

    enum EnforcementAction {
        UNSET_ENFORCEMENT,
        SCALE_TO_ZERO_ENFORCEMENT,
        UNSATISFIABLE_NODE_CONSTRAINT_ENFORCEMENT,
        KILL_POD_ENFORCEMENT,
        FAIL_BUILD_ENFORCEMENT
    }

    enum Severity {
        UNSET_SEVERITY,
        LOW_SEVERITY,
        MEDIUM_SEVERITY,
        HIGH_SEVERITY,
        CRITICAL_SEVERITY
    }

    enum LifecycleStages {
        DEPLOY,
        BUILD,
        RUNTIME
    }
}