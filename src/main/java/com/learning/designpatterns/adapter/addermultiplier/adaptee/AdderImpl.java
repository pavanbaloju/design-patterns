package com.learning.designpatterns.adapter.addermultiplier.adaptee;

public class AdderImpl implements Adder {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
