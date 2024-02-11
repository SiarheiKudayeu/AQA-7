package lesson13.collection.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Consoles> consolesList = new ArrayList<>();
        consolesList.add(new Consoles(800, Consoles.Name.PLAYSTATION));
        consolesList.add(new Consoles(668, Consoles.Name.PLAYSTATION));
        consolesList.add(new Consoles(1234, Consoles.Name.XBOX));
        consolesList.add(new Consoles(33, Consoles.Name.NINTENDO));
        consolesList.add(new Consoles(33, Consoles.Name.XBOX));

        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,34,6,56));
        System.out.println(consolesList);
        Collections.sort(consolesList);
        System.out.println(consolesList);
    }
}
