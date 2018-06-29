package com.raccoonberus.loyaltysvc.domain;

public class ActivationAction {

    public enum Status { OK, FAIL_ACTIVATED_ALREADY, FAIL_INVALID_CODE }

    private long id;
    private Acoount account;
    private Code code;
    private Date activatedAt;
    private Status status;
}
