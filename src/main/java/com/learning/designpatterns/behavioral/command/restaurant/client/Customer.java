package com.learning.designpatterns.behavioral.command.restaurant.client;

import com.learning.designpatterns.behavioral.command.restaurant.command.concretecommands.PrepareOrderCommand;
import com.learning.designpatterns.behavioral.command.restaurant.command.concretecommands.ServeOrderCommand;
import com.learning.designpatterns.behavioral.command.restaurant.command.concretecommands.TakeOrderCommand;
import com.learning.designpatterns.behavioral.command.restaurant.command.OrderCommand;
import com.learning.designpatterns.behavioral.command.restaurant.invoker.Cook;
import com.learning.designpatterns.behavioral.command.restaurant.invoker.Waiter;
import com.learning.designpatterns.behavioral.command.restaurant.receiver.Order;

public class Customer {

    public static void main(String[] args) {
        Order order = new Order("Biryani");
        Waiter waiter = new Waiter();
        Cook cook = new Cook();

        OrderCommand takeOrderCommand = new TakeOrderCommand(order);
        waiter.setOrderCommand(takeOrderCommand);
        waiter.executeCommand();

        OrderCommand prepareOrderCommand = new PrepareOrderCommand(order);
        cook.setOrderCommand(prepareOrderCommand);
        cook.executeCommand();

        OrderCommand serveOrderCommand = new ServeOrderCommand(order);
        waiter.setOrderCommand(serveOrderCommand);
        waiter.executeCommand();
    }
}
