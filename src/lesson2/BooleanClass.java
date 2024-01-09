package lesson2;

public class BooleanClass {
    public static void main(String[] args) {
        boolean myBoolean = false;
        boolean myBoolean2 = true;
        System.out.println(myBoolean2);
        System.out.println(myBoolean);

        // ==
        int x = 10;
        int y = 11;
        int z = 10;
        boolean result = x == y;
        System.out.println("=============");
        System.out.println(result);
        System.out.println(x == z);
        System.out.println("=============");
        // !=
        System.out.println(y != z);
        System.out.println("=============");
        //> < >= <=
        System.out.println(10>10);
        System.out.println(10>=10);

        System.out.println("=============");
        System.out.println(true != true);
        System.out.println(true == false);
        System.out.println(false == false);
        System.out.println(false != true);
        System.out.println(!false);
        System.out.println(!true);

        System.out.println("=============");
        //  || or
        System.out.println(true||false||false);
        System.out.println(10<3||13==4||11!=5);
        System.out.println("=============");
        // && and
        boolean example = 19 > 18 && 19 % 2 == 2;
        System.out.println(example);
        System.out.println("=============");
        System.out.println("Является ли число четным?");
        int qbc = 33;
        boolean result1 = qbc%2 == 1;
        System.out.println(qbc);
        System.out.println(!result1);

    }
}
