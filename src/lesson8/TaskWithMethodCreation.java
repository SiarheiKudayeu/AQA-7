package lesson8;

import java.util.Date;
import java.util.Scanner;

public class TaskWithMethodCreation {

        /*    1)Написать метод, который будет спрашивать у пользователя ввести с клавиатуры предложение
    а после выводит в консоль из скольки слов состоит данное предложение.
    А также этот метод должен возвращать количество этих слов.*/

    /*        2) Написать метод, который будет просить ввести с клавиатуры ваш год рождения.
Данный метод возвращает int который равен вашему возрасту.
Используем класс Date как на прошлом занятии.
        (P.s пока не затрагиваем момент месяца рождения,
останавливаемся только на разнице лет.)*/

        public int howManyWords(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ваше предложение: ");
            int countWords = scanner.nextLine().split(" ").length;
            System.out.println("Количество слов в вашей строке: " + countWords);
            return countWords;
        }

        public int returnMyCurrentAge(){
            /*Date date = new Date();
            String currentYear = String.format("%tY", date);
            int currentYearInt = Integer.parseInt(currentYear);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert your year of birth: ");
            int myYearOfBirth = scanner.nextInt();
            int myAge = currentYearInt - myYearOfBirth;
            return myAge;*/
            System.out.println("Insert your year of birth: ");
            return Integer.parseInt(String.format("%tY", new Date())) - new Scanner(System.in).nextInt();
        }
}
