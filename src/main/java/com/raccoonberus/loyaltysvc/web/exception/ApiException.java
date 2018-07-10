package com.raccoonberus.loyaltysvc.web.exception;

public class ApiException extends Exception {

    private static final long serialVersionUID = 2L;

    public ApiException(String message) {
        super(message);
    }
}
