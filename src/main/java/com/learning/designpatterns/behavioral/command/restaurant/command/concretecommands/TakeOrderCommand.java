package com.learning.designpatterns.behavioral.command.restaurant.command.concretecommands;

import com.learning.designpatterns.behavioral.command.restaurant.command.OrderCommand;
import com.learning.designpatterns.behavioral.command.restaurant.receiver.Order;

public class TakeOrderCommand implements OrderCommand {

    private final Order order;

    public TakeOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.placeOrder();
    }
}
