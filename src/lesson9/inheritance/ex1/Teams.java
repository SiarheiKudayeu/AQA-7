package lesson9.inheritance.ex1;

public class Teams extends Telegram{
    public Teams(String name, int size) {
        super(name, size);
    }

    public void doVideoCalls(){
        System.out.println("I can do video calls");
    }
    public Teams(){}
}
