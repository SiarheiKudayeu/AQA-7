package lesson11.abstract_class.ex1;

public abstract class Vehicles {
    public String name;
    public int cost;

    public void getInfo(){
        System.out.println(name);
        System.out.println(cost);
    }
    abstract void move();

    abstract void takeFuel();
}
