package com.stackrox.jenkins.plugins.services;

import com.stackrox.invoker.ApiException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ServiceExceptionTest {

    @DisplayName("ServiceException message")
    @ParameterizedTest(name = "should be \"{1}\" when response body \"{0}\"")
    @CsvSource({",Status code: 500. Error: API Message", "{},Status code: 500.", "{\"message\":\"some error\"},Status code: 500. Error: some error"})
    void fromApiException(String body, String message) {
        Exception e = ServiceException.fromApiException("Own message", new ApiException("API Message", 500, null, body));
        assertEquals("Own message. " + message, e.getMessage());
    }
}
