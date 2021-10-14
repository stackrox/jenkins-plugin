package com.stackrox.jenkins.plugins.services;

import static com.stackrox.model.StorageEnforcementAction.FAIL_BUILD_ENFORCEMENT;

import java.io.IOException;
import java.util.List;

import com.google.common.collect.Lists;

import com.stackrox.api.DetectionServiceApi;
import com.stackrox.invoker.ApiClient;
import com.stackrox.invoker.ApiException;
import com.stackrox.jenkins.plugins.data.ViolatedPolicy;
import com.stackrox.model.StorageAlert;
import com.stackrox.model.StorageEnforcementAction;
import com.stackrox.model.StoragePolicy;
import com.stackrox.model.V1BuildDetectionRequest;

public class DetectionService {


    private final DetectionServiceApi api;

    public DetectionService(ApiClient client) {
        api = new DetectionServiceApi(client);
    }

    public List<ViolatedPolicy> getPolicyViolations(String imageName) throws IOException {

        List<StorageAlert> alerts;
        try {
            alerts = api.detectionServiceDetectBuildTime(new V1BuildDetectionRequest().imageName(imageName)).getAlerts();
        } catch (ApiException e) {
            throw new ServiceException("Failed build time detection request", e);
        }


        List<ViolatedPolicy> violatedPolicies = Lists.newArrayList();
        for (StorageAlert alert : alerts) {
            StoragePolicy policy = alert.getPolicy();

            List<StorageEnforcementAction> actions = policy.getEnforcementActions();
            boolean isEnforced = actions.contains(FAIL_BUILD_ENFORCEMENT);

            if (isEnforced) {
                violatedPolicies.add(new ViolatedPolicy(
                        policy.getName(),
                        policy.getDescription(),
                        policy.getSeverity().toString(),
                        policy.getRemediation()));
            }
        }
        return violatedPolicies;
    }
}
