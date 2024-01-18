package lesson6.array_class;


import java.util.Arrays;
import java.util.Collections;

public class ArraysClassMethods {
    public static void main(String[] args) {
        //sort()
        int[] x = {12, 3, 3, 334, 23, 241, 14124};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));

        String[] names = {"Peter", "Ivasik", "Sergey", "Anna"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        //Collections reverseOrder
        Integer[] xInteger = {12, 3, 3, 334, 23, 241, 14124};
        Arrays.sort(xInteger, Collections.reverseOrder());
        System.out.println(Arrays.toString(xInteger));

        //fill
        String[] strings = new String[10];
        Arrays.fill(strings, "x");
        System.out.println(Arrays.toString(strings));

        //equals
        int[] x1 = {12, 3, 3, 334, 23, 241, 14124};
        int[] x2 = {12, 3, 3, 334, 23, 241, 14124};
        System.out.println(x1.equals(x2));
        System.out.println(Arrays.equals(x1, x2));

        //deepToString
        int[][] numbers2 = {{1, 2}, {3, 4, 5}, {5, 6}};
        System.out.println(Arrays.deepToString(numbers2));

        //deepEquals
        int[][] numbers3 = {{1, 2}, {3, 4, 5}, {5, 6}};
        int[][] numbers4 = {{1, 2}, {3, 4, 5}, {5, 6}};
        System.out.println(Arrays.deepEquals(numbers3, numbers4));

        //copyOf
        String[] names2 = {"Peter", "Ivasik", "Sergey", "Anna"};
        String[] names3 = Arrays.copyOf(names2, names2.length + 1);
        System.out.println(Arrays.toString(names3));

        //System.arraycopy() - специальный метод для копирования массивов
        //первый параметр - это массив из которого нужно копировать данные,
        //второй параметр - индекс элемента массива с которого мы начинаем копирование
        //третий параметр - массив в который мы будем вставлять элементы
        //четвертый параметр -индекс элемента массива с которого мы начинаем вставлять скопированные данные
        //пятый параметр - количество копируемых элементов
        int[] arrayParent = {3, 34, 56, 57, 34343, 4, 3, 334};
        int[] arrayChild = new int[20];
        System.arraycopy(arrayParent, 2, arrayChild, 3, 3);
        System.out.println(Arrays.toString(arrayChild));



    }
}
