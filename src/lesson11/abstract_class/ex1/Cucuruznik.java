package lesson11.abstract_class.ex1;

public class Cucuruznik extends Plane {

    public Cucuruznik(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    void takeFuel() {
        System.out.println("Take Cucuruznik fuel");
    }
}
