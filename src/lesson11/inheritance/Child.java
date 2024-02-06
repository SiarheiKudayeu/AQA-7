package lesson11.inheritance;

public class Child extends Parent {

    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public void doSmth() {
        System.out.println("I do I Child");
    }

    public void doSmthChild() {
        System.out.println("I do special Child");
    }
}
