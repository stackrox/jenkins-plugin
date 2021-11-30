package com.stackrox.jenkins.plugins;

import com.google.common.net.UrlEscapers;

import com.stackrox.jenkins.plugins.data.ImageCheckResults;

import hudson.model.Action;
import hudson.model.Run;
import jenkins.model.Jenkins;
import lombok.Data;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
public class ViewStackroxResultsAction implements Action {
    static private final MessageDigest crypt;

    static {
        try {
            crypt = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private final List<ImageCheckResults> results;
    private final Run<?, ?> build;

    @Override
    public String getIconFileName() {
        return Jenkins.RESOURCE_PATH + "/plugin/stackrox-container-image-scanner/images/sr-logo.png";
    }

    @Override
    public String getDisplayName() {
        return "StackRox Report for " + getNames().collect(Collectors.joining(", "));
    }

    @Override
    public String getUrlName() {
        String images = getNames().collect(Collectors.joining("-"));
        return UrlEscapers.urlFragmentEscaper().escape("stackrox-image-security-results-" + getHash(images));
    }

    private Stream<String> getNames() {
        return getResults()
                .stream()
                .map(ImageCheckResults::getImageName);
    }

    private static String getHash(String str) {
        crypt.reset();
        crypt.update(str.getBytes(StandardCharsets.UTF_8));
        return byteToHex(crypt.digest());
    }

    private static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash) {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }
}
