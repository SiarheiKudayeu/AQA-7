package lesson7.oop;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        TaskForCreationMethods1 taskForCreationMethods1 = new TaskForCreationMethods1();
        taskForCreationMethods1.inNotgive(3, 100);

        int[] arrayForSorting = {13, 4, 14, 234, 57, 568, 4, 9, 3};
        taskForCreationMethods1.arraySort(arrayForSorting);
        System.out.println(Arrays.toString(arrayForSorting));
        taskForCreationMethods1.printArrayToConsole(arrayForSorting);
        System.out.println();

        taskForCreationMethods1.dateProvider();
    }
}
