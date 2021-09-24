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
    List<String> lifecycleStages
    String[] scope
    String severity
    List<String> enforcementActions
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

    Policy getUpdatedPolicy(String policyName, String tag, List<String> enforcements) {
        Policy updatedPolicy = new Policy()
        PolicyFields policyFields = new PolicyFields()
        PolicyFields.ImageNamePolicy imageNamePolicy = new PolicyFields.ImageNamePolicy(null)
        policyFields.setImage_name(imageNamePolicy)
        imageNamePolicy.setTag(tag)
        updatedPolicy.with {
            name = policyName  //fields below are required.
            lifecycleStages = ["BUILD"]
            severity = "MEDIUM_SEVERITY"
            fields = policyFields
            categories = ["Image Assurance"]
            enforcementActions = enforcements
        }
        return updatedPolicy
    }
}
