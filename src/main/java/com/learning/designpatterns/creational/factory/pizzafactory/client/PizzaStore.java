package com.learning.designpatterns.creational.factory.pizzafactory.client;

import com.learning.designpatterns.creational.factory.pizzafactory.factory.PizzaFactory;
import com.learning.designpatterns.creational.factory.pizzafactory.product.Pizza;

public class PizzaStore {
    private final PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public void orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);  // Delegating pizza creation to the factory

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.box();
        } else {
            System.out.println("Sorry, we don't have that type of pizza.");
        }
    }

    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        store.orderPizza("cheese");
        System.out.println();

        store.orderPizza("pepperoni");
        System.out.println();

        store.orderPizza("veggie");
        System.out.println();

        store.orderPizza("meatlover");  // This should print an error message.
    }
}
