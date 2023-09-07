package com.learning.designpatterns.command.remotecontrol.command.macrocommands;

import com.learning.designpatterns.command.remotecontrol.command.Command;

public class PartyOnCommand implements Command {

    private Command[] commands;

    public PartyOnCommand(Command... commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
