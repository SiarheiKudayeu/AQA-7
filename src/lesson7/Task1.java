package lesson7;

import java.util.Scanner;

public class Task1 {

    /*    Необходимо вывести на экран перевернутый прямоугольный треугольник прямым углом сверху в левой части.
 Для вывода использовать условные операторы, циклы.
 Команду System.out.println(); System.out.print(); и можно использовать только с одним символом *.
 Пользователь вводит с клавиатуры число, которое будет считаться основанием треугольника,
 а программа выводит сам треугольник.
 Пример с числом 7:
         *******
         ******
         *****
         ****
         ***
         **
         *

         *******
         *    *
         *   *
         *  *
         * *
         **
         *
 Необходимо написать программу для вывода вначале заполненного, а потом и пустого треугольника.*/
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = x;
        while (x > 0) {
            for (int i = x; i > 0; i--) {
                System.out.print("*");
            }
            x--;
            System.out.println();
        }


        for(int i = y; i > 0; i--){
            System.out.println();
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
        }
    }
}

