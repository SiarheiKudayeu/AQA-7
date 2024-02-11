package lesson13.exception.generate_exception2;

public class MainCheckExceptionClass {
    public static void main(String[] args) {
        Example2 example2 = new Example2();
        try {
            example2.checkString4("Text text texw exception");
        } catch (Example2.NechetLenthException | Example2.CountOfWordException | Example2.ContainsWordException e){
            System.out.println(e.getMessage());
        }

    }
}
