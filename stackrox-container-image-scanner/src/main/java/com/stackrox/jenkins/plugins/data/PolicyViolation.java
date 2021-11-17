package com.stackrox.jenkins.plugins.data;

import javax.annotation.Nonnull;

import com.google.common.base.Objects;

import com.stackrox.model.StorageEnforcementAction;
import com.stackrox.model.StoragePolicy;
import com.stackrox.model.StorageSeverity;

public class PolicyViolation {
    private final StoragePolicy policy;
    private final String violations;

    public PolicyViolation(@Nonnull StoragePolicy policy, String violations) {
        this.policy = policy;
        this.violations = violations;
    }

    public String getName() {
        return policy.getName();
    }

    public StorageSeverity getSeverity() {
        return policy.getSeverity();
    }

    public String getDescription() {
        return policy.getDescription();
    }

    public String getRemediation() {
        return policy.getRemediation();
    }

    public String getViolations() {
        return violations;
    }

    public boolean isBuildEnforced() {
        return ListUtil.emptyIfNull(policy.getEnforcementActions())
                .contains(StorageEnforcementAction.FAIL_BUILD_ENFORCEMENT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyViolation that = (PolicyViolation) o;
        return Objects.equal(policy, that.policy) && Objects.equal(violations, that.violations);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(policy, violations);
    }

    @Override
    public String toString() {
        return "PolicyViolation{" +
                "policy=" + policy +
                ", violations='" + violations + '\'' +
                '}';
    }
}
