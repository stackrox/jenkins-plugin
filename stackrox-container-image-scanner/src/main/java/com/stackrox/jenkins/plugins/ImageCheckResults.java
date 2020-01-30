package com.stackrox.jenkins.plugins;

import com.google.gson.Gson;
import java.util.List;

@SuppressWarnings("unused")
public class ImageCheckResults {

    private final String imageName;
    private final List<CVE> cves;
    private final List<ViolatedPolicy> violatedPolicies;
    private boolean imageCheckStatusPass;

    public ImageCheckResults(String imageName, List<CVE> cves, List<ViolatedPolicy> violatedPolicies) {
        this.imageName = imageName;
        this.cves = cves;
        this.violatedPolicies = violatedPolicies;
        this.imageCheckStatusPass = violatedPolicies.isEmpty();
    }

    public List<CVE> getCves() {
        return cves;
    }

    public String getImageName() {
        return imageName;
    }

    public List<ViolatedPolicy> getViolatedPolicies() {
        return violatedPolicies;
    }

    public boolean isImageCheckStatusPass() {
        return imageCheckStatusPass;
    }

    public String getCvesJson() {
        return cves.isEmpty() ? "" : new Gson().toJson(cves);
    }

    public String getViolatedPoliciesJson() {
        return violatedPolicies.isEmpty() ? "" : new Gson().toJson(violatedPolicies);
    }

}
