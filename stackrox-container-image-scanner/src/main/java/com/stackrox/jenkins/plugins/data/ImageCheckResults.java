package com.stackrox.jenkins.plugins.data;

import java.util.List;

import lombok.Data;

@Data
public class ImageCheckResults {

    private final String imageName;
    private final List<CVE> cves;
    private final List<PolicyViolation> violatedPolicies;

    public boolean isStatusPass() {
        return violatedPolicies.stream().noneMatch(PolicyViolation::isBuildEnforced);
    }
}
