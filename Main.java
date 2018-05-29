package ru.foxit.grayfox;

import java.util.Arrays;

// Практика
// В предыдущем прохождении джавы я не раздечал deepToString и toString = deepToString пишется когда 2 мерный массив,
// а toString пишется, когда одномерный массив!
// 2 задание, 1 уровня, 3 варианта решения.
public class Main {
    public static void main(String[] args) {
        //////////////
        int[] foxs = new int[8];
        for (int i = 0; i <= 21; i+=3) {
            foxs[i / 3] = i;
        }
        System.out.println(Arrays.toString(foxs));
        //////////////
        int[] foxs2 = new int[8];
        int j = 0;
        for (int i = 0; i < foxs2.length; i++) {
            foxs2[i] = j;
            j += 3;
        }
        System.out.println(Arrays.toString(foxs2));
        //////////////
        int[] testArray = new int[8];
        for (int i = 0; i < testArray.length; i++)
            testArray[i] = i * 3;
        System.out.println(Arrays.toString(testArray));
        //////////////
    }


}
