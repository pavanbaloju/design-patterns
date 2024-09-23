package com.learning.designpatterns.creational.singleton.database;

public class Database {

  private static Database instance;

  private Database() {
    // private constructor to restrict instantiation
  }

  public static Database getDBInstance() {
    if (instance == null) {
      instance = new Database();
    }
    return instance;
  }

  public void printMessage() {
    System.out.println("Database instance: " + instance);
  }
}
