package ru.foxit.grayfox;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int[][] testArray = new int[11][11];
        System.out.println("Result array:\n");
        for (int i = 0; i < testArray.length; i++) {
            testArray[i][i] = 1;
            testArray[i][testArray.length - i - 1] = 1;
            System.out.println(Arrays.toString(testArray[i]));
        }
    }
}
