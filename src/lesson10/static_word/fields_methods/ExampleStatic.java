package lesson10.static_word.fields_methods;

public class ExampleStatic {
    public String nonStaticString = "nonStaticString";
    public void nonStaticMethod(){
        System.out.println("I am not static");
    }
    public static String staticString = "staticString";
    public static void staticMethod(){
        System.out.println("I am static");
    }

    public static void printInfoStatic(){
        staticMethod();
        System.out.println(staticString);
        /*nonStaticMethod();
        System.out.println(nonStaticString);*/
    }

    public void printInfoNonStatic(){
        staticMethod();
        System.out.println(staticString);
        nonStaticMethod();
        System.out.println(nonStaticString);
    }
}
