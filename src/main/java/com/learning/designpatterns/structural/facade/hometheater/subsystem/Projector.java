package com.learning.designpatterns.structural.facade.hometheater.subsystem;

// Subsystem class for Projector
public class Projector {

  public void on() {
    System.out.println("Projector is on");
  }

  public void setInput(String input) {
    System.out.println("Projector input set to: " + input);
  }

  public void wideScreenMode() {
    System.out.println("Projector set to widescreen mode");
  }

  public void off() {
    System.out.println("Projector is off");
  }
}
