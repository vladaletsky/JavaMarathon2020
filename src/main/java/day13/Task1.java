package day13;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        user1.sendMessage(user2, "Hello from user1");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hi, user1!");
        user2.sendMessage(user1, "I'm user2, Nice to meet you! =)");
        user2.sendMessage(user1, "I'm fine, and you?");

        user3.sendMessage(user1, "Hey, my name is user3.");
        user3.sendMessage(user1, "Do you remember me?");

        MessageDatabase.showDialog(user1,user3);
    }
}
