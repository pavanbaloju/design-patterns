package com.learning.designpatterns.structural.decorator.coffee.model;

public class SimpleCoffee implements Coffee {

    public static final double SIMPLE_COFFEE_COST = 5.00;

    @Override
    public double getCost() {
        return SIMPLE_COFFEE_COST;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
