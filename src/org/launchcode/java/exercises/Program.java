package org.launchcode.java.exercises;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Computer> devices = new ArrayList<>();
        devices.add(new Computer(128, 16, true));
        devices.add(new Computer(512, 32, false));
        devices.add(new Laptop(128, 16, 4.5));
        devices.add(new Laptop(512, 32, 6.25));
        devices.add(new SmartPhone(32, 8, 108));
        devices.add(new SmartPhone(64, 12, 0));

        for (Computer computer : devices) {
            System.out.println(computer);
        }
    }
}
