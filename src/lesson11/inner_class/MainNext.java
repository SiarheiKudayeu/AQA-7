package lesson11.inner_class;

public class MainNext {
    public static void main(String[] args) {
        Gym gymCrossfit = new Gym("Kanban", "Functional");
        Gym gymSwimmingPool = new Gym("Scrum", "gymSwimmingPool");
        Gym.Equipment dumbbells = gymCrossfit.new Equipment("dumbbells", 10000);
        Gym.Equipment bar = gymCrossfit.new Equipment("bar", 13000);
        gymCrossfit.printEquipment();
        gymSwimmingPool.printEquipment();
        dumbbells.sellToAnotherGym(gymSwimmingPool, 8000);
        System.out.println("====================");

        gymCrossfit.printEquipment();
        gymSwimmingPool.printEquipment();

        Gym.Equipment boxing = gymCrossfit.new Equipment("boxing", 145643);
        System.out.println("====================");

        gymCrossfit.printEquipment();
        gymSwimmingPool.printEquipment();

        boxing.sellToAnotherGym(gymSwimmingPool, 160000);

        System.out.println("====================");

        gymCrossfit.printEquipment();
        gymSwimmingPool.printEquipment();



    }
}
