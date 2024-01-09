package lesson2;

public class IncrementDecrement {
    public static void main(String[] args) {
        //постфиксный инкремент (++)
        int a = 3;
        // a++ equals a = a + 1;
        System.out.println(a++);   // a = a + 1;
        System.out.println(a);
        System.out.println("========================");
        int b = 3;
        System.out.println("========================");
        //префиксный инкремент
        // ++b equals b = b + 1;
        System.out.println(++b);
        System.out.println(b);
        System.out.println("========================");
        //постфиксный декремент
        // c-- equals c = c - 1;
        int c = 3;
        System.out.println(c--);
        System.out.println(c);
        System.out.println("========================");
        //префиксный декремент
        // d-- equals d = d - 1;
        int d = 3;
        System.out.println(--d);
        System.out.println(d);
        System.out.println("========================");
        int e = 3;
        e+=7;  // e = e + 7;
        System.out.println(e);
    }

}
