package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);

        int countMore8 = 0;
        int countEqually1 = 0;
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                countMore8++;
            }
            if (array[i] == 1) {
                countEqually1++;
            }
            if (array[i] % 2 == 0) {
                countEven++;
            }
            if (array[i] % 2 != 0) {
                countOdd++;
            }
        }
        System.out.println("Количетсво чисел больше 8: " + countMore8);
        System.out.println("Количество чисел равных 1: " + countEqually1);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + Arrays.stream(array).sum());
    }
}


