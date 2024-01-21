package lesson5.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysRandomField {
    public static void main(String[] args) {
        //Варинт1
/*        Random randomObject = new Random();
        int randomInt = randomObject.nextInt(10);
        System.out.println(randomInt);
        int[] randomArray = new int[randomInt];
        for (int i = 0; i < randomArray.length; i++) {
            int x = randomObject.nextInt(-20, 20);
            while (x % 2 != 0) {
                x = randomObject.nextInt(-20, 20);
            }
            randomArray[i] = x;
        }
        System.out.println(Arrays.toString(randomArray));*/

        //Варинт2 число от -10 до 10
        int randomInt2 = (int) ((Math.random() * 21) - 10);
        System.out.println(randomInt2);
    }
}
