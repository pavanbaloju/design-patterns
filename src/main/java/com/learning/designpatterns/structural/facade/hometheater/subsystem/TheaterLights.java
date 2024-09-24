package com.learning.designpatterns.structural.facade.hometheater.subsystem;

// Subsystem class for Lights
public class TheaterLights {

  public void dim(int level) {
    System.out.println("Lights dimmed to: " + level + "%");
  }
}
