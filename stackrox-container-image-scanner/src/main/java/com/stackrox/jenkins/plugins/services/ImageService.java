package com.stackrox.jenkins.plugins.services;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;

import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import hudson.util.Secret;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;

import com.stackrox.jenkins.plugins.data.CVE;

public class ImageService {

    private static final String NOT_AVAILABLE = "-";
    private final String portalAddress;
    private final Secret apiToken;
    private final CloseableHttpClient httpClient;

    public ImageService(String portalAddress, Secret apiToken, CloseableHttpClient httpClient) {
        this.portalAddress = portalAddress;
        this.apiToken = apiToken;
        this.httpClient = httpClient;
    }


    public List<CVE> getImageScanResults(String imageName) throws IOException {
        List<CVE> cves = Lists.newArrayList();

        JsonObject scanResult = runImageScan(imageName);

        JsonArray components = scanResult.getJsonArray("components");
        for (JsonObject component : components.getValuesAs(JsonObject.class)) {
            JsonArray componentCves = component.getJsonArray("vulns");
            for (JsonObject cve : componentCves.getValuesAs(JsonObject.class)) {
                String publishDate = cve.getString("publishedOn", NOT_AVAILABLE);
                CVE cveToAdd = CVE.Builder.newInstance()
                        .withId(cve.getString("cve"))
                        .withCvssScore(cve.isNull("cvss") ? (float) 0 : (float) cve.getJsonNumber("cvss").doubleValue())
                        .withScoreType(cve.getString("scoreVersion", NOT_AVAILABLE))
                        .withPublishDate(Strings.isNullOrEmpty(publishDate) ? NOT_AVAILABLE : publishDate)
                        .withLink(cve.getString("link", NOT_AVAILABLE))
                        .inPackage(component.getString("name", NOT_AVAILABLE))
                        .inVersion(component.getString("version", NOT_AVAILABLE))
                        .isFixable(!Strings.isNullOrEmpty(cve.getString("fixedBy")))
                        .build();
                cves.add(cveToAdd);
            }
        }

        return cves;
    }

    private JsonObject runImageScan(String imageName) throws IOException {
        HttpPost imageScanRequest = new HttpPost(Joiner.on("/").join(portalAddress, "v1/images/scan"));
        imageScanRequest.setHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.toString());
        imageScanRequest.setHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
        imageScanRequest.addHeader(HttpHeaders.AUTHORIZATION, Joiner.on(" ").join("Bearer", apiToken));
        imageScanRequest.setEntity(new StringEntity(
                Json.createObjectBuilder().add("imageName", imageName).add("force", true).build().toString(),
                StandardCharsets.UTF_8));

        try (CloseableHttpResponse response = this.httpClient.execute(imageScanRequest)) {
            int statusCode = response.getStatusLine().getStatusCode();

            HttpEntity entity = response.getEntity();

            if (statusCode != HttpURLConnection.HTTP_OK || entity == null) {
                throw new IOException(String.format("Failed image scan request. Status code: %d. Error: %s", statusCode, entity));
            }

            JsonObject object = HttpClientUtils.getJsonObject(entity);
            return object.getJsonObject("scan");
        }
    }
}
