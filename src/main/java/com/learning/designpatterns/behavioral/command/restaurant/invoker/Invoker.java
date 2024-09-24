package com.learning.designpatterns.behavioral.command.restaurant.invoker;

import com.learning.designpatterns.behavioral.command.restaurant.command.OrderCommand;

public abstract class Invoker {

    protected OrderCommand orderCommand;

    public void executeCommand() {
        orderCommand.execute();
    }
}
