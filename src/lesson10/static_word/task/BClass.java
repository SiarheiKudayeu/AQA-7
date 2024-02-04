package lesson10.static_word.task;

public class BClass extends AClass {
    public BClass(){
        System.out.println("Constructor Class B");
    }

    static {
        System.out.println("Static bloc B");
    }
}
