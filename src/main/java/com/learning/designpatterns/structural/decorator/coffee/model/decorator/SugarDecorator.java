package com.learning.designpatterns.structural.decorator.coffee.model.decorator;

import com.learning.designpatterns.structural.decorator.coffee.model.Coffee;

// Adding Sugar to the coffee
public class SugarDecorator extends CoffeeDecorator {

  public static final double SUGAR_COST = 0.50;

  public SugarDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public double getCost() {
    return super.getCost() + SUGAR_COST; // Adding cost for sugar
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Sugar"; // Adding sugar to the description
  }
}
