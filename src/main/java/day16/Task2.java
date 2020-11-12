package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        PrintWriter printWriter = new PrintWriter(file1);
        for (int i = 0; i < 1000; i++) {
            printWriter.println((int) (Math.random() * (100 + 1)));
        }
        printWriter.close();

        Scanner scanner = new Scanner(file1);
        PrintWriter printWriter1 = new PrintWriter(file2);
        int count = 0;
        int sum = 0;
        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            count++;
            if (count == 20) {
                printWriter1.println(sum / 20.0);
                count = 0;
                sum = 0;
            }
        }
        printWriter1.close();
        scanner.close();

        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        double sumNumber = 0;
        File file1 = new File("file2.txt");
        Scanner scanner = new Scanner(file1);
        while (scanner.hasNextLine()) {
            sumNumber += Double.parseDouble(scanner.nextLine());
        }
        scanner.close();
        System.out.println((int) sumNumber);
    }
}
