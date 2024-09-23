package com.learning.designpatterns.creational.factory.pizzafactory.factory;

import com.learning.designpatterns.creational.factory.pizzafactory.product.CheesePizza;
import com.learning.designpatterns.creational.factory.pizzafactory.product.PepperoniPizza;
import com.learning.designpatterns.creational.factory.pizzafactory.product.Pizza;
import com.learning.designpatterns.creational.factory.pizzafactory.product.VeggiePizza;

// Factory class for creating pizza objects
public class PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        // Based on the type of pizza requested, create the appropriate object
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
