package com.stackrox.jenkins.plugins.services;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.stackrox.jenkins.plugins.data.ViolatedPolicy;
import hudson.util.Secret;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonString;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class DetectionService {

    private static final String FAIL_BUILD_ENFORCEMENT = "FAIL_BUILD_ENFORCEMENT";

    private final String portalAddress;
    private final Secret apiToken;
    private final CloseableHttpClient httpClient;

    public DetectionService(String portalAddress, Secret apiToken, CloseableHttpClient httpClient) {
        this.portalAddress = portalAddress;
        this.apiToken = apiToken;
        this.httpClient = httpClient;
    }

    public List<ViolatedPolicy> getPolicyViolations(String imageName) throws IOException {
        List<ViolatedPolicy> violatedPolicies = Lists.newArrayList();

        JsonObject detectionResult = runBuildTimeDetection(imageName);
        JsonArray alerts = detectionResult.getJsonArray("alerts");

        for (JsonObject alert : alerts.getValuesAs(JsonObject.class)) {
            JsonObject policy = alert.getJsonObject("policy");

            boolean isEnforced = false;
            JsonArray actions = policy.getJsonArray("enforcementActions");
            for (JsonString action : actions.getValuesAs(JsonString.class)) {
                if (FAIL_BUILD_ENFORCEMENT.equals(action.getString())) {
                    isEnforced = true;
                    break;
                }
            }

            if (isEnforced) {
                List<String> violations = Lists.newArrayList();
                for (JsonObject violation : alert.getJsonArray("violations").getValuesAs(JsonObject.class)) {
                    violations.add(violation.getString("message"));
                }

                violatedPolicies.add(new ViolatedPolicy(
                        policy.getString("name"),
                        policy.getString("description"),
                        policy.getString("severity"),
                        policy.getString("remediation"), violations));
            }
        }
        return violatedPolicies;
    }

    private JsonObject runBuildTimeDetection(String imageName) throws IOException {
        CloseableHttpResponse response = null;
        HttpPost detectionRequest = null;

        try {
            detectionRequest = new HttpPost(Joiner.on("/").join(portalAddress, "v1/detect/build"));
            detectionRequest.setHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.toString());
            detectionRequest.setHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
            detectionRequest.addHeader(HttpHeaders.AUTHORIZATION, Joiner.on(" ").join("Bearer", apiToken));
            detectionRequest.setEntity(new StringEntity(
                    Json.createObjectBuilder().add("imageName", imageName).build().toString(),
                    StandardCharsets.UTF_8));

            response = this.httpClient.execute(detectionRequest);
            int statusCode = response.getStatusLine().getStatusCode();

            HttpEntity entity = response.getEntity();

            if (statusCode != HttpURLConnection.HTTP_OK || entity == null) {
                throw new IOException(String.format("Failed build time detection request. Status code: %d. Error: %s",
                        statusCode, entity == null ? "" : entity.toString()));
            }
            JsonReader reader = Json.createReader(new InputStreamReader(entity.getContent(), StandardCharsets.UTF_8));
            JsonObject object = reader.readObject();
            EntityUtils.consume(entity);

            return object;
        } finally {
            if (detectionRequest != null) {
                detectionRequest.releaseConnection();
            }
            if (response != null) {
                response.close();
            }
        }
    }

}
