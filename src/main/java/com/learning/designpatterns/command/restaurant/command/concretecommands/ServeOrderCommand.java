package com.learning.designpatterns.command.restaurant.command.concretecommands;

import com.learning.designpatterns.command.restaurant.command.OrderCommand;
import com.learning.designpatterns.command.restaurant.receiver.Order;

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
