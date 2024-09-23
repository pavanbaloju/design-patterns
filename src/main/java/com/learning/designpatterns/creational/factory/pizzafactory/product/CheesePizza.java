package com.learning.designpatterns.creational.factory.pizzafactory.product;

// Concrete Pizza - Cheese Pizza
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing cheese pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Baking cheese pizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing cheese pizza...");
    }
}

