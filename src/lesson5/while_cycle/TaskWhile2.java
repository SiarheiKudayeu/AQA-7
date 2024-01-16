package lesson5.while_cycle;

import java.util.Scanner;

public class TaskWhile2 {
    /*
  2) Создать бесконечный цикл, который будет спрашивать ввести у пользователя
  с клавиатуры число, и суммировать все введенные пользователем числа до тех пор,
  пока он не введет с клавиатуры слово FINAL.
  Конечную сумму программа должна вывести в консоль после завершения цикла.
  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        String value = scanner.nextLine();
        int result = 0;
        while (!value.equalsIgnoreCase("FINAL")){
            result = result + Integer.parseInt(value);
            System.out.println("Insert number:");
            value = scanner.nextLine();
        }
        System.out.println(result);
    }
}
