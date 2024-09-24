package com.learning.designpatterns.structural.decorator.coffee.client;

import com.learning.designpatterns.structural.decorator.coffee.model.Coffee;
import com.learning.designpatterns.structural.decorator.coffee.model.SimpleCoffee;
import com.learning.designpatterns.structural.decorator.coffee.model.decorator.MilkDecorator;
import com.learning.designpatterns.structural.decorator.coffee.model.decorator.SugarDecorator;

public class CoffeeShop {
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Add milk to the coffee
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        // Add sugar to the coffee
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}
