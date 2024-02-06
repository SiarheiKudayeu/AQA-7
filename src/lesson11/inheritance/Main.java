package lesson11.inheritance;

public class Main {
    public static void main(String[] args) {
        Parent childFromParent = new Child("Sam", 2);
        childFromParent.doSmth();
        Parent parent = new Parent("Dan", 32);
        childFromParent = parent;
        if (childFromParent instanceof Child) {
            ((Child) childFromParent).doSmthChild();
        } else {
            System.out.println("Not Child format!");
        }
    }
}
