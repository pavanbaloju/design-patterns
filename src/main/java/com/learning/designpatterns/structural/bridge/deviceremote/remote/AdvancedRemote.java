package com.learning.designpatterns.structural.bridge.deviceremote.remote;

import com.learning.designpatterns.structural.bridge.deviceremote.device.Device;

public class AdvancedRemote extends BasicRemote {

  public AdvancedRemote(Device device) {
    super(device);
  }

  public void mute() {
    System.out.println("Remote: mute");
    device.setVolume(0);
  }
}
