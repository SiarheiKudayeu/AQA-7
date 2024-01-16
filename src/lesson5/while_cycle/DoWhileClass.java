package lesson5.while_cycle;

import java.util.Scanner;

public class DoWhileClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int x = scanner.nextInt();
        while (x > 0) {
            System.out.println(x);
        }
        System.out.println("=================");
        do {
            System.out.println(x);
        } while (x > 0);
    }
}
