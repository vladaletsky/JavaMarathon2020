package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(90);
        Player player2 = new Player(90);
        Player player3 = new Player(90);
        Player player4 = new Player(90);
        Player player5 = new Player(90);
        Player player6 = new Player(90);

        for (int i = 0; i <90 ; i++) {
            player1.run();
        }
        Player.info();

    }
}
