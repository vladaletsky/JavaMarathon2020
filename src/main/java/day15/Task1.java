package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileRead = new File("src/main/resources/shoes.csv");
        File fileWrite = new File("src/main/resources/missing_shoes.txt");
        PrintWriter pw = new PrintWriter(fileWrite);
        Scanner scanner = new Scanner(fileRead);

        List<String> missingShoes = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] goods = line.split(";");
            if (Integer.parseInt(goods[2]) == 0) {
                missingShoes.add(line.replace(";", ", "));
            }
        }
        for (String line : missingShoes) {
            pw.println(line);
        }
        pw.close();
    }
}
