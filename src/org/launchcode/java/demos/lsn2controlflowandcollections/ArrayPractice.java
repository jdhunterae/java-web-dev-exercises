package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        // 3.7.1
        int[] intArray = new int[]{1, 1, 2, 3, 5, 8};

        for (int i : intArray) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = text.split(" ");

        System.out.println(Arrays.toString(words));

        String[] sentences = text.split("\\.");

        System.out.println(Arrays.toString(sentences));
    }
}
