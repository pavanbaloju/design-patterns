package com.learning.designpatterns.behavioral.command.restaurant.invoker;

import com.learning.designpatterns.behavioral.command.restaurant.command.OrderCommand;

public class Cook extends Invoker {

    public void setOrderCommand(OrderCommand orderCommand) {
        this.orderCommand = orderCommand;
    }

}