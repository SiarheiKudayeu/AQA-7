package lesson4.scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner textHelper = new Scanner(System.in);
/*
        System.out.println("Please insert some numeric value:");
        int x = textHelper.nextInt();
        System.out.println(x);

        System.out.println("Please insert some double value:");
        double y = textHelper.nextDouble();
        System.out.print(y);*/

        System.out.println("Please insert some text:");
        String textWithNext = textHelper.next();
        System.out.println(textWithNext);
        System.out.println(textHelper.next());

 /*       System.out.print("Please insert some text again:");
        String textWithNextLine = textHelper.nextLine();
        System.out.print(textWithNextLine);*/

    }
}
