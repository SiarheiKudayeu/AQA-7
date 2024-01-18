package lesson6;

import java.util.Random;

public class Task1 {
     /*1)Заполнить массив на 10 элементов случайными числами
    от -50 до +50.
    Вывестив консоль сам массив.
    Вывести в консоль сумму всех его элементов.*/
     public static void main(String[] args) {
         int[] arrRand = new int[10];
         Random rand = new Random();
         int s = 0;
         for (int i = 0; i < arrRand.length; i++) {
             arrRand[i] = rand.nextInt(-50, 50);
             System.out.print(arrRand[i] + " ");
             s = s + arrRand[i];

         }
         System.out.println();
         System.out.println("Summa = " + s);
     }
}

