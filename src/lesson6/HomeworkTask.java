package lesson6;

public class HomeworkTask {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        a = a + b; // a = 16, b = 9
        b = a - b; // a = 16, b = 7
        a = a - b; // a = 9, b = 7
        System.out.println(a);
        System.out.println(b);
    }
}
