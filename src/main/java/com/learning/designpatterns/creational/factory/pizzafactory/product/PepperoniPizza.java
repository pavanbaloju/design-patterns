package com.learning.designpatterns.creational.factory.pizzafactory.product;

// Concrete Pizza - Pepperoni Pizza
public class PepperoniPizza extends Pizza {

  @Override
  public void prepare() {
    System.out.println("Preparing pepperoni pizza...");
  }

  @Override
  public void bake() {
    System.out.println("Baking pepperoni pizza...");
  }

  @Override
  public void box() {
    System.out.println("Boxing pepperoni pizza...");
  }
}
