package lesson11.inner_class;

import java.util.Arrays;

public class Gym {

    static String staticString;

    public static void doStaticFromOwner() {
        System.out.println("doStaticFromOwner");
    }

    public String name;
    private String type;

    public Equipment[] equipment;

    public void printEquipment() {
        System.out.println(Arrays.toString(equipment));
    }

/*    public void checkAccessToInnerClass(){
        printInfoAboutGymName();
        System.out.println(cost);
    }*/

    public Gym(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public class Equipment {
        private String name;
        public int cost;

        public Equipment(String name, int cost) {
            this.name = name;
            this.cost = cost;
            if (equipment == null) {
                equipment = new Equipment[1];
                equipment[0] = this;
            } else {
                Equipment[] temp = new Equipment[equipment.length + 1];
                for (int i = 0; i < equipment.length; i++) {
                    temp[i] = equipment[i];
                }
                temp[temp.length - 1] = this;
                equipment = temp;
            }
        }

        public void sellToAnotherGym(Gym gymBuyer, int cost) {
            Equipment newEquipment = gymBuyer.new Equipment(name, cost);
            deleteEquipment(this);
        }

        private void deleteEquipment(Equipment equipment1) {
            int index = getIdOfEquipment(equipment1);
            if (!(index == -1)) {
                equipment[index] = null;
                Equipment[] tempEquipment = new Equipment[equipment.length - 1];
                int counter = 0;
                for (int i = 0; i < equipment.length; i++) {
                    if (equipment[i] == null) {
                        continue;
                    }
                    tempEquipment[counter] = equipment[i];
                    counter++;
                }
                equipment = tempEquipment;
            }

        }

        private int getIdOfEquipment(Equipment equipment1) {
            int idOfEquipment = -1;
            for (int i = 0; i < equipment.length; i++) {
                if (equipment[i].name.equals(equipment1.name)) {
                    idOfEquipment = i;
                    break;
                }
            }
            return idOfEquipment;
        }

        public static void checkDoStaticFromOwner() {
            doStaticFromOwner();
            System.out.println(staticString);
            //System.out.println(type);
        }

        @Override
        public String toString() {
            return "Equipment{" +
                    "name='" + name + '\'' +
                    ", cost=" + cost +
                    '}';
        }

        public void printInfoAboutGymName() {
            System.out.println("This Equipment " + name + " is owned by " + Gym.this.name);
        }
    }

}
