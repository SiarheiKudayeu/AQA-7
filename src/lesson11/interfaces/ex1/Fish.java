package lesson11.interfaces.ex1;

public class Fish implements Eat{
    @Override
    public void eat() {
        System.out.println("I semi eat semi drink");
    }

    @Override
    public void earnForEat() {
        System.out.println("I don't to earn!!!!");
    }
}
