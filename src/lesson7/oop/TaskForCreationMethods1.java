package lesson7.oop;

import java.util.Date;

public class TaskForCreationMethods1 {
      /*             1) Написать метод, принимающий в качестве параметров два числа,
    который будет выводить на консоль сумму этих двух чисел.
    принимает - не возвращает

                   2) Написать второй метод, который будет возвращать сумму двух чисел,
   которые он будет принимать в параметре метода.
   Вывести на консоль сумму двух любых чисел при помощи первого и второго метода.
   принимает - возвращает
   */

    public void inNotgive(int numberIn1, int numberIn2) {
        System.out.println(numberIn1 + numberIn2);
    }

    public int numberBack(int numberIn1, int numberIn2) {
        return (numberIn1 + numberIn2);
    }

    public void arraySort(int[] arrayForSorting) {
        for (int i = 0; i < arrayForSorting.length; i++) {
            int min;
            for (int a = i + 1; a < arrayForSorting.length; a++) {
                if (arrayForSorting[i] > arrayForSorting[a]) {
                    min = arrayForSorting[a];
                    arrayForSorting[a] = arrayForSorting[i];
                    arrayForSorting[i] = min;
                }
            }
        }
    }

    public void printArrayToConsole(int[] arrayForPrinting) {
        System.out.print("[");
        for (int i = 0; i < arrayForPrinting.length; i++) {
            System.out.print(arrayForPrinting[i] + ", ");
        }
        System.out.print("\b\b]");
    }

        /*3) Написать метод, который будеть выводить в консоль какое точное время и дата сейчас
                на вашем устройстве. В формате такого типа: 12 June 2022 year, 14:55
              */
    public void dateProvider(){
        Date date = new Date();
        System.out.printf("%1$td %1$tB %1$tY year, %1$tH:%1$tM", date);
    }
}
