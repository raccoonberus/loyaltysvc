package com.raccoonberus.loyaltysvc.web.model;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ExceptionResponse implements Serializable {

    private List<ErrorMessage> messages = new ArrayList<>();

    public List<ErrorMessage> getMessages() {
        return messages;
    }

    public ExceptionResponse setMessages(List<ErrorMessage> messages) {
        this.messages = messages;
        return this;
    }
}
