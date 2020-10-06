package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    static List<Message> messages = new ArrayList<>();

    //этот метод “отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text. Отправка в нашем контексте означает добавление сообщения в нашу “базу данных”.
    public static void sendMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messages.add(message);
    }

    //- возвращает список всех сообщений в “базе данных”.
    public static List<Message> getMessages() {
        return messages;
    }

    //- этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2. Формат вывода должен быть таким:
    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if (u1.equals(message.getSender()) && (u2.equals(message.getReceiver()))) {
                System.out.println(message.getSender() + ": " + message.getText());
            }
            if (u2.equals(message.getSender()) && u1.equals(message.getReceiver())) {
                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }


}
