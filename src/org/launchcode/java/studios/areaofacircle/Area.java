package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


public class Area {
    private static final Scanner console = new Scanner(System.in);

    public static void calculate() {
        boolean validInput = false;
        double radius = 0;

        while (!validInput) {
            System.out.print("Enter a radius: ");
            String input = console.nextLine();

            try {
                radius = Double.parseDouble(input);

                if (radius <= 0) {
                    System.out.println("Error: Please enter a positive decimal figure.");
                    continue;
                }

                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Not a valid numerical entry. Exiting");
                System.exit(0);
            }
        }

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }

    public static void main(String[] args) {
        Area.calculate();
    }
}
