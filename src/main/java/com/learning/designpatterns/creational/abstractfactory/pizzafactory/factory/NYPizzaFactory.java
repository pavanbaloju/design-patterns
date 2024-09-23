package com.learning.designpatterns.creational.abstractfactory.pizzafactory.factory;

import com.learning.designpatterns.creational.abstractfactory.pizzafactory.product.NYCheesePizza;
import com.learning.designpatterns.creational.abstractfactory.pizzafactory.product.NYPepperoniPizza;
import com.learning.designpatterns.creational.abstractfactory.pizzafactory.product.Pizza;

// New York Pizza Factory
public class NYPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createCheesePizza() {
        return new NYCheesePizza();
    }

    @Override
    public Pizza createPepperoniPizza() {
        return new NYPepperoniPizza();
    }
}

