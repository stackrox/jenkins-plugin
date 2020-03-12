package data

import com.google.gson.JsonElement

class Alert {

    String id
    Policy policy
    LifecycleStages lifecyleStages
    Object deployment
    Violation[] violations
    Object processViolation
    String enforcement
    String time
    String firstOccurred
    String state
    String snoozeTill

    enum LifecycleStages {
        DEPLOY,
        BUILD,
        RUNTIME
    }

    enum EnforcementAction {
        UNSET_ENFORCEMENT,
        SCALE_TO_ZERO_ENFORCEMENT,
        UNSATISFIABLE_NODE_CONSTRAINT_ENFORCEMENT,
        KILL_POD_ENFORCEMENT,
        FAIL_BUILD_ENFORCEMENT
    }

}

class Violation {
    JsonElement message
}

class Component {
    String name
    String version
}

class Whitelist {
    String name
    Deployment deployment
    JsonElement image
    String expiration
    class Deployment {
        String name
        Scope scope
    }

    class Scope {
        String cluster
        String namespace
        class Label {
            String key
            String value
        }
        Label label
    }
}