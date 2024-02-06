package lesson11.inheritance;

public class Parent {
   private String name;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void doSmth(){
        System.out.println("I do I Parent");
    }

    private int age;
}
