package lesson13.exception.remember;

public class ClassToRemember {
    public static void main(String[] args) {
        String text = "Text";
        try {
            System.out.println(text.charAt(2));
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("I am finally");
        }
        System.out.println("Hello");

    }
}
