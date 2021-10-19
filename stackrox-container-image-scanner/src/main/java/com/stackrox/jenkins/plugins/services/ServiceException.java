package com.stackrox.jenkins.plugins.services;

import java.io.IOException;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import com.stackrox.invoker.ApiException;
import com.stackrox.model.RuntimeError;

public class ServiceException extends IOException {

    public static final Gson GSON = new Gson();

    protected ServiceException(String message, ApiException cause) {
        super(message, cause);
    }

    public static ServiceException fromApiException(String ownMessage, ApiException apiException) {
        String innerMessage = apiException.getMessage();
        String body = apiException.getResponseBody();
        if (!Strings.isNullOrEmpty(body)) {
            try {
                RuntimeError error = GSON.fromJson(body, RuntimeError.class);
                innerMessage = error.getMessage();
            } catch (JsonSyntaxException ignored) {
                String detailMessage = String.format("%s. Status code: %d. Body: %s", ownMessage, apiException.getCode(), body);
                return new ServiceException(detailMessage, apiException);
            }
        }
        String detailMessage;
        if (Strings.isNullOrEmpty(innerMessage)) {
            detailMessage = String.format("%s. Status code: %d.", ownMessage, apiException.getCode());
        } else {
            detailMessage = String.format("%s. Status code: %d. Error: %s", ownMessage, apiException.getCode(), innerMessage);
        }
        return new ServiceException(detailMessage, apiException);
    }
}
