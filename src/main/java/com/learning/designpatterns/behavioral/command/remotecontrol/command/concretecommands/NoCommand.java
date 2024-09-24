package com.learning.designpatterns.behavioral.command.remotecontrol.command.concretecommands;

import com.learning.designpatterns.behavioral.command.remotecontrol.command.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
    }

    @Override
    public void undo() {

    }
}
