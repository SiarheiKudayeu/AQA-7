package lesson6.arrays_methods;

import java.util.Random;

public class FindArrayMinClass {
    public static void main(String[] args) {
        int[] arrRand = new int[10];
        for (int i = 0; i < arrRand.length; i++) {
            arrRand[i] = new Random().nextInt(-50, 50);
            System.out.print(arrRand[i] + " ");
        }

        int minimum = arrRand[0];
        for(int i = 0; i < arrRand.length; i++){
            if(minimum > arrRand[i]){
                minimum = arrRand[i];
            }
        }

        int minimum2 = arrRand[0];
        for(int number: arrRand){
            if(minimum2 > number){
                minimum2 = number;
            }
        }



        System.out.println("\nMinimum = " + minimum);
        System.out.println("Minimum = " + minimum2);


    }
}
