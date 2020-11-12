package day16;

import day14.MoreLessTenException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        double sum = 0f;
        double result = 0f;

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[numbersString.length];
            int counter = 0;
            for (String number : numbersString) {
                numbers[counter++] = Integer.parseInt(number);
            }
            for (int number : numbers) {
                sum = sum + number;
            }
            result = sum / numbers.length;
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.printf(result + " --> " + "%.3f", result);
    }

}



