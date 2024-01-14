package lesson4.formatter;

import java.util.Date;

public class DateFormatter {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        //%t %T
        //H - часы, M - минуты, S - секунды, L - миллисекунды , N - наносекунды.
        //p - добавляет информацию о pm и am
        System.out.printf("Вывести дату в формате: %tH", date);
        System.out.printf("\nВывести дату в формате: %tM", date);
        System.out.printf("\nВывести дату в формате: %tS", date);
        System.out.printf("\nВывести дату в формате: %1$tH:%1$tM:%1$tS", date);

        //A - день недели, d - две цифры даты , B - месяц, m - месяц в виде цифры,
        // Y - год, y - две фин цифры года
        System.out.printf("\nВывести дату в формате: %tB", date);
        System.out.printf("\nВывести дату в формате: %tm", date);
        System.out.printf("\nВывести дату в формате: %1$ta %1$td %1$tB", date);

        String todayDateString = String.format("%td", date);
        int todaysDate = Integer.parseInt(todayDateString);
        int tomorrowDate = todaysDate + 1;
        System.out.println();
        System.out.println(tomorrowDate);
        System.out.println(Integer.parseInt(String.format("%td", date))+1);
    }
}
