package com.learning.designpatterns.behavioral.command.remotecontrol.command.concretecommands;

import com.learning.designpatterns.behavioral.command.remotecontrol.command.Command;
import com.learning.designpatterns.behavioral.command.remotecontrol.receiver.Light;

public class LightOffCommand implements Command {

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.off();
    }
}
