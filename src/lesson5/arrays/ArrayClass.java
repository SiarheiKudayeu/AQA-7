package lesson5.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {
        int x = 5;
        int[] arrayInt = new int[5];
        int[] arrayInt2 = new int[5];
        System.out.println(arrayInt[4]);
        System.out.println(arrayInt);
        System.out.println(arrayInt2);
        System.out.println(arrayInt.equals(arrayInt2));


        //Вывод массива в консоль
        System.out.println(Arrays.toString(arrayInt));
        //количество элементов массива
        System.out.println(arrayInt.length);
        //Вывод массива в консоль часть2
        for (int i = 0; i < arrayInt.length; i++){
            System.out.print(arrayInt[i] + " ");
        }

        //1) Вручную
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        arrayInt[3] = 4;
        arrayInt[4] = 5;
        System.out.println("\n=============");
        System.out.println(Arrays.toString(arrayInt));

        //2) Явная инициализация
        System.out.println("================");
        int[] arrayInt3 = {3, 33, 333, 3333};
        System.out.println(arrayInt3.length);
        System.out.println(Arrays.toString(arrayInt3));

        //3 цикл for
        System.out.println("================");
        int[] forArray = new int[10];
        for (int i = 0; i < forArray.length; i++){
            forArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(forArray));


    }
}
