package ru.foxit.grayfox;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        int[][] ints2 = {{1, 1}, {2, 1}}; // Хардкод, инициализация двойного массива.
        int[] ints3 = {1, 1}; // Хардкод, инициализация одномерного массива.
        int[] ints = new int[12]; // Создаем массив размерностью 8.
        ints[0] = 1;
        ints[1] = 5;
        ints[2] = 3;
        ints[3] = 2;
        ints[4] = 11;
        ints[5] = 4;
        ints[6] = 5;
        ints[7] = 2;
        ints[8] = 4;
        ints[9] = 8;
        ints[10] = 9;
        ints[11] = 1;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 6) {
                ints[i] = i * 2; // (ints[i] *= 2)
            }

        }
        System.out.println("Result Array:\n" + Arrays.toString(ints));
    }
}
