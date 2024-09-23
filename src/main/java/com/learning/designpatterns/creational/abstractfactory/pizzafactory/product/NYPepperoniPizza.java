package com.learning.designpatterns.creational.abstractfactory.pizzafactory.product;

// New York style pepperoni pizza
public class NYPepperoniPizza extends Pizza {

  @Override
  public void prepare() {
    System.out.println("Preparing New York style pepperoni pizza...");
  }

  @Override
  public void bake() {
    System.out.println("Baking New York style pepperoni pizza...");
  }

  @Override
  public void box() {
    System.out.println("Boxing New York style pepperoni pizza...");
  }
}
