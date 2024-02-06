package lesson11.nested_class;

public class OwnerClass {

    public static class Url{
        private final static String url1 = "www.www";
        private final static String url2 = "www.www2";
    }
    public String string;
    private static String staticString = "staticString";

    public void method(){
        System.out.println("Non static");
    }

    private static void staticMethod(){
        System.out.println("Static");
    }
    public static class NestedClass{
        public static String test = staticString + " test!";

        public void nestedMethod(){
            staticMethod();
        }

        public static void staticNestedMethod(){
            staticMethod();
        }
    }

    public void openUrl1(){
        System.out.println("I opened " + Url.url1);
    }

    public void openUrl2(){
        System.out.println("I opened " + Url.url2);
    }
}
