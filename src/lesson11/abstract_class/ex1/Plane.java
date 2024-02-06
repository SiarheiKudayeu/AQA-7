package lesson11.abstract_class.ex1;

public abstract class Plane extends Vehicles {
    @Override
    void move() {
        System.out.println("I fly!!!");
    }

    abstract void takeFuel();
}
