package lesson7.oop;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] ints = new int[5];
        Animal cat = new Animal();

/*        random.nextBoolean();
        ints.length;*/

        cat.name = "Barsik";
        System.out.println(cat.name);

        Animal dog = new Animal();
        System.out.println("Insert dog name");
        //dog.name = scanner.nextLine();
        System.out.println(dog.name);

        cat.age = 3;
        cat.species = "CAT!!!";

        cat.getInfoAboutYourAnimalToConsole();
        dog.getInfoAboutYourAnimalToConsole();

        int ageOfCat = cat.returnAgeOfAnimal();
        System.out.println("Age of " + cat.name + " is " + ageOfCat);
        System.out.println("================");
        cat.someActionOfAnimal("jump", 3);
        System.out.println(cat.howLongICanJumpMore(15));




    }
}
