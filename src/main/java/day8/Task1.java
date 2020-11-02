package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20001; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            System.out.print(i + " ");

        }
        long finish1 = System.currentTimeMillis();
        System.out.println();
        System.out.println(finish1 - start1);
    }
}