package lesson8;

public class Main {
    public static void main(String[] args) {
        TaskWithMethodCreation variable = new TaskWithMethodCreation();
        variable.howManyWords();
        System.out.println("Your current age " + variable.returnMyCurrentAge());
    }
}
