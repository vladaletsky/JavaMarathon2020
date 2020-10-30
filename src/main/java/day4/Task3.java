package day4;

import com.sun.xml.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Arrays;
import java.util.Random;


public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[12][8];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 12; i++) {
            if (Arrays.stream(array[i]).sum() >= sum) {
                sum = Arrays.stream(array[i]).sum();
                max = i;
            }

        }
        System.out.println(max);


    }
}
