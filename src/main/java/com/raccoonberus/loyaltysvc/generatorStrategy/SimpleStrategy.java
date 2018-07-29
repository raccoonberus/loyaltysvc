package com.raccoonberus.loyaltysvc.generatorStrategy;

import java.util.Random;

public class SimpleStrategy implements Strategy {

    private static final String abc = "ABCDEFGHJKMNOPQRSTUVWXYZ234789";

    private int length;

    private Random random;

    public SimpleStrategy() {
        this(10);
    }

    public SimpleStrategy(int length) {
        this.length = length;
        this.random = new Random();
    }

    @Override
    public String getCode() {
        StringBuilder res = new StringBuilder();
        int r;
        for (int i = 0; i < length; i++) {
            r = random.nextInt(abc.length() - 1);
            res.append(abc.charAt(r));
        }
        return res.toString();
    }

}
