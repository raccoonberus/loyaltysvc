package com.raccoonberus.loyaltysvc.web.model;

public class ActivationData {

    private String username;
    private String code;

    public String getUsername() {
        return username;
    }

    public ActivationData setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ActivationData setCode(String code) {
        this.code = code;
        return this;
    }
}
