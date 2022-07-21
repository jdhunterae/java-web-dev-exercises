package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8));
    private static String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

    public static void main(String[] args) {
        System.out.println(sumEvenArr(numbers));
        printXLetterWords(text);
    }

    public static int sumEvenArr(ArrayList<Integer> arr) {
        int sum = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void printXLetterWords(String text) {
        int letters = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println("How many letters should printed words contain?");
            String input = scanner.nextLine();
            try {
                letters = Integer.parseInt(input);
                if (letters <= 0) {
                    System.out.println("Error: Must be a positive number, try again.");
                    continue;
                }
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Not a number, try again.");
            }
        }

        String[] arr = text.split(" ");
        ArrayList<String> words = new ArrayList<>(Arrays.asList(arr));

        for (String word : words) {
            if (word.length() == letters) {
                System.out.println(word);
            }
        }
    }
}
