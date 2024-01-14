package lesson4.conditional;

import java.util.Scanner;

public class IfElseClass {

    // if(условие){
    // выполнение кода если условие = true
    // }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int number = scanner.nextInt();
        if (number > 0) {
            if(number==500){
                System.out.println("Inserted 500");
            } else {
                System.out.println("Your number is positive.");
            }
        } else if (number < 0){
            System.out.println("Your number is negative.");
        } else {
            System.out.println("Inserted zero.");
        }
    }
}
