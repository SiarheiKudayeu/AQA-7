package lesson10.static_word.task;

public class CClass extends BClass{
    public CClass(){
        System.out.println("Constructor Class C");
    }

    static {
        System.out.println("Static bloc C");
    }
}
