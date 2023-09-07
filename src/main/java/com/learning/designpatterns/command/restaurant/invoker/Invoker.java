package com.learning.designpatterns.command.restaurant.invoker;

import com.learning.designpatterns.command.restaurant.command.OrderCommand;

public abstract class Invoker {

    protected OrderCommand orderCommand;

    public void executeCommand() {
        orderCommand.execute();
    }
}
