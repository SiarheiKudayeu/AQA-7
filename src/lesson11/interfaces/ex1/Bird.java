package lesson11.interfaces.ex1;

public class Bird implements Eat, Move{
    @Override
    public void eat() {
        System.out.println("I am Bird, I can eat like a Bird!!!");
    }

    @Override
    public void earnForEat() {
        System.out.println("I can sing Opera");
    }

    @Override
    public void move() {
        System.out.println("I believe I can fly");
    }
}
