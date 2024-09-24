package com.learning.designpatterns.structural.flyweight.forest.client;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        Forest forest = new Forest();

        // Plant trees in the forest
        forest.plantTree(10, 20, "Oak", "Green", "Rough");
        forest.plantTree(50, 80, "Pine", "Dark Green", "Smooth");
        forest.plantTree(30, 40, "Oak", "Green", "Rough");  // Reuse the "Oak" TreeType
        forest.plantTree(70, 90, "Pine", "Dark Green", "Smooth");  // Reuse the "Pine" TreeType

        // Draw all the trees
        forest.draw();
    }
}
