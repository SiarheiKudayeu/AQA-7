package lesson7.overload;

import lesson7.oop.TaskForCreationMethods1;

import java.util.Arrays;
import java.util.Scanner;

public class OverloadExamples {
    public void doSmth() {
        System.out.println("I am empty and not returning anything...");
    }

    public void doSmth(String text) {
        System.out.println("I am method with argument " + text);
    }

/*    public int doSmth1(String r){
        return 10;
    }*/

    public void doSmth(int number) {
        System.out.println("You used number " + number);
    }

    public void doSmth(int number, String text) {
        System.out.println("I am method with argument " + text);
        System.out.println("You used number " + number);
    }

    public void doSmth(String text, int number) {
        System.out.println("I am method with argument " + text);
        System.out.println("You used number " + number);
    }

    public void doSmth(int[] arrayForSorting) {
        new TaskForCreationMethods1().arraySort(arrayForSorting);
        new TaskForCreationMethods1().printArrayToConsole(arrayForSorting);
    }


    public static void main(String[] args) {
        //Qa7Thbest qa7Thbest = new Qa7Thbest();
        OverloadExamples overloadExample = new OverloadExamples();
        overloadExample.doSmth();
        overloadExample.doSmth("Text");
        overloadExample.doSmth(5);
        overloadExample.doSmth(13, "Text with");
        overloadExample.doSmth("Text with", 13);
        System.out.println("==================");
        overloadExample.doSmth(new int[]{23, 4, 6, 9, 3423});
    }
}
