package com.learning.designpatterns.creational.prototype.shape.model;

// Circle class implementing Shape interface
public class Circle implements Shape {
    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " Circle.");
    }
}

