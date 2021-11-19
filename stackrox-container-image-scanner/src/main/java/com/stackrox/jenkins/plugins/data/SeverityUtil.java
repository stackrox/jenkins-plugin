package com.stackrox.jenkins.plugins.data;

import org.apache.commons.lang.StringUtils;

public class SeverityUtil {
    public static String prettySeverity(Enum<?> severity) {
        if (severity == null) {
            return null;
        }
        return StringUtils.substringBefore(severity.toString(), "_");
    }
}
