package lesson9.task;

import java.util.Arrays;

public class Person {
    public String name;
    public int age;
    public String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void getInfo() {
        System.out.println("My name is " + name + ". My age is " + age + ". My profession is " + profession + ".");
    }

 /*   @Override
    public String toString() {
        return "My name is " + name + ". My age is " + age + ". My profession is " + profession + ".";
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }

    public static void main(String[] args) {
        int[] array = {12, 34, 56};
        Person ivasik = new Person("Ivasik", 33, "QA");
        //ivasik.getInfo();
        System.out.println(ivasik);
        String ivasikString = String.valueOf(ivasik);
        System.out.println(Arrays.toString(array));
        System.out.println(ivasikString);
    }
}
