package lesson12.generics.ex4;

import lesson11.interfaces.ex2.CrossFitMan;
import lesson12.generics.ex3.GenericHuman;
import lesson12.generics.ex3.Hobbit;
import lesson12.generics.ex3.HorseMan;
import lesson12.generics.ex3.Humanable;
import lesson9.task.Bear;

public class GenericMethodClass {
    public static void main(String[] args) {
        printWhatever(new HorseMan("Horse"));
        printWhatever(new Bear("Alisa", false));
        printWhateverTwoArguments("Text", new CrossFitMan("Alex"));
        printOnlyHumanable(new Hobbit("Alina"));
    }

    public static <T> void printWhatever(T value){
        System.out.println(value);
    }
    public static <T, T1> void printWhateverTwoArguments(T value, T1 value2){
        System.out.println(value);
        System.out.println(value2);
    }

    public static  <T extends Humanable> void printOnlyHumanable(T instance){
        System.out.println(instance);
    }

    public static void printOnlyHumanableWildCart(GenericHuman<?> instance){
        System.out.println(instance);
    }
}
