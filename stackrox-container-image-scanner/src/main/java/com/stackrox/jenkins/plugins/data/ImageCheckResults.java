package com.stackrox.jenkins.plugins.data;

import com.stackrox.model.StoragePolicy;

import java.util.List;

public class ImageCheckResults {

    private final String imageName;
    private final List<CVE> cves;
    private final List<StoragePolicy> violatedPolicies;

    public ImageCheckResults(String imageName, List<CVE> cves, List<StoragePolicy> violatedPolicies) {
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

    public List<StoragePolicy> getViolatedPolicies() {
        return violatedPolicies;
    }

    public boolean isImageCheckStatusPass() {
        return violatedPolicies.isEmpty();
    }
}
