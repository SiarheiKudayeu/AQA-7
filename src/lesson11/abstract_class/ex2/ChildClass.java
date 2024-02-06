package lesson11.abstract_class.ex2;

public class ChildClass extends AbstractClass implements Interface2, Interface1{
    @Override
    void abstractMethod() {

    }

    @Override
    public void interface1() {

    }

    @Override
    public void interface2() {

    }

    @Override
    public void doSmth() {
        System.out.println("Logic");
    }
}
