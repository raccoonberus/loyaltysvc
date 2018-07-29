package com.raccoonberus.loyaltysvc.rest.model;

public class GenerateOpenTask {

    private String strategy;
    private String type;
    private int quantity;

    public String getStrategy() {
        return strategy;
    }

    public GenerateOpenTask setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    public String getType() {
        return type;
    }

    public GenerateOpenTask setType(String type) {
        this.type = type;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public GenerateOpenTask setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }
}
