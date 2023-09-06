package com.learning.designpatterns.command.restaurant.invoker;

import com.learning.designpatterns.command.restaurant.command.OrderCommand;

public class Waiter {

    private OrderCommand orderCommand;

    public void setOrderCommand(OrderCommand orderCommand) {
        this.orderCommand = orderCommand;
    }

    public void executeOrderCommand(){
        orderCommand.execute();
    }
}
