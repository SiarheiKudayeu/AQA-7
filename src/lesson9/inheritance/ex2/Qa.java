package lesson9.inheritance.ex2;

public class Qa extends TeamMember{
    public int numberOfCases;
  /*  public Qa(String name, int age) {
        super(name, age, "Quality Assurance");
    }*/

    public Qa(String name, int age, int numberOfCases){
        super();
        this.name = name;
        this.age = age;
        this.profession = "Quality";
        this.numberOfCases = numberOfCases;
    }

    @Override
    public void doWork(){
        super.doWork();
        System.out.println(super.profession);
        System.out.println("I write test cases.");
    }

}
