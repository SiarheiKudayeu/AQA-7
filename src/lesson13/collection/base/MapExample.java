package lesson13.collection.base;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void fillMap(Map<Integer, String> map){
        map.put(5, "Leopold");
        map.put(44, "Sam");
        map.put(15, "Anna");
        map.put(1, "Dan");
        map.put(88, "Taras");
        map.put(3, "Alisa");
        map.put(446, "Gleb");
        map.put(5, "Rex");
    }
    public static void main(String[] args) {
        //HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        fillMap(hashMap);
        System.out.println(hashMap);

        for(Map.Entry<Integer, String> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("=========================");


        //LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        fillMap(linkedHashMap);
        System.out.println(linkedHashMap);
        System.out.println("=========================");

        //TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        fillMap(treeMap);
        System.out.println(treeMap);
        System.out.println("=========================");

    }
}
