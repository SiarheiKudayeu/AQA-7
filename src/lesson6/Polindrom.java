package lesson6;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        String myNumber = scanner.nextLine();
        String revertNumber = "";
        for (int i = myNumber.length() - 1; i >= 0; i--){
            revertNumber = revertNumber + myNumber.charAt(i);
        }
        System.out.println(myNumber);
        System.out.println(revertNumber);
        if(myNumber.equals(revertNumber)){
            System.out.println("Polindrome");
        } else {
            System.out.println("Not Polindrome");
        }
    }
}
