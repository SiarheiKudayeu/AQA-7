package lesson11.inner_class;

public class Main {
    public static void main(String[] args) {
        Gym gymCrossfit = new Gym("Kanban", "Functional");
        gymCrossfit.printEquipment();
        System.out.println("=================");
        Gym.Equipment dumbbells = gymCrossfit.new Equipment("dumbbells", 10000);
        gymCrossfit.printEquipment();
        System.out.println("=================");
        System.out.println(dumbbells);
        dumbbells.printInfoAboutGymName();

        Gym.Equipment bar = new Gym("Scrum", "Non-functional").new Equipment("bar", 333);
    }
}
