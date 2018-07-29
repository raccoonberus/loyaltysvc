package com.raccoonberus.loyaltysvc.rest.model;

public class Response {
    private boolean ok;
    private Object result;

    public Response() {
    }

    public Response(boolean ok, Object result) {
        this.ok = ok;
        this.result = result;
    }

    public boolean isOk() {
        return ok;
    }

    public Response setOk(boolean ok) {
        this.ok = ok;
        return this;
    }

    public Object getResult() {
        return result;
    }

    public Response setResult(Object result) {
        this.result = result;
        return this;
    }
}
