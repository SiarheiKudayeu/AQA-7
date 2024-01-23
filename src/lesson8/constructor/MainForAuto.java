package lesson8.constructor;

public class MainForAuto {
    public static void main(String[] args) {
        Auto bmw = new Auto("X1", 15000, true);
        bmw.setName("X5");
        System.out.println(bmw.getName());
    }
}
