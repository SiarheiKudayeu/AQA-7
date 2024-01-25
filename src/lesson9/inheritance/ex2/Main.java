package lesson9.inheritance.ex2;

public class Main {
    public static void main(String[] args) {
        Qa qa = new Qa("Alex", 25, 100 );
        Developer developer = new Developer("Sam", 25);

        TeamMember teamMember = new TeamMember("Max", 34, "PM");
        System.out.println("QA:");
        qa.showProfession();
        qa.doWork();
        System.out.println("===========");
        System.out.println("DEv");
        developer.showProfession();
        developer.doWork();
        System.out.println("===========");
        System.out.println("Team");
        teamMember.showProfession();
        teamMember.doWork();


    }
}
