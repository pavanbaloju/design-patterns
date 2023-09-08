package com.learning.designpatterns.adapter.clientinterface;

public class MultiplierImpl implements Multiplier {
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}
