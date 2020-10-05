package day13;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("John");
        User user2 = new User("Bob");
        User user3 = new User("Tom");

        user1.sendMessage(user2, "Привет, как дела?");
        user1.sendMessage(user2, "Всё нормально, ты поличил моё сообщение?");

        user2.sendMessage(user1, "Привет, всё нормально");
        user2.sendMessage(user1, "Сообщение получил, как ты?");

        user3.sendMessage(user1, " Привет, это user3, пишу тебе, user1 для теста");
        user3.sendMessage(user1, " Надеюсь, программа работает");
        user3.sendMessage(user1, " И мне не придётся её переделывать :) ");

        user1.sendMessage(user3, "Привет, user3, вижу твой месседж");
        user1.sendMessage(user3, "user3,я тоже надеюсь, что не наговнокодил");
        user1.sendMessage(user3, "Всё работает, отлично!");

        user3.sendMessage(user1, "ТЕСТ");

        MessageDatabase.showDialog(user1, user3);
    }
}
