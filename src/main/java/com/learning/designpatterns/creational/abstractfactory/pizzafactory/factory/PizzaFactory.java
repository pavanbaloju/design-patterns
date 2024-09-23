package com.learning.designpatterns.creational.abstractfactory.pizzafactory.factory;

import com.learning.designpatterns.creational.abstractfactory.pizzafactory.product.Pizza;

// Abstract pizza factory interface
public interface PizzaFactory {
    Pizza createCheesePizza();
    Pizza createPepperoniPizza();
}

