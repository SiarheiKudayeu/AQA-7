package lesson4.switch_case;

import java.util.Scanner;

public class SwitchCaseClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Dev, QA, DevOps
        System.out.println("Type your profession?:");
        String profession = scanner.nextLine();

        switch (profession.toLowerCase()){
            case ("qa"):
            case("aqa"):
                System.out.println("Hello tester");
                System.out.println("Are you testing mobile apps?");
                String result = scanner.nextLine();
                switch (result){
                    case ("yes"):
                        System.out.println("You are testing mobile apps.");
                        break;
                    case ("no"):
                        System.out.println("You are not testing mobile apps.");
                        break;
                }
                break;
            case ("dev"):{
                System.out.println("Hello Developer");
                break;
            }
            case ("devops"):
                System.out.println("Hello DevOps");
                break;
            default:
                System.out.println("There is no such profession");
        }
    }
}
