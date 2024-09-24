package com.learning.designpatterns.structural.decorator.coffee.model;

public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 5.00; // Basic coffee cost
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
