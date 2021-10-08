package common

import groovy.transform.CompileStatic

@CompileStatic
class Constants {
    public final static String BASEURL = "https://localhost:8000"
    public final static String CLUSTERUSERNAME = "admin"
    public final static String GETPOLICY = "policies/{id}"
    public final static String PUTPOLICY = "policies/{id}"
    public final static String GETPOLICIES = "policies"
    public final static String TOKENGENERATE = "apitokens/generate"
}
