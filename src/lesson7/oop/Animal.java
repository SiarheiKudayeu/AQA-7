package lesson7.oop;

public class Animal {
    //поля
    public String name;
    public int age;
    public String species;

    //метод который ничего не возвращает и ничего не принимает
    public void getInfoAboutYourAnimalToConsole() {
        System.out.println("Name of your animal is " + name + ".");
        System.out.println("Specie of animal is " + species + ".");
        System.out.println("Age of your animal is " + age + ".");
    }

    //метод который возвращает значение и ничего не принимает
    public int returnAgeOfAnimal(){
        System.out.println("lldvllvjldvw");
        int ageOfPet = age;
        return ageOfPet;
    }

    //метод который ничего не возвращает значение и  принимает аргументы
    public void someActionOfAnimal(String action, int numberOfActions){
        System.out.println("Your animal action is " + action + " " + numberOfActions + " times.");
    }

    //метод который возвращает значение и принимает аргументы
    public int howLongICanJumpMore(int averageLive){
        System.out.println("You will be:");
        return averageLive - age;
    }
}
