package com.learning.designpatterns.behavioral.command.restaurant.command.concretecommands;

import com.learning.designpatterns.behavioral.command.restaurant.command.OrderCommand;
import com.learning.designpatterns.behavioral.command.restaurant.receiver.Order;

public class PrepareOrderCommand implements OrderCommand {

    private final Order order;

    public PrepareOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.prepare();
    }
}
