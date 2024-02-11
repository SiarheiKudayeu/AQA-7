package lesson13.collection.base;

import javax.swing.plaf.LabelUI;
import java.util.*;

public class SetExample {

    //List //Set //MapExample

    public static void fillSet(Set<String> set){
        set.add("auto");
        set.add("car");
        set.add("helipoter");
        set.add("boat");
        set.add("plane");
        set.add("bus");
        set.add("cycle");
        set.add("car");
    }
    public static void main(String[] args) {
        //HashSet doesn't guarantee the order;
        Set<String> hashSetset = new HashSet<>();
        fillSet(hashSetset);
        System.out.println(hashSetset);
        System.out.println(hashSetset.size());
/*        for (String vehicle: hashSetset){
            System.out.println(vehicle);
        }*/
        Object[] string = hashSetset.toArray();
        System.out.println(string[3]);
        System.out.println("===============");

        //LinkedHashSet guarantee the order;
        Set<String> linkedHashSet = new LinkedHashSet<>();
        fillSet(linkedHashSet);
        System.out.println(linkedHashSet);
        System.out.println("===============");


        //TreeSet ordered by
        Set<String> treeSet = new TreeSet<>();
        fillSet(treeSet);
        System.out.println(treeSet);


    }
}
