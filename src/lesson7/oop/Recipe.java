package lesson7.oop;

import java.util.Arrays;

public class Recipe {
   /* 5)Создать класс Recipe (рецепт). В нем создать следующие поля:
    a) Поле nameOfDish типа String
    б) Поле ingredients типа String[]
    в) Поле timeToCook типа double

    В этом классе создайте метод getInfo(), который будет выводить всю информацию о данном рецепте.
    Создать объект класса Recipe. Задать все поля для данного объекта. Вызвать у объекта
    метод getInfo().*/

    /* Поле ingredients типа String[]
 в) Поле timeToCook типа double

 В этом классе создайте метод getInfo(), который будет выводить всю информацию о данном рецепте.
 Создать объект класса Recipe. Задать все поля для данного объекта. Вызвать у объекта
 метод getInfo().*/
    public String nameOfDish;
    public String[] ingredients;
    public double timeToCook;

    public void getInfo() {
        System.out.println(nameOfDish + Arrays.toString(ingredients) + timeToCook);
    }

}
