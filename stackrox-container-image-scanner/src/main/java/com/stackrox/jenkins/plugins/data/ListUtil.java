package com.stackrox.jenkins.plugins.data;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

public class ListUtil {

    @Nonnull
    public static <T> List<T> safe(List<T> list) {
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }
}
