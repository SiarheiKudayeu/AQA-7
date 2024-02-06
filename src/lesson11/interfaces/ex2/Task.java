package lesson11.interfaces.ex2;

import java.util.ArrayList;

public class Task {
      /*Создать интерфейс Sportable в котором назаначить только один метод doSport().
    Создать класс CrossFitMan реализующий Sportable в котором переопределить метод doSport() в котором будет выводиться
    cообщение типа :"Я люблю кроссфит. Мое имя {name}.".
    Создать класс BodybuildingMan реализующий Sportable в котором переопределить метод doSport() в котором будет выводиться
    cообщение типа :"Я люблю качалку. Мое имя {name}." .
    Создать класс CalisthenicsMan реализующий Sportable в котором переопределить метод doSport() в котором будет выводиться
    cообщение типа :"Я люблю турник. Мое имя {name}.".
    Создать массив типа Sportable. Разместить в него спорстменов разного вида. Пройтись циклом по всему массиву и
    вызвать у каждого спортсмена метод doSport().

    P.s. В классах поля сделать приватными. Не забыть про конструкторы, геттеры и сеттеры. А также методы toString,
    hashCode() и equals().*/
      public static void main(String[] args) {
          Sportable sportsman1 = new BodybuildingMan("Alex");
          Sportable sportsman2 = new CalisthenicsMan("Max");
          Sportable sportsman3 = new CrossFitMan("Ben");

          Sportable[] arrayOfSportable = {sportsman1, sportsman2, sportsman3};
          for(Sportable man: arrayOfSportable){
                man.doSport();
          }

          ArrayList<Sportable> sportables = new ArrayList<>();
          sportables.add(sportsman1);
          sportables.add(sportsman2);
          sportables.add(sportsman3);

          System.out.println("=================");
          for(Sportable man: sportables){
              man.doSport();
          }

      }
}
