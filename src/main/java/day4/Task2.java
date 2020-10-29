package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        int max = 0;
        int min = 10000;
        int zero = 0;
        int zeroSum = 0;
        for (Integer i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
            if (i % 10 == 0) {
                zero++;
                zeroSum = zeroSum + i;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + zero);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + zeroSum);
    }
}
