package lesson12.generics.ex3;

import lesson9.task.Bear;

public class CreatorApp {
    public static void main(String[] args) {
        GenericHuman<Elf> elf = new GenericHuman<>(new Elf("Adam"));
        elf.sayInfoAboutThisInstance();
        System.out.println(elf.getHumanable());

        GenericHuman<Human> human = new GenericHuman<>(new Human("SAm"));
        human.sayInfoAboutThisInstance();
        System.out.println(human.getHumanable());
    }
}
