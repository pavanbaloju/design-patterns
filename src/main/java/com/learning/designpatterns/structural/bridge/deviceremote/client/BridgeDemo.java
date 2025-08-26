package com.learning.designpatterns.structural.bridge.deviceremote.client;

import com.learning.designpatterns.structural.bridge.deviceremote.device.Device;
import com.learning.designpatterns.structural.bridge.deviceremote.device.Radio;
import com.learning.designpatterns.structural.bridge.deviceremote.device.Tv;
import com.learning.designpatterns.structural.bridge.deviceremote.remote.AdvancedRemote;
import com.learning.designpatterns.structural.bridge.deviceremote.remote.BasicRemote;

public class BridgeDemo {

  public static void main(String[] args) {
    testDevice(new Tv());
    testDevice(new Radio());
  }

  public static void testDevice(Device device) {
    System.out.println("Tests with basic remote.");
    BasicRemote basicRemote = new BasicRemote(device);
    basicRemote.power();
    device.printStatus();

    System.out.println("Tests with advanced remote.");
    AdvancedRemote advancedRemote = new AdvancedRemote(device);
    advancedRemote.power();
    advancedRemote.mute();
    device.printStatus();
  }
}
