package com.learning.designpatterns.adapter.adaptee;

public class AdderImpl implements Adder {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
