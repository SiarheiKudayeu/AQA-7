package lesson11.nested_class;

public class Main {
    public static void main(String[] args) {
        OwnerClass.NestedClass.staticNestedMethod();
        System.out.println(OwnerClass.NestedClass.test);

        OwnerClass ownerClass = new OwnerClass();
        ownerClass.method();

        ownerClass.openUrl1();
        ownerClass.openUrl2();



    }
}
