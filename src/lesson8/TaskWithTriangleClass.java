package lesson8;

import java.util.Scanner;

public class TaskWithTriangleClass {
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int number = scanner.nextInt();
        for(int i = number; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(j == 0 || j == (i - 1) || i == number){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
