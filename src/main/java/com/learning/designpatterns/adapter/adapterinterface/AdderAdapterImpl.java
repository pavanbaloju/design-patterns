package com.learning.designpatterns.adapter.adapterinterface;

import com.learning.designpatterns.adapter.adaptee.Adder;

public class AdderAdapterImpl implements AdderAdapter {

    private final Adder adder;

    public AdderAdapterImpl(Adder adder) {
        this.adder = adder;
    }

    @Override
    public int multiply(int a, int b) {
        int multiplyRes = 0;
        for (int i = 0; i < a; i++) {
            multiplyRes = adder.add(multiplyRes, b);
        }
        return multiplyRes;
    }
}
