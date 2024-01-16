package lesson5.for_cycle;

import java.util.Scanner;

public class ForCycleTask2 {
    /*    5)Пользователь вводит с клавиатуры число, а на консоль выводится квадрат из звездочек
со стороной равной этому числу.
Пример: Пользователь ввел 5, вывод в консоль:
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int x = scanner.nextInt();
        char symbol = '*';
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println("");
        }
    }
    }
