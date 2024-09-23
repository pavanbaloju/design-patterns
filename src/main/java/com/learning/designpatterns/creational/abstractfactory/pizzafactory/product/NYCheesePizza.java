package com.learning.designpatterns.creational.abstractfactory.pizzafactory.product;

// New York style cheese pizza
public class NYCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing New York style cheese pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Baking New York style cheese pizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing New York style cheese pizza...");
    }
}

