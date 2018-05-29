package ru.foxit.grayfox;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int[] testArray = new int[8];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = i * 3;
            System.out.println("Result Array:\n" + Arrays.toString(testArray));
        }
    }
}
