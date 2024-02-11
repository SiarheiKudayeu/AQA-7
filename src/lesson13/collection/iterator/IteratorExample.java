package lesson13.collection.iterator;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals("Two")){
                iterator.remove();
            }
        }
        System.out.println(arrayList);

        ListIterator<String> listIterator = arrayList.listIterator();
    }
}
