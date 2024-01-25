package lesson9.inheritance.ex1;

public class Telegram extends Messenger{
    public Telegram(String name, int size) {
        super(name, size);
    }

    public Telegram(){}




    public void audioCalls(){
        System.out.println("I can do audio calls!");
    }
    @Override
    public void sendMessage(){
        System.out.println("I am telegram. I can send message");
    }
}
