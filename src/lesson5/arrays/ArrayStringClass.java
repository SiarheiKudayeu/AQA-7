package lesson5.arrays;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ArrayStringClass {
    public static void main(String[] args) {
        String[] strings = new String[4];
        System.out.println(Arrays.toString(strings));
        //1) Вручную
        strings[2] = "text";
        System.out.println(Arrays.toString(strings));

        //2) Явная инициализация
        String[] strings2 = {"Text1", "Hello", "It's me"};
        System.out.println(Arrays.toString(strings2));

        Scanner[] scanners = new Scanner[3];
        scanners[0] = new Scanner(System.in);

        Scanner[] scanners2 = {new Scanner(System.in), new Scanner(System.in), new Scanner(System.in)};
        System.out.println("Insert some text:");
        String text = scanners2[2].nextLine();
        System.out.println(text);

        Object[] objects = new Object[3];
        objects[0] = "Text";
        objects[1] = new Scanner(System.in);
        objects[2] = 3;
    }
}
