package com.learning.designpatterns.creational.factory.pizzafactory.product;

// Concrete Pizza - Veggie Pizza
public class VeggiePizza extends Pizza {

  @Override
  public void prepare() {
    System.out.println("Preparing veggie pizza...");
  }

  @Override
  public void bake() {
    System.out.println("Baking veggie pizza...");
  }

  @Override
  public void box() {
    System.out.println("Boxing veggie pizza...");
  }
}
