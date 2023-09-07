package com.learning.designpatterns.command.restaurant.invoker;

import com.learning.designpatterns.command.restaurant.command.OrderCommand;

public class Cook extends Invoker {

    public void setOrderCommand(OrderCommand orderCommand) {
        this.orderCommand = orderCommand;
    }

}
