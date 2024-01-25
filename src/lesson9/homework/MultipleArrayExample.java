package lesson9.homework;

import java.util.Arrays;

public class MultipleArrayExample {
    public void arrayPrint(int[][] array){
        for(int[] arrayOfInts: array){
            System.out.print(Arrays.toString(arrayOfInts) + " ");
        }
    }
    /*1) Пользователь задает размерность двумерного массива с клавиатуры.
    Массив заполняется случайными числами от 0 до 1000.
    Необходимо создать одномерный массив, состоящий из максимальных значений
    каждого отдельного массива входящего в двумерный.
    Новый полученный массив вывести на экран.*/
    public static void main(String[] args) {
        int[][] a = new int[3][4];
        int[][] numbersMultipleArray = {{12, 3, 34, 34}, {23, 4, 23, 234}, {13, 6756757, 32, 342}};
        int[] arrayNumber = new int[3];

        for (int i = 0; i < numbersMultipleArray.length; i++) {
            int max = numbersMultipleArray[i][0];
            for (int b = 0; b < numbersMultipleArray[i].length; b++) {
                if (numbersMultipleArray[i][b] > max) {
                    max = numbersMultipleArray[i][b];
                }
            }
            arrayNumber[i] = max;
        }

        for(int[] arrayOfInts: numbersMultipleArray){
           for (int number: arrayOfInts){
               System.out.print(number + " ");
           }
            System.out.println();
        }

        for(int[] arrayOfInts: numbersMultipleArray){
            System.out.print(Arrays.toString(arrayOfInts) + " ");
        }
        System.out.println("\n=========================");
        new MultipleArrayExample().arrayPrint(numbersMultipleArray);

    }
}
