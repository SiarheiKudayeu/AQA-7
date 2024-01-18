package lesson6.many_Arrays;

import java.util.Arrays;

public class ManyArraysClass {
    public static void main(String[] args) {
        //Двумерноый массив
        int[][] numbers = new int[3][2]; // { {0,0}, {0,0}, {0,0} }
        int[][] numbers2 = {{1, 2}, {3, 4, 5}, {5, 6}};
        System.out.println(numbers2[1][1]);
        System.out.println(numbers2[1][2]);

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println();
            for (int b = 0; b < numbers2[i].length; b++) {
                System.out.print(numbers2[i][b] + " ");
            }
        }

        for (int[] arrayOfNumbers: numbers2){
            System.out.println();
            for (int number: arrayOfNumbers){
                System.out.print(number + " ");
            }
        }
        System.out.println();

        for (int[] arrayOfNumbers: numbers2){
            System.out.println(Arrays.toString(arrayOfNumbers));
            }




        //Трехмерные массив {{ {0,0}, {0,0}, {0,0} }, { {0,0}, {0,0}, {0,0} }, { {0,0}, {0,0}, {0,0} }}
        int[][][] numbers3 = {
                { {0,0}, {0,0}, {0,0} },
                { {0,0}, {0,0}, {0,0} },
                { {0,0}, {0,0}, {0,0} }
                             };
    }
}
