package com.learning.designpatterns.creational.prototype.shape.client;

import com.learning.designpatterns.creational.prototype.shape.model.Circle;
import com.learning.designpatterns.creational.prototype.shape.model.Shape;
import com.learning.designpatterns.creational.prototype.shape.model.Square;

public class ShapeClient {
    public static void main(String[] args) {
        // Create original shapes
        Shape redCircle = new Circle("Red");
        Shape blueSquare = new Square("Blue");

        // Clone shapes
        Shape clonedCircle = redCircle.clone();
        Shape clonedSquare = blueSquare.clone();

        // Draw original shapes
        redCircle.draw(); // Output: Drawing a Red Circle.
        blueSquare.draw(); // Output: Drawing a Blue Square.

        // Draw cloned shapes
        clonedCircle.draw(); // Output: Drawing a Red Circle.
        clonedSquare.draw(); // Output: Drawing a Blue Square.
    }
}
