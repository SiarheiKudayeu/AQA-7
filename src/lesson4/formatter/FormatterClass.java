package lesson4.formatter;

public class FormatterClass {
    public static void main(String[] args) {
        // System.out.printf(строка для форматирования, аргументы для замены);

        //String %s
        String var = "textForFormat";
        System.out.printf("This is a string with %s argument", var);
        System.out.println();
        System.out.printf("This is a %s string with %s argument", var, "var");
        System.out.println();
        System.out.printf("This is a %2$s string with %1$s argument", var, "var");
        System.out.println();
        System.out.printf("This is a %1$s string with %1$s argument", var);
        String result = String.format("\nThis is a %1$s string with %1$s argument", var);
        System.out.println(result);

        //%c - char
        //%d - byte, short, int, long
        //%f - float, double

        //%b - boolean
        System.out.println("=============");
        System.out.printf("Boolean formatter %b", true);
        System.out.println();
        System.out.printf("Boolean formatter %b", false);
        System.out.println();
        System.out.printf("Boolean formatter %b", 23.0);
        System.out.println();
        System.out.printf("Boolean formatter %b", null);
        System.out.println();
        System.out.printf("Boolean formatter %b", 'c');


    }
}
