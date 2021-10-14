package com.stackrox.jenkins.plugins.services;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import com.google.gson.Gson;

import com.google.gson.JsonSyntaxException;

import com.stackrox.api.ImageServiceApi;
import com.stackrox.invoker.ApiClient;
import com.stackrox.invoker.ApiException;
import com.stackrox.jenkins.plugins.data.CVE;
import com.stackrox.model.RuntimeError;
import com.stackrox.model.StorageEmbeddedImageScanComponent;
import com.stackrox.model.StorageEmbeddedVulnerability;
import com.stackrox.model.StorageImageScan;
import com.stackrox.model.V1ScanImageRequest;

import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import java.io.IOException;
import java.util.List;

import static org.threeten.bp.format.DateTimeFormatter.ISO_DATE_TIME;

public class ImageService {

    private final ImageServiceApi api;

    public ImageService(ApiClient client) {
        api = new ImageServiceApi(client);
    }


    public List<CVE> getImageScanResults(String imageName) throws IOException {
        V1ScanImageRequest request = new V1ScanImageRequest().imageName(imageName).force(true);
        StorageImageScan scan;
        try {
            scan = api.imageServiceScanImage(request).getScan();
        } catch (ApiException e) {
            throw handle(e);
        }

        List<CVE> cves = Lists.newArrayList();
        for (StorageEmbeddedImageScanComponent component : scan.getComponents()) {
            for (StorageEmbeddedVulnerability cve : component.getVulns()) {
                OffsetDateTime publishDate = cve.getPublishedOn();
                CVE cveToAdd = CVE.Builder.newInstance()
                        .withId(cve.getCve())
                        .withCvssScore(cve.getCvss() == null ? 0F : cve.getCvss())
                        .withScoreType(cve.getScoreVersion() == null ? null : cve.getScoreVersion().toString())
                        .withPublishDate(publishDate == null ? null : publishDate.format(ISO_DATE_TIME))
                        .withLink(cve.getLink())
                        .inPackage(component.getName())
                        .inVersion(component.getVersion())
                        .isFixable(!Strings.isNullOrEmpty(cve.getFixedBy()))
                        .build();
                cves.add(cveToAdd);
            }
        }
        return cves;
    }

    private IOException handle(ApiException e) {
        Gson gson = new Gson();
        String message;
        if (Strings.isNullOrEmpty(e.getResponseBody())) {
            message = e.getMessage();
        } else {
            try {
                RuntimeError error = gson.fromJson(e.getResponseBody(), RuntimeError.class);
                message = error.getMessage();
            } catch (JsonSyntaxException ex) {
                message = e.getMessage();
            }
        }
        return new IOException(String.format("Failed image scan request. Status code: %d. Error: %s", e.getCode(), message));
    }
}
