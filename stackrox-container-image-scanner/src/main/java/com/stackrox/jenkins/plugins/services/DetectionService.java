package com.stackrox.jenkins.plugins.services;

import static com.stackrox.jenkins.plugins.data.ListUtil.safe;
import static com.stackrox.model.StorageEnforcementAction.FAIL_BUILD_ENFORCEMENT;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.stackrox.api.DetectionServiceApi;
import com.stackrox.invoker.ApiClient;
import com.stackrox.invoker.ApiException;
import com.stackrox.jenkins.plugins.data.ViolatedPolicy;
import com.stackrox.model.StorageAlert;
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

        return safe(alerts).stream()
                .map(StorageAlert::getPolicy)
                .filter(p -> p != null && safe(p.getEnforcementActions()).contains(FAIL_BUILD_ENFORCEMENT))
                .map(policy -> new ViolatedPolicy(
                        policy.getName(),
                        policy.getDescription(),
                        policy.getSeverity().toString(),
                        policy.getRemediation()))
                .collect(Collectors.toList());
    }
}
