package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Volkswagen");
        list.add("Peugeot");
        list.add("Infinity");
        list.add("Mercedes");
        list.add(3, "Renault");
        list.remove(0);
        System.out.println(list);
    }
}
