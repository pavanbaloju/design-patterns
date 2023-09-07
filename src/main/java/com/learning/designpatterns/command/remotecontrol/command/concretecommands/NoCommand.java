package com.learning.designpatterns.command.remotecontrol.command.concretecommands;

import com.learning.designpatterns.command.remotecontrol.command.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
    }

    @Override
    public void undo() {

    }
}
