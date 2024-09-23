package com.learning.designpatterns.creational.abstractfactory.pizzafactory.client;

import com.learning.designpatterns.creational.abstractfactory.pizzafactory.factory.ChicagoPizzaFactory;
import com.learning.designpatterns.creational.abstractfactory.pizzafactory.factory.NYPizzaFactory;
import com.learning.designpatterns.creational.abstractfactory.pizzafactory.product.Pizza;
import com.learning.designpatterns.creational.abstractfactory.pizzafactory.factory.PizzaFactory;

public class PizzaStore {
    private final PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public void orderPizza(String type) {
        Pizza pizza = null;

        if (type.equalsIgnoreCase("cheese")) {
            pizza = factory.createCheesePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = factory.createPepperoniPizza();
        }

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.box();
        } else {
            System.out.println("Sorry, we don't have that type of pizza.");
        }
    }

    public static void main(String[] args) {
        // Ordering pizzas from New York Pizza Factory
        PizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyFactory);

        System.out.println("New York Pizza Store:");
        nyStore.orderPizza("cheese");
        System.out.println();
        nyStore.orderPizza("pepperoni");

        System.out.println();

        // Ordering pizzas from Chicago Pizza Factory
        PizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(chicagoFactory);

        System.out.println("Chicago Pizza Store:");
        chicagoStore.orderPizza("cheese");
        System.out.println();
        chicagoStore.orderPizza("pepperoni");
    }
}
