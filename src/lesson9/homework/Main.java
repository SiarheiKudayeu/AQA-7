package lesson9.homework;

import lesson9.task.Person;

public class Main {
    public static void main(String[] args) {
        Person sergey = new Person("Sergey", 32, "QA");
        System.out.println(sergey);
        System.out.println(sergey.getAge());

        lesson9.homework.Person person = new lesson9.homework.Person();
        System.out.println(person);
    }
}
