package lesson13.collection.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListEx {
    public static void fillList(List<Integer> list){
        for (int i = 0; i < 10000000; i ++){
            list.add(i);
        }
    }

    public static void getListElement(List<Integer> list){
        for (int i = 0; i < 10000; i ++){
            list.get(i);
        }
    }
    public static void addElementInTheMiddle(List<Integer> list){
        for (int i = 0; i < 1000; i ++){
            list.add(15, i);
        }
    }

    public static void main(String[] args){

    //[20, 11, 25, 9, 3, 28, 12, 17, 26, 18]{
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

     /*   fillList(linkedList);
        fillList(arrayList);
        System.out.println(linkedList);
        System.out.println(arrayList);*/


     /*   //fill List
        long start = System.currentTimeMillis();
        fillList(linkedList);
        long finish = System.currentTimeMillis();
        System.out.println("Time To fill linkedList " + (finish - start));

        long start2 = System.currentTimeMillis();
        fillList(arrayList);
        long finish2 = System.currentTimeMillis();
        System.out.println("Time To fill arrayList " + (finish2 - start2));*/

/*        //getElement
        fillList(linkedList);
        fillList(arrayList);
        long start = System.currentTimeMillis();
        getListElement(linkedList);
        long finish = System.currentTimeMillis();
        System.out.println("Time To get linkedList " + (finish - start));

        long start2 = System.currentTimeMillis();
        getListElement(arrayList);
        long finish2 = System.currentTimeMillis();
        System.out.println("Time To get arrayList " + (finish2 - start2));*/

        //add to the centerList
        fillList(linkedList);
        fillList(arrayList);
        long start = System.currentTimeMillis();
        addElementInTheMiddle(linkedList);
        long finish = System.currentTimeMillis();
        System.out.println("Time To set in the middle linkedList " + (finish - start));

        long start2 = System.currentTimeMillis();
        addElementInTheMiddle(arrayList);
        long finish2 = System.currentTimeMillis();
        System.out.println("Time To set in the middle arrayList " + (finish2 - start2));
    }
}
