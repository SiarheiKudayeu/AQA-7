package lesson10.recursion;

import java.util.Scanner;

//Пользователь вводит с клавиатуры сумму, которую он хочет взять в кредит, а также сумму
//которую он будет выплачивать каждый месяц. В консоль выводится порядковый номер месяца,
// и сумма оставшаяся для выплаты кредита. Как только кредит погашен, в консоль выводится
//фраза: Кредит погашен за {кол-во месяцев}.
public class Recursion {
    public static void main(String[] args) {
        pay();
    }
    private static void credit(int summ, int money, int counter) {
        summ = summ - money;
        System.out.println("Month number: " + counter + ". You need to pay " + summ + " more");
        if (summ <= 0) {
            System.out.println("Credit already done in " + counter + " month");
        } else {
            counter++;
            credit(summ, money, counter);
        }
    }

    public static void pay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert summ of a credit:");
        int pay1 = scanner.nextInt();
        System.out.println("Insert month payment:");
        int pay2 = scanner.nextInt();
        credit(pay1, pay2, 1);
    }
}
