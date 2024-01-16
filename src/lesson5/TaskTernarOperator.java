package lesson5;

import java.util.Scanner;

public class TaskTernarOperator {
    /*2)Программа просит ввести с клавиатуры число.
    При помощи тернарного оператора вывести в консоль сообщение типа String, является ли введенное число
    больше нуля, меньше нуля, или оно равно нулю.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int x = scanner.nextInt();
        String message = x > 0 ? "More than zero" : x < 0 ? "Less than zero" : "Equals zero";
        System.out.println(message);
    }
}
