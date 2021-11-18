package com.stackrox.jenkins.plugins.services;

import static com.stackrox.jenkins.plugins.data.ListUtil.emptyIfNull;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;

import com.google.common.base.Strings;

import com.stackrox.api.DetectionServiceApi;
import com.stackrox.invoker.ApiClient;
import com.stackrox.invoker.ApiException;
import com.stackrox.jenkins.plugins.data.ListUtil;
import com.stackrox.jenkins.plugins.data.PolicyViolation;
import com.stackrox.model.AlertViolation;
import com.stackrox.model.StorageAlert;
import com.stackrox.model.V1BuildDetectionRequest;

public class DetectionService {


    private final DetectionServiceApi api;

    public DetectionService(ApiClient client) {
        api = new DetectionServiceApi(client);
    }

    public List<PolicyViolation> getPolicyViolations(String imageName) throws IOException {

        List<StorageAlert> alerts = getAlertsForImage(imageName);

        return emptyIfNull(alerts).stream()
                .filter(a -> a.getPolicy() != null)
                .map(a -> new PolicyViolation(a.getPolicy(), getViolations(a)))
                .collect(Collectors.toList());
    }

    @Nonnull
    private String getViolations(StorageAlert a) {
        return ListUtil.emptyIfNull(a.getViolations())
                .stream()
                .map(AlertViolation::getMessage)
                .filter(m -> !Strings.isNullOrEmpty(m))
                .collect(Collectors.joining(" - "));
    }

    private List<StorageAlert> getAlertsForImage(String imageName) throws ServiceException {
        try {
            return api.detectionServiceDetectBuildTime(new V1BuildDetectionRequest()
                            .imageName(imageName))
                    .getAlerts();
        } catch (ApiException e) {
            throw ServiceException.fromApiException("Failed build time detection request", e);
        }
    }
}
