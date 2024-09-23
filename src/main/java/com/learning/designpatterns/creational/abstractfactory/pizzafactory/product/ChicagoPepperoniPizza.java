package com.learning.designpatterns.creational.abstractfactory.pizzafactory.product;

// Chicago style pepperoni pizza
public class ChicagoPepperoniPizza extends Pizza {

  @Override
  public void prepare() {
    System.out.println("Preparing Chicago style pepperoni pizza...");
  }

  @Override
  public void bake() {
    System.out.println("Baking Chicago style pepperoni pizza...");
  }

  @Override
  public void box() {
    System.out.println("Boxing Chicago style pepperoni pizza...");
  }
}
