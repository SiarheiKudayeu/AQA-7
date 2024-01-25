package lesson9.inheritance.ex1;

public class Main {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        Telegram telegram = new Telegram();
        Teams teams = new Teams();

        messenger.sendMessage();
        telegram.sendMessage();

    }
}
