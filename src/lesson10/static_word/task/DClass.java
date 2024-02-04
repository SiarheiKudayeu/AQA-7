package lesson10.static_word.task;

public class DClass extends CClass {
    public DClass() {
        System.out.println("Constructor Class D");
    }

    static {
        System.out.println("Static bloc D");
    }
}
