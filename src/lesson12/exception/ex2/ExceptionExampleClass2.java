package lesson12.exception.ex2;

import java.util.Scanner;

public class ExceptionExampleClass2 {
    public static void main(String[] args) {
        int[] array = {12, 44, 0, 12, 55};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert index from keyboard: ");
        try {
            System.out.println(100 / array[scanner.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Выход за пределы массива");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Деление на ноль");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println("Exception");
        }
        System.out.println("All is OK!!!");

    }
}
