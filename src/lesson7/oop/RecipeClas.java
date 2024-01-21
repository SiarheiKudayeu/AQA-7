package lesson7.oop;

public class RecipeClas {
    public static void main(String[] args) {
        Recipe saltedWater = new Recipe();
        saltedWater.nameOfDish = "Солена вода: ";
        saltedWater.timeToCook = 56;
        saltedWater.ingredients = new String[]{"water", "salt", "BonAppetit"};
        saltedWater.getInfo();
    }
}
