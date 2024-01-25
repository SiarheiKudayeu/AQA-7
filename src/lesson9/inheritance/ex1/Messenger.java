package lesson9.inheritance.ex1;

public class Messenger {
    public String name;
    public int size;

    public Messenger(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public Messenger(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void sendMessage(){
        System.out.println("I can send message!");
    }
}
