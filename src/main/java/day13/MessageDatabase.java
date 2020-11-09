package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    private MessageDatabase() {
    }

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return getMessages();
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : messages){
            if (message.getSender() == u1 && message.getReceiver() == u1
                    || message.getSender() == u2 && message.getReceiver() == u1){
                System.out.println(message.getSender() + ": " + message.getText());
            }
        }

        System.out.println(u1 + ": " + messages.get(0));
        System.out.println(u2 + ": " + messages.get(1) + u1);
        System.out.println(u1 + ": " + messages.get(2));
        System.out.println(u2 + ": " + messages.get(3));
    }

}
