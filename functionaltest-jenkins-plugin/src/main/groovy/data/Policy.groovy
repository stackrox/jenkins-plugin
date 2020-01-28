package data

class Policy {
    String id
    String name
    String description
    String rationale
    String remediation
    Boolean disabled
    String[] categories
    PolicyFields fields
    ArrayList <String> lifecycle_stages
    String [] scope
    String severity
    ArrayList<String> enforcement_actions
    String[] notifiers

    class PolicyFields {
        ImageNamePolicy image_name
        class ImageNamePolicy {
            String registry
            String remote
            String tag
        }
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


