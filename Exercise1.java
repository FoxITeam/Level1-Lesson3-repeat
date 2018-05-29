package ru.foxit.grayfox;

import java.util.Arrays;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        int[] binaryArray = new int[8]; // Создаем массив, называем его бинарныйМассив и на 8 ячеек (размерностью 8)
        Random random = new Random(); // Создаем переменную класса Random
        // В цикле по длине массива проходимся по каждому элементу и в каждый элемент устанавливаем рандомное значение
        for (int i = 0; i < binaryArray.length; i++)  // Мы идем по массиву, если массив не заполнен, генерируем рандом число.
            binaryArray[i] = random.nextInt(2);
        System.out.println("Инициализируем массив:\n" + Arrays.toString(binaryArray));


        for (int i = 0; i < binaryArray.length; i++) // Мы идем по массиву, заменяем 0 на единицу.
            binaryArray[i] = (binaryArray[i] == 0) ? 1 : 0;
        // Вернуть true (До двоеточие) - если это условие выполняется - один.
        // Вернуть false (После двоеточние) - в противном случае - ноль.
        //
        // Чтобы понять что внутри цикла, то вот как оно будет выглядеть иначе:
        /**
         * if (binaryArray[i] == 0) {
         *             binaryArray[i] = 1;
         *         } else {
         *             binaryArray[i] = 0;
         *         }
         */


        System.out.println("Инициализируем массив:\n" + Arrays.toString(binaryArray));
    }
}
