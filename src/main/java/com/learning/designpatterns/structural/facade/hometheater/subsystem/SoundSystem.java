package com.learning.designpatterns.structural.facade.hometheater.subsystem;

// Subsystem class for Surround Sound System
public class SoundSystem {

  public void on() {
    System.out.println("Sound system is on");
  }

  public void setVolume(int level) {
    System.out.println("Sound system volume set to: " + level);
  }

  public void off() {
    System.out.println("Sound system is off");
  }
}
