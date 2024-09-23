package com.learning.designpatterns.creational.abstractfactory.pizzafactory.factory;

import com.learning.designpatterns.creational.abstractfactory.pizzafactory.product.ChicagoCheesePizza;
import com.learning.designpatterns.creational.abstractfactory.pizzafactory.product.ChicagoPepperoniPizza;
import com.learning.designpatterns.creational.abstractfactory.pizzafactory.product.Pizza;

// Chicago Pizza Factory
public class ChicagoPizzaFactory implements PizzaFactory {

  @Override
  public Pizza createCheesePizza() {
    return new ChicagoCheesePizza();
  }

  @Override
  public Pizza createPepperoniPizza() {
    return new ChicagoPepperoniPizza();
  }
}
