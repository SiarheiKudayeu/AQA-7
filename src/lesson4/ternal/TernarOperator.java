package lesson4.ternal;

import java.util.Scanner;

public class TernarOperator {
    public static void main(String[] args) {
        // условие ? выражение1 : выражение2

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        String message = age > 18 ? "You are adult" : "Go to garden";
        System.out.println(message);*/

        //Определить входит ли введенное число в интервал от 5 до 100 включительно
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number");
        int number = scanner.nextInt();
        String result;
        String positiveResult = "введенное значение входит в интервал от 5 до 100";
        String negativeResult = "введенное значение не входит в интервал от 5 до 100";
        result = number < 5 ? negativeResult : number > 100 ? negativeResult : positiveResult;
        System.out.println(result);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Is car new?");
        boolean isCarNew = scanner.nextBoolean();
        int costAuto = isCarNew ? 10000 : 5000;
        System.out.println("Cost of you auto is "+ costAuto);
    }
}
