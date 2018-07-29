package com.raccoonberus.loyaltysvc.generatorStrategy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStrategyTest {

    @Test
    public void getCode_1() {
        SimpleStrategy subject = new SimpleStrategy(12);
        int actual = subject.getCode().length();
        assertEquals(12, actual);
    }

    @Test
    public void getCode_2() {
        SimpleStrategy subject = new SimpleStrategy(400);
        int actual = subject.getCode().length();
        assertEquals(400, actual);
    }

    @Test
    public void getCode_3() {
        SimpleStrategy subject = new SimpleStrategy(40);
        assertNotEquals(subject.getCode(), subject.getCode());
    }

}