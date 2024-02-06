package lesson11.abstract_class.ex1;

public class Car extends Vehicles{
    public Car(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    void move() {
        System.out.println("I can be driven!!!");
    }

    @Override
    void takeFuel() {
        System.out.println("Car fuel.");
    }
}
