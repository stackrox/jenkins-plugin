package com.stackrox.jenkins.plugins.services;

import com.stackrox.invoker.ApiException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceExceptionTest {

    @DisplayName("ServiceException message")
    @ParameterizedTest(name = "should be \"{2}\" when response body \"{0}\"")
    @CsvSource({
            ",,'Status code: 500. Error: Message: null\n" +
                    "HTTP response code: 500\n" +
                    "HTTP response body: null\n" +
                    "HTTP response headers: null'",
            ",API Message,'Status code: 500. Error: Message: API Message\n" +
                    "HTTP response code: 500\n" +
                    "HTTP response body: null\n" +
                    "HTTP response headers: null'",
            "{},,Status code: 500.",
            "{\"message\":\"some error\"},,Status code: 500. Error: some error",
            "not a json,,Status code: 500. Response body: not a json"
    })
    void fromApiException(String responseBody, String apiExceptionMessage, String expectedMessage) {
        Exception e = ServiceException.fromApiException("Own message", new ApiException(apiExceptionMessage, 500, null, responseBody));
        assertEquals("Own message. " + expectedMessage, e.getMessage());
    }
}
