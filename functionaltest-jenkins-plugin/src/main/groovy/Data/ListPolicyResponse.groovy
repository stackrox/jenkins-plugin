package Data

import com.google.gson.JsonElement
import Data.EnforcementAction
import Data.Severity

class ListPolicyResponse {
        String id
        String name
        String description
        Severity severity
        Boolean disabled
        LifecycleStages lifecycle_stages
        String[] notifiers
        JsonElement last_updated
        EnforcementAction actions
}