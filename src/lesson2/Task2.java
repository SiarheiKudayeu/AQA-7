package lesson2;

public class Task2 {
    /*
     */

    /*
    x = 6
    y = 12
    z = 11 */

    public static void main(String[] args) {
        int x = 5;
        int y = 4 + x++; // x = x + 1
        y+= --y - x;
        int z = y++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
