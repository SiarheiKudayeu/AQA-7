package lesson9.inheritance.ex2;

import lesson9.inheritance.ex1.Telegram;

public class TeamMember {
    public String name;
    public int age;
    public String profession;

    public TeamMember(){}

    public TeamMember(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }

    public void showProfession(){
        System.out.println("My profession is " + profession);
    }

    public void doWork(){
        System.out.println("I do work");
    }
}
