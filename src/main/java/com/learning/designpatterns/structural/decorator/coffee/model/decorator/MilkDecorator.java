package com.learning.designpatterns.structural.decorator.coffee.model.decorator;

import com.learning.designpatterns.structural.decorator.coffee.model.Coffee;

// Adding Milk to the coffee
public class MilkDecorator extends CoffeeDecorator {

    public static final double MILK_COST = 1.50;

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + MILK_COST; // Adding cost for milk
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk"; // Adding milk to the description
    }
}

