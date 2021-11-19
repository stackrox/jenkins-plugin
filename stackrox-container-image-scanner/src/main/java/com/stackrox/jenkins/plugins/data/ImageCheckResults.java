package com.stackrox.jenkins.plugins.data;

import com.google.gson.Gson;

import java.util.List;

import lombok.Data;

@Data
public class ImageCheckResults {

    private static final Gson GSON = new Gson();

    private final String imageName;
    private final List<CVE> cves;
    private final List<PolicyViolation> violatedPolicies;

    public boolean isStatusPass() {
        return violatedPolicies.stream().noneMatch(PolicyViolation::isBuildEnforced);
    }

    @SuppressWarnings("unused") // used by index.jelly
    public String getCvesJson() {
        return cves.isEmpty() ? "" : GSON.toJson(cves);
    }

    @SuppressWarnings("unused") // used by index.jelly
    public String getViolatedPoliciesJson() {
        return violatedPolicies.isEmpty() ? "" : GSON.toJson(violatedPolicies);
    }
}
