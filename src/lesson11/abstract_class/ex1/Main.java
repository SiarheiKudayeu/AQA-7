package lesson11.abstract_class.ex1;

public class Main {
    public static void main(String[] args) {
        //Vehicles vehicles = new Vehicles();
        Car car = new Car(2000, "Car");
        car.getInfo();

        Vehicles vehicles = new Car(3000, "Audi");
        Vehicles vehicles1 = new Cucuruznik(25000, "A70");

        Vehicles[] vehiclesArray = {vehicles, vehicles1};
        for(Vehicles transport: vehiclesArray){
            transport.move();
            transport.takeFuel();
        }
    }
}
