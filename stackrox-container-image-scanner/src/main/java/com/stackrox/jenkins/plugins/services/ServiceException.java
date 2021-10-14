package com.stackrox.jenkins.plugins.services;

import java.io.IOException;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import com.stackrox.invoker.ApiException;
import com.stackrox.model.RuntimeError;

public class ServiceException extends IOException {

    public static final Gson GSON = new Gson();

    private final String detailMessage;

    public ServiceException(String message, ApiException e) {
        super(e);
        String msg;
        if (Strings.isNullOrEmpty(e.getResponseBody())) {
            msg = e.getMessage();
        } else {
            try {
                RuntimeError error = GSON.fromJson(e.getResponseBody(), RuntimeError.class);
                msg = error.getMessage();
            } catch (JsonSyntaxException ex) {
                msg = e.getMessage();
            }
        }
        detailMessage = String.format("%s. Status code: %d. Error: %s", message, e.getCode(), msg);
        setStackTrace(e.getStackTrace());
    }

    @Override
    public String getMessage() {
        return this.detailMessage;
    }
}
