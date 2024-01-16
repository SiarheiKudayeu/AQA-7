package lesson5.while_cycle;

import java.util.Scanner;

public class Example {
        /*  Пример у вас соц сеть в которую можно загружать фотографии
        у пользователя с консоли спрашивают сколько фотографий
        он хотел бы загрузить в свой альбом
        но есть ограничение по размеру альбома в 100 фотографий*/
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int countOfPhoto = 0;
            while (countOfPhoto <= 100){
                if (countOfPhoto == 100){
                    break;
                }
                System.out.println("How many photo do you want to load:");
                int tempCountOfPhoto = scanner.nextInt();
                if(tempCountOfPhoto + countOfPhoto > 100){
                    System.out.println("The limit is reached");
                    System.out.println("You can load more " + (100 - countOfPhoto));
                    continue;
                }
                countOfPhoto = countOfPhoto + tempCountOfPhoto;
                System.out.println("You can load more " + (100 - countOfPhoto));
            }
            System.out.println("Final");
        }
}
