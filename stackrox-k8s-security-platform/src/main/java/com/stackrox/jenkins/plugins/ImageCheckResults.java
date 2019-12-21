package com.stackrox.jenkins.plugins;

import java.util.List;

@SuppressWarnings("unused")
public class ImageCheckResults {

    private final String imageName;
    private final List<CVE> cves;
    private final List<ViolatedPolicy> violatedPolicies;

    public ImageCheckResults(String imageName, List<CVE> cves, List<ViolatedPolicy> violatedPolicies) {
        this.imageName = imageName;
        this.cves = cves;
        this.violatedPolicies = violatedPolicies;
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

}
