package lesson12.enums.ex3;

import java.util.Random;

public class CardGenerator {

    //Написать программу генератор случайной карты, которая будет иметь
    // статический метод  printRandomCard() вывода в консоль случайно сгенерированной карты.
    //Создать два отдельных  Enum CardsTypes, CardValues.
    //CardsTypes может быть четырех видов ♦, ♠, ♣, ♥.
    // CardValues : SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    //Создать класс Card, который в параметры конструктора будет принимать аргументы типа CardsTypes, CardValues

    public enum CardTypes{
        HEART("♥"), DIAMOND("♦"), CLUB("♣"), SPADE("♠");
        public String type;

        CardTypes(String type) {
            this.type = type;
        }
    }

    private static CardTypes  getRandomCartType(){
        CardTypes[] cardTypes = CardTypes.values();
        return cardTypes[new Random().nextInt(cardTypes.length)];
    }

    public enum CardValues{
        SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"), JACK("JACK"), QUEEN("QUEEN"), KING("KING"), ACE("ACE");
        public String values;

        CardValues(String values) {
            this.values = values;
        }
    }
    private static CardValues getRandomCartValue(){
        CardValues[] cardValues = CardValues.values();
        return cardValues[new Random().nextInt(cardValues.length)];
    }

     public static class Card{
        public CardTypes cardType;
        public CardValues cardValues;

         public Card(CardTypes cardType, CardValues cardValues) {
             this.cardType = cardType;
             this.cardValues = cardValues;
         }

         @Override
         public String toString(){
             return cardType.type + cardValues.values;
         }
     }

     private static Card getRandomCart(){
        return new Card(getRandomCartType(), getRandomCartValue());
     }

     public static void printRandomCart(){
         System.out.println(getRandomCart());
     }


}
