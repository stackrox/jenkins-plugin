package com.stackrox.jenkins.plugins.services;

import static com.stackrox.jenkins.plugins.data.ListUtil.safe;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;

import com.stackrox.api.ImageServiceApi;
import com.stackrox.invoker.ApiClient;
import com.stackrox.invoker.ApiException;
import com.stackrox.jenkins.plugins.data.CVE;
import com.stackrox.model.StorageEmbeddedImageScanComponent;
import com.stackrox.model.StorageEmbeddedVulnerability;
import com.stackrox.model.StorageImageScan;
import com.stackrox.model.V1ScanImageRequest;

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
            throw new ServiceException("Failed image scan request", e);
        }

        if (scan == null) {
            return Collections.emptyList();
        }

        List<CVE> cves = Lists.newArrayList();
        for (StorageEmbeddedImageScanComponent component : safe(scan.getComponents())) {
            for (StorageEmbeddedVulnerability cve : safe(component.getVulns())) {
                CVE cveToAdd = new CVE(component.getName(), component.getVersion(), cve);
                cves.add(cveToAdd);
            }
        }
        return cves;
    }
}
