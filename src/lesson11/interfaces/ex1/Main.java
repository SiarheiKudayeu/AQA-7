package lesson11.interfaces.ex1;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Fish fish = new Fish();
        bird.eat();
        fish.eat();
        bird.whatDateISToday();
        fish.whatDateISToday();
        bird.move();
        //fish.move();
    }
}
