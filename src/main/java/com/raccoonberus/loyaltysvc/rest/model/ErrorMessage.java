package com.raccoonberus.loyaltysvc.rest.model;

public class ErrorMessage {

    private String text;
    private String html;

    public ErrorMessage() {
    }

    public ErrorMessage(String text) {
        this(text, text);
    }

    public ErrorMessage(String text, String html) {
        this.text = text;
        this.html = html;
    }

    public String getText() {
        return text;
    }

    public ErrorMessage setText(String text) {
        this.text = text;
        return this;
    }

    public String getHtml() {
        return html;
    }

    public ErrorMessage setHtml(String html) {
        this.html = html;
        return this;
    }
}
