package com.stackrox.jenkins.plugins.services;

import static com.stackrox.jenkins.plugins.data.ListUtil.emptyIfNull;
import static com.stackrox.model.StorageEnforcementAction.FAIL_BUILD_ENFORCEMENT;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.stackrox.api.DetectionServiceApi;
import com.stackrox.invoker.ApiClient;
import com.stackrox.invoker.ApiException;
import com.stackrox.model.StorageAlert;
import com.stackrox.model.StoragePolicy;
import com.stackrox.model.V1BuildDetectionRequest;

public class DetectionService {


    private final DetectionServiceApi api;

    public DetectionService(ApiClient client) {
        api = new DetectionServiceApi(client);
    }

    public List<StoragePolicy> getPolicyViolations(String imageName) throws IOException {

        List<StorageAlert> alerts;
        try {
            alerts = api.detectionServiceDetectBuildTime(new V1BuildDetectionRequest().imageName(imageName)).getAlerts();
        } catch (ApiException e) {
            throw ServiceException.fromApiException("Failed build time detection request", e);
        }

        return emptyIfNull(alerts).stream()
                .map(StorageAlert::getPolicy)
                .filter(p -> p != null && emptyIfNull(p.getEnforcementActions()).contains(FAIL_BUILD_ENFORCEMENT))
                .collect(Collectors.toList());
    }
}
