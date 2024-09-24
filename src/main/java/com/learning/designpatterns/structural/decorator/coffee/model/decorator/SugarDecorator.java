package com.learning.designpatterns.structural.decorator.coffee.model.decorator;

import com.learning.designpatterns.structural.decorator.coffee.model.Coffee;

// Adding Sugar to the coffee
public class SugarDecorator extends CoffeeDecorator {

  public SugarDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public double getCost() {
    return super.getCost() + 0.50; // Adding cost for sugar
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Sugar"; // Adding sugar to the description
  }
}
