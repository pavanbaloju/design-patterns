package com.learning.designpatterns.creational.singleton.database;

public class DatabaseClient {
    public static void main(String[] args) {
      Database instance = Database.getDBInstance();
      instance.printMessage();
      System.out.println(Database.getDBInstance().equals(Database.getDBInstance()));
    }
}
