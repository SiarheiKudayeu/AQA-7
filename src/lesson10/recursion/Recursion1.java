package lesson10.recursion;

import java.util.Scanner;

//Пользователь вводит положительное число с клавиатуры,
// а система выводит в консоль все числа от введенного,
//до 0. При решении данной задачи попробовать использовать рекурсию
public class Recursion1 {

    public static void main(String[] args) {
        askNumberToPrint();
    }
    private static void printAllNumbers(int number){
        if(number==0){
            System.out.println(number);
        }else if(number < 0){
            System.out.println("Below Zero!");
        }
        else {
            System.out.println(number);
            number--;
            printAllNumbers(number);
        }
    }

    public static void askNumberToPrint(){
        System.out.println("Insert number:");
        printAllNumbers(new Scanner(System.in).nextInt());
    }
}
