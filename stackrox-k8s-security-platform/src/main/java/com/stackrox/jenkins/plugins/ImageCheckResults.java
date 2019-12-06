package com.stackrox.jenkins.plugins;

import net.sf.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class ImageCheckResults {


    private String imageName;
    private List<JSONObject> scanResults;
    private List<JSONObject> policyResults;

    public ImageCheckResults() {
        imageName = "";
        scanResults = Collections.emptyList();
        policyResults = Collections.emptyList();
    }

    public List<JSONObject> getScanResults() {
        return scanResults;
    }

    public void setScanResults(ArrayList<JSONObject> scanResults) {
        this.scanResults = scanResults;
    }


    public List<JSONObject> getPolicyResults() {
        return policyResults;
    }

    public void setPolicyResults(ArrayList<JSONObject> policyResults) {
        this.policyResults = policyResults;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ImageCheckResults withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

}
