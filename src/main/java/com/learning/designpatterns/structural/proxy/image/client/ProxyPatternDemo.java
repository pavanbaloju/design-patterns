package com.learning.designpatterns.structural.proxy.image.client;

import com.learning.designpatterns.structural.proxy.image.subject.Image;
import com.learning.designpatterns.structural.proxy.image.subject.ImageProxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ImageProxy("test_image.jpg");

        // Image is loaded from disk and displayed only when needed
        System.out.println("First time: ");
        image.display();  // Loads and displays the image

        System.out.println("\nSecond time: ");
        image.display();  // Displays the image without loading it again
    }
}
