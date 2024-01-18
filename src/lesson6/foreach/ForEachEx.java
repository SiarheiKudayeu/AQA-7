package lesson6.foreach;

import java.util.Arrays;
import java.util.Random;

public class ForEachEx {
    public static void main(String[] args) {
        int[] arrayInt = new int[10];
        Random random = new Random();
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(-10, 10);
        }

        //вывод при помощи for
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();


        //вывод при помощи forEach
        for (int arrayElement : arrayInt){
            System.out.print(arrayElement + " ");
        }
        System.out.println();

        int[] arrayInt2 = new int[10];
        for (int arrayElement : arrayInt2) {
            arrayElement = random.nextInt(-10, 10);
        }

        System.out.println(Arrays.toString(arrayInt2));
    }


}

