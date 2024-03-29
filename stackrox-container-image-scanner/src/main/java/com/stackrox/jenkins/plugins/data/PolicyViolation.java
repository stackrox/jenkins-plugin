package com.stackrox.jenkins.plugins.data;

import javax.annotation.Nonnull;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.stackrox.model.StorageEnforcementAction;
import com.stackrox.model.StoragePolicy;

@Data
@AllArgsConstructor
public class PolicyViolation {
    private final String name;
    private final String severity;
    private final String description;
    private final String remediation;
    private final String violations;
    private final boolean buildEnforced;

    public PolicyViolation(@Nonnull StoragePolicy policy, String violations) {
        this(
                policy.getName(),
                SeverityUtil.prettySeverity(policy.getSeverity()),
                policy.getDescription(),
                policy.getRemediation(),
                violations,
                ListUtil.emptyIfNull(policy.getEnforcementActions())
                        .contains(StorageEnforcementAction.FAIL_BUILD_ENFORCEMENT)
        );
    }
}
