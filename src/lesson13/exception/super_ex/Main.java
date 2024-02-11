package lesson13.exception.super_ex;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.printXFromChildAndParent();
        ChildChild childChild = new ChildChild();
        childChild.printSuperX();
    }
}
