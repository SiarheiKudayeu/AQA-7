package lesson13.collection.comporator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ConsolesMain {
    public static void main(String[] args) {
        List<Consoles> consolesList = new ArrayList<>(Arrays.asList(
                new Consoles(1000, Consoles.Name.PLAYSTATION),
                new Consoles(600, Consoles.Name.XBOX),
                new Consoles(800, Consoles.Name.NINTENDO),
                new Consoles(700, Consoles.Name.XBOX)
        ));

        Comparator<Consoles> comparatorByCost = new ComparatorForConsolesOrderByCost();
        consolesList.sort(comparatorByCost);

        System.out.println(consolesList);

        consolesList.sort(comparatorByCost.reversed());
        System.out.println(consolesList);

        Comparator<Consoles> comparatorByName = new Comparator<Consoles>() {
            @Override
            public int compare(Consoles o1, Consoles o2) {
                return o1.getName().getName().compareTo(o2.getName().getName());
            }
        };

        consolesList.sort(comparatorByName);
        System.out.println(consolesList);

        consolesList.sort(comparatorByName.reversed());
        System.out.println(consolesList);

        List<Consoles> consolesList2 = new ArrayList<>(Arrays.asList(
                new Consoles(1000, Consoles.Name.PLAYSTATION),
                new Consoles(600, Consoles.Name.XBOX),
                new Consoles(800, Consoles.Name.NINTENDO),
                new Consoles(700, Consoles.Name.XBOX)
        ));
        System.out.println("===========");
        consolesList2.sort(comparatorByCost);
        System.out.println(consolesList2);
        consolesList2.sort(comparatorByName);
        System.out.println(consolesList2);
    }


}
