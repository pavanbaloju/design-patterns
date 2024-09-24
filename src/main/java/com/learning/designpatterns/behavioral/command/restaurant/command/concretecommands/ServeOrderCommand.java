package com.learning.designpatterns.behavioral.command.restaurant.command.concretecommands;

import com.learning.designpatterns.behavioral.command.restaurant.command.OrderCommand;
import com.learning.designpatterns.behavioral.command.restaurant.receiver.Order;

public class ServeOrderCommand implements OrderCommand {

    private final Order order;

    public ServeOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.serve();
    }
}
