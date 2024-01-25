package lesson9.equals_hashcode;

import java.util.Objects;

public class Car {
    public String name;
    public int price;

    public boolean isNew;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public Car(String name, int price, boolean isNew) {
        this.name = name;
        this.price = price;
        this.isNew = isNew;
    }

    public static void main(String[] args) {
        Car renault = new Car("Logan", 10000, true);
        Car renault2 = new Car("Logan", 10000, false);
        System.out.println(renault2.equals(renault));

        System.out.println(renault2.hashCode());
        System.out.println(renault2);
        System.out.println(renault.hashCode());
        System.out.println(renault);
    }
}
