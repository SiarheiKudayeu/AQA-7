package lesson10.static_word.fields_methods;

public class MainForExampleStatic {
    public static void main(String[] args) {
        ExampleStatic exampleStatic = new ExampleStatic();
        exampleStatic.nonStaticMethod();
        System.out.println(exampleStatic.nonStaticString);
        System.out.println("=====================");
        ExampleStatic.staticMethod();
        System.out.println(ExampleStatic.staticString);
        System.out.println("=====================");
        exampleStatic.staticMethod();
        System.out.println(exampleStatic.staticString);
        System.out.println("=====================");
        exampleStatic.printInfoNonStatic();
        ExampleStatic.printInfoStatic();
    }
}
