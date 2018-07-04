package com.raccoonberus.loyaltysvc.domain;

public class Greeting {

    private long id;

    private String message;

    public Greeting() {
        this.id = 1000;
        this.message = "Hello from Spring Boot!";
    }

    public Greeting(String name) {
        this.id = 123;
        this.message = String.format("Hello, %s!", name);
    }

    public long getId() {
        return id;
    }

    public Greeting setId(long id) {
        this.id = id;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Greeting setMessage(String message) {
        this.message = message;
        return this;
    }
}
