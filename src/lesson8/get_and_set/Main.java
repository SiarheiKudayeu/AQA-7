package lesson8.get_and_set;

public class Main {
    public static void main(String[] args) {
        Dog buldog = new Dog();
        /*buldog.name = "Maximus";
        buldog.countOfLegs = 4;*/

        Dog buldog2 = new Dog();

        buldog.setName("Maximus");
        buldog.setCountOfLegs(4);

        buldog2.setName("Jin");
        buldog2.setCountOfLegs(4);
        //System.out.println(buldog.name);
        System.out.println(buldog.getName());


        System.out.println(buldog2.getName());
    }
}
