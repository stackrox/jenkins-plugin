package Data

import com.google.gson.JsonElement
import Data.EnforcementAction
import Data.Severity
import com.sun.org.apache.xpath.internal.operations.Bool

class ListPolicyResponse {
    String id
    String name
    String description
    Severity severity
    Boolean disabled
    LifecycleStages lifecycleStages
    String [] notifiers
    JsonElement last_updated
    EnforcementAction enforcementAction
}