package lesson2;

public class CastingClass {
    public static void main(String[] args) {
        int x = 256;
        byte y = 3;
        y = (byte) x;

        byte z = 3;
        z = (byte) x;
        System.out.println(y);
    }
}
