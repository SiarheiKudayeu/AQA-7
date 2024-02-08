package lesson12.exception.ex1;

import lesson12.generics.ex1.Container;
import lesson12.generics.ex1.ContainerApp;
import lesson12.generics.ex1.GenericContainer;
import lesson12.generics.ex3.Elf;

import java.util.Scanner;

public class ExceptionExampleClass1 {
    public static void main(String[] args) {
        /*//ArithmeticException
        System.out.println(14/0);*/

   /*     //ArrayIndexOutOfBoundsException
        int[] array = new int[3];
        System.out.println(array[1000]);*/

/*       //ClassCastException
        Container container = new Container(123);
        Container container2 = new Container("123");
        System.out.println((String) container2.getObject() + (String) container.getObject());*/

/*        //NullPointerException
        Elf elf = null;
        elf.setAge(3);*/

        try {
            int x = 15;
            int y = new Scanner(System.in).nextInt();
            System.out.println(x/y);
            System.out.println("After division");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("In any case!");
        }
        System.out.println("to be continued!!!");


    }
}
