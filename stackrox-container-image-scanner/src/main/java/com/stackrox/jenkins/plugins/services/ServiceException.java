package com.stackrox.jenkins.plugins.services;

import java.io.IOException;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import com.stackrox.invoker.ApiException;
import com.stackrox.model.GooglerpcStatus;

public class ServiceException extends IOException {

    private static final Gson GSON = new Gson();

    private ServiceException(String message, ApiException cause) {
        super(message, cause);
    }

    public static ServiceException fromApiException(String ownMessage, ApiException apiException) {
        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append(String.format("%s. Status code: %d.", ownMessage, apiException.getCode()));
        String responseBody = apiException.getResponseBody();
        if (!Strings.isNullOrEmpty(responseBody)) {
            try {
                GooglerpcStatus error = GSON.fromJson(responseBody, GooglerpcStatus.class);
                if (!Strings.isNullOrEmpty(error.getMessage())) {
                    messageBuilder.append(String.format(" Error: %s", error.getMessage()));
                }
            } catch (JsonSyntaxException jsonException) {
                messageBuilder.append(String.format(" Response body: %s", responseBody));
            }
        } else if (!Strings.isNullOrEmpty(apiException.getMessage())) {
            messageBuilder.append(String.format(" Error: %s", apiException.getMessage()));
        }
        return new ServiceException(messageBuilder.toString(), apiException);
    }
}
