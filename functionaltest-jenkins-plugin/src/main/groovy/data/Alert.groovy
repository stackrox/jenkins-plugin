package data

import com.google.gson.JsonElement

class Alert {

    public String id
    public Policy policy
    LifecycleStages lifecyleStages
    Object deployment
    Violation[] violations
    public Object processViolation
    public String enforcement
    public String time
    public String firstOccurred
    public String state
    public String snoozeTill

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
    public JsonElement message
}

class Component {
    public String name
    public String version
}

class Whitelist {
    public String name
    public Deployment deployment
    public JsonElement image
    public String expiration
    class Deployment {
        public String name
        public Scope scope
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




