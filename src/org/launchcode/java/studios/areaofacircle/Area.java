package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    private static final Scanner console = new Scanner(System.in);
    private static final double pi = 3.14;

    public static void calculate() {
        boolean validInput = false;
        double radius = 0;

        while (!validInput) {
            System.out.print("Enter a raduis: ");
            String input = console.nextLine();

            try {
                radius = Double.parseDouble(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a decimal number and try again.");
            }
        }

        double area = pi * radius * radius;
        System.out.println("The area of a circle radius " + radius + " is: " + area);
    }

    public static void main(String[] args) {
        Area.calculate();
    }
}
