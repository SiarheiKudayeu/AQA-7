package lesson5.while_cycle;

public class WhileClass {
    public static void main(String[] args) {
        int iterator = 1;
        while (iterator <= 10) {
            System.out.println("Hello world " + iterator);
            iterator++;
        }
        System.out.println("End of cycle");
        System.out.println(iterator);

        System.out.println("====================");

        int iterator2 = 1;
        while (iterator2 <= 10) {
            if (iterator2 % 2 == 0) {
                System.out.println("Even number is " + iterator2);
            }
            iterator2++;
        }
    }
}
