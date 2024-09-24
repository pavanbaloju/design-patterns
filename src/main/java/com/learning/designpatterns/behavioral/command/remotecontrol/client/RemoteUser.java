package com.learning.designpatterns.behavioral.command.remotecontrol.client;

import com.learning.designpatterns.behavioral.command.remotecontrol.command.concretecommands.LightOffCommand;
import com.learning.designpatterns.behavioral.command.remotecontrol.command.concretecommands.LightOnCommand;
import com.learning.designpatterns.behavioral.command.remotecontrol.command.concretecommands.PlayMusicCommand;
import com.learning.designpatterns.behavioral.command.remotecontrol.command.concretecommands.StopMusicCommand;
import com.learning.designpatterns.behavioral.command.remotecontrol.command.macrocommands.PartyOffCommand;
import com.learning.designpatterns.behavioral.command.remotecontrol.command.macrocommands.PartyOnCommand;
import com.learning.designpatterns.behavioral.command.remotecontrol.invoker.Remote;
import com.learning.designpatterns.behavioral.command.remotecontrol.receiver.Light;
import com.learning.designpatterns.behavioral.command.remotecontrol.receiver.MusicPlayer;

public class RemoteUser {

    public static void main(String[] args) {
        Light light = new Light("Disco light");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        MusicPlayer musicPlayer = new MusicPlayer();
        PlayMusicCommand playMusicCommand = new PlayMusicCommand(musicPlayer);
        StopMusicCommand stopMusicCommand = new StopMusicCommand(musicPlayer);

        Remote remote = new Remote();
        remote.setCommand(1, lightOnCommand, lightOffCommand);
        remote.pressOnButton(1);
        remote.pressOffButton(1);

        remote.setCommand(2, playMusicCommand, stopMusicCommand);
        remote.pressOnButton(2);
        remote.pressOffButton(2);

        remote.pressUndoButton();

        PartyOnCommand partyOnCommand = new PartyOnCommand(lightOnCommand, playMusicCommand);
        remote.setCommand(3, partyOnCommand, new PartyOffCommand(stopMusicCommand, lightOffCommand));
        remote.pressOnButton(3);
        remote.pressOffButton(3);
    }
}
