package lesson9.inheritance.ex2;

public class Developer extends TeamMember{
    public Developer(String name, int age) {
        //super.doWork(); вызов конструктора на первом месте
        super(name, age, "Developer");

    }
    @Override
    public void doWork(){
        super.doWork();
        System.out.println("I write code.");
    }
}
