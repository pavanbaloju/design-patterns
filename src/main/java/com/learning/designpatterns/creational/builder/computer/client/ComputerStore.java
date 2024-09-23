package com.learning.designpatterns.creational.builder.computer.client;

import com.learning.designpatterns.creational.builder.computer.builder.Computer;

public class ComputerStore {
    public static void main(String[] args) {
        // Building a high-end gaming computer
        Computer gamingComputer = new Computer.ComputerBuilder("Intel i9", "32GB")
                .storage("1TB SSD")
                .graphicsCard("NVIDIA RTX 3080")
                .operatingSystem("Windows 10")
                .build();

        // Building a basic office computer
        Computer officeComputer = new Computer.ComputerBuilder("Intel i5", "16GB")
                .storage("512GB HDD")
                .operatingSystem("Windows 10")
                .build();

        // Building a custom developer machine
        Computer developerComputer = new Computer.ComputerBuilder("AMD Ryzen 7", "64GB")
                .storage("2TB SSD")
                .graphicsCard("NVIDIA GTX 1660")
                .operatingSystem("Ubuntu")
                .build();

        System.out.println(gamingComputer);
        System.out.println(officeComputer);
        System.out.println(developerComputer);
    }
}
