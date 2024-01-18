package lesson6.arrays_methods;

import java.util.Arrays;
import java.util.Random;

public class ArraysSort {
    //По возрастанию упорядочить
    public static void main(String[] args) {
        int[] arrRand = new int[10];
        for (int i = 0; i < arrRand.length; i++) {
            arrRand[i] = new Random().nextInt(-50, 50);
            System.out.print(arrRand[i] + " ");
    }

        for(int i = 0; i < arrRand.length; i++){
            int min;
            for(int a = i + 1; a < arrRand.length; a++ ){
                if(arrRand[i] > arrRand[a]){
                    min = arrRand[a];
                    arrRand[a] = arrRand[i];
                    arrRand[i] = min;
                }
            }
        }
        System.out.println();

        System.out.println(Arrays.toString(arrRand));



    }
}
