package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentId;
        boolean entering = true;

        System.out.println("Enter the next Student ID (or press ENTER to finish):");

        do {
            System.out.print("Student ID: ");
            studentId = input.nextLine();

            if (studentId.equals("")) {
                entering = false;
            }

            try {
                int idNumber = Integer.parseInt(studentId);

                if (entering) {
                    System.out.print("Student name: ");
                    String name = input.nextLine();

                    students.put(idNumber, name);

                    System.out.println("(press ENTER to continue...)");
                    input.nextLine();
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Student Id numbers must be an integer. Try again.");
            }
        } while (entering);

        System.out.println("\nClass Roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("#" + student.getKey() + " :  " + student.getValue());
        }
    }
}
