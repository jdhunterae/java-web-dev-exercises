package org.launchcode.java.studios.charcounting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CharCounter {
    private static final ArrayList<String> alphabet = new ArrayList<>(List.of("abcdefghijklmnopqrstuvwxyz".split("")));
    private static final String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
    private static final Scanner console = new Scanner(System.in);
    private static final String filename = "sample.txt";


    public static void main(String[] args) {
//        countChars(quote);
        countCharsFromFile(filename);
    }


    public static void printResults(HashMap<Character, Integer> data, int columns) {
        int i = 0;
        for (Character letter : data.keySet()) {
            if (i % columns == 0) {
                System.out.println();
            } else {
                System.out.print("     ");
            }

            System.out.printf("'%s': x%3d", letter, data.get(letter));
            i += 1;
        }
    }

    public static void countChars() {
        boolean valid = false;
        String input;

        do {
            System.out.print("Enter a string to count the characters of: ");
            input = console.nextLine();

            if (input.equals("")) {
                System.out.println("Please enter some text...");
                continue;
            }

            valid = true;
        } while (!valid);

        countChars(input);
    }

    public static void countChars(String text) {
        HashMap<Character, Integer> data = new HashMap<>();

        text = text.toLowerCase();
        char[] chars = text.toCharArray();

        for (char letter : chars) {
            if (alphabet.contains(String.valueOf(letter))) {
                data.put(letter, (data.get(letter) == null) ? 1 : data.get(letter) + 1);
            }
        }

        printResults(data, 1);
    }

    public static void countCharsFromFile(String name) {
        try {
            Path filePath = Path.of(name);
            String content = Files.readString(filePath);

            countChars(content);
        } catch (IOException e) {
            System.out.printf("No file found at '%s'\n", name);
            System.out.printf("Using default input string: '%s'\n", name);

            countChars();
        }
    }
}
