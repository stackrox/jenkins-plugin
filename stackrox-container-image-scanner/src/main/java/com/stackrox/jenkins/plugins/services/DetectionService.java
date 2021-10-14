package com.stackrox.jenkins.plugins.services;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonString;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import com.stackrox.invoker.ApiException;
import com.stackrox.model.StorageAlert;
import com.stackrox.model.StorageEnforcementAction;
import com.stackrox.model.StoragePolicy;
import com.stackrox.model.V1BuildDetectionRequest;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import com.stackrox.api.DetectionServiceApi;
import com.stackrox.invoker.ApiClient;
import com.stackrox.jenkins.plugins.data.ViolatedPolicy;

public class DetectionService {

    private static final String FAIL_BUILD_ENFORCEMENT = "FAIL_BUILD_ENFORCEMENT";

    private final DetectionServiceApi api;

    public DetectionService(ApiClient client) {
        api = new DetectionServiceApi(client);
    }

    public List<ViolatedPolicy> getPolicyViolations(String imageName) throws IOException {

        List<StorageAlert> alerts = null;
        try {
            alerts = api.detectionServiceDetectBuildTime(new V1BuildDetectionRequest().imageName(imageName)).getAlerts();
        } catch (ApiException e) {
            throw new ServiceException("Failed build time detection request", e);
        }


        List<ViolatedPolicy> violatedPolicies = Lists.newArrayList();
        for (StorageAlert alert : alerts) {
            StoragePolicy policy = alert.getPolicy();

            List<StorageEnforcementAction> actions = policy.getEnforcementActions();
            boolean isEnforced = actions.contains(StorageEnforcementAction.FAIL_BUILD_ENFORCEMENT);

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
