package lesson6;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner scanner10 = new Scanner(System.in);
        System.out.println("Какая программа вам интересна?");
        String p = scanner10.nextLine();

        Scanner scanner11 = new Scanner(System.in);
        System.out.println("Какую ОС вы используете?");
        String oc = scanner11.nextLine();
        switch (p){
            case ("IntelliJ IDEA"):
                switch (oc){
                    case("Linux"):
                        System.out.println("http 1");
                        break;
                    case("macOS"):
                        System.out.println("http 2");
                        break;
                    case("Windows"):
                        System.out.println("http 3");
                        break;
                    default:
                        System.out.println("Нет такой ОС");
                }
                break;
            case ("Git"):
                switch (oc){
                    case("Linux"):
                        System.out.println("http 4");
                        break;
                    case("macOS"):
                        System.out.println("http 5");
                        break;
                    case("Windows"):
                        System.out.println("http 6");
                        break;
                    default:
                        System.out.println("Нет такой ОС");

                }
                break;
            case ("Java"):
                switch (oc){
                    case("Linux"):
                        System.out.println("http 7");
                        break;
                    case("macOS"):
                        System.out.println("http 8");
                        break;
                    case("Windows"):
                        System.out.println("http 9");
                        break;
                    default:
                        System.out.println("Нет такой ОС");

                }
                break;
            default:
                System.out.println("Нет такой программы");
        }

    }
}

