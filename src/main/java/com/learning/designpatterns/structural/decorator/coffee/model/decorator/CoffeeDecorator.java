package com.learning.designpatterns.structural.decorator.coffee.model.decorator;

import com.learning.designpatterns.structural.decorator.coffee.model.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost(); // Forwarding the call to the wrapped object
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription(); // Forwarding the call to the wrapped object
    }
}
