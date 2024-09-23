package com.learning.designpatterns.creational.abstractfactory.pizzafactory.product;

// Chicago style cheese pizza
public class ChicagoCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicago style cheese pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Baking Chicago style cheese pizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing Chicago style cheese pizza...");
    }
}

