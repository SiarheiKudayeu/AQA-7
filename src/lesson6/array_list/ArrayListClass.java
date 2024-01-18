package lesson6.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayListClass {
    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();
        System.out.println(stringArrayList);

        //add
        stringArrayList.add("One");
        stringArrayList.add("Two");
        stringArrayList.add("Three");
        System.out.println(stringArrayList);
        stringArrayList.add(2, "Middle");
        System.out.println(stringArrayList);

        //toArray()
        Object[] arrayFromArrayList = stringArrayList.toArray();
        System.out.println(Arrays.toString(arrayFromArrayList));

        //size()
        System.out.println(stringArrayList.size());

        //get()
        System.out.println(stringArrayList.get(2));

        //remove() [One, Two, Three]
        stringArrayList.remove(2);
        System.out.println(stringArrayList);

        //set()
        stringArrayList.set(2, "setValue");
        System.out.println(stringArrayList);

        //Прямая инициализация
        List<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 5));
        System.out.println(integerArrayList);

        //contains
        System.out.println(integerArrayList.contains(3));

        //forEach
        for(String text: stringArrayList){
            System.out.print(text + " ");
        }
        System.out.println();
        for (int i = 0; i < stringArrayList.size(); i++){
            System.out.print(stringArrayList.get(i) + " ");
        }

        //indexOf
        System.err.println("\n" + stringArrayList.indexOf("Twow"));

        //trimToSize
        ArrayList<String> strings = new ArrayList<>(30);
        strings.add("Text");
        System.out.println(strings.size());
        strings.trimToSize();
        System.out.println(strings.size());
    }


}
