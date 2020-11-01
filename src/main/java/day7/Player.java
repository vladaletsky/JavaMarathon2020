package day7;

import java.util.Random;

public class Player {
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;
    private int stamina;

    public Player(int st) {
        countPlayers++;
        stamina = st;
        if (countPlayers > 6) {
            countPlayers--;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void info() {
        int freePlace = 6 - countPlayers;
        if (countPlayers < 6) {
            System.out.println("Комманды неполные. На поле еще есть " + freePlace + " свободных мест");
        } else System.out.println("На поле нет свободных мест");
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        stamina--;
        if (stamina == MIN_STAMINA) {
            countPlayers--;
        }
        if (stamina < 0) {
            stamina++;             // Соглсен, костыли =) Но по-другому пока не придумал как обезопасить от отридцательного числа.
        }
    }

}
