package Data

import com.google.gson.JsonElement



class Alert {

    public String id
    public Policy policy
    LifecycleStages lifecyleStages
    Object Deployment
    Violation[] violations
    public Object ProcessViolation
    EnforcementAction enforcementaction
    public String Time
    public String FirstOccurred
    public String State
    public String SnoozeTill

}

class Violation {
    public JsonElement message
}


class Component {
    public String Name
    public String Version
}

class Whitelist {
    public String Name
    public Deployment Deployment
    public JsonElement Image
    public String Expiration
    class Deployment {
        public String Name
        public Scope Scope
    }
}




