package lesson13.exception.super_ex;

public class Child extends Parent{
    public int x = 8;

    public void printXFromChildAndParent(){
        System.out.println("Child x = " + this.x);
        System.out.println("Parent x = " + super.x);
    }
}
