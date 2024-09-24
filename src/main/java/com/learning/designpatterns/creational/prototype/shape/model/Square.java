package com.learning.designpatterns.creational.prototype.shape.model;

// Square class implementing Shape interface
public class Square implements Shape {

  private final String color;

  public Square(String color) {
    this.color = color;
  }

  @Override
  public Shape clone() {
    return new Square(this.color);
  }

  @Override
  public void draw() {
    System.out.println("Drawing a " + color + " Square.");
  }
}
