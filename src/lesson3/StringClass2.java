package lesson3;

public class StringClass2 {
    public static void main(String[] args) {
        //toLowerCase(), toUpperCase()
        String upperCaseText = "WIUHEWbjbiuqwbiuiuIU kjhjk";
        upperCaseText = upperCaseText.toLowerCase();
        System.out.println(upperCaseText);

        String lowerCaseText = "РолиалиЛОИЛИЛИЛ";
        lowerCaseText = lowerCaseText.toUpperCase();
        System.err.println(lowerCaseText);

        //equalsIgnoreCase()
        String lowerCase = "stop";
        String upperCAse = "STOP";
        System.out.println(lowerCase.equalsIgnoreCase(upperCAse));

        //trim
        String spasceString = "  ;lacs;asc;ajac  ";
        System.out.println(spasceString.trim());

        System.out.println("======================");
        //split
        String forSplitMethod = "One two three twotwofour";
        String[] stringSpace = forSplitMethod.split("two");
        int countOfStrings = stringSpace.length;
        System.out.println(countOfStrings);
        String fistElement = stringSpace[0];
        System.out.println(fistElement);
        String secondElement = stringSpace[1];
        System.out.println(secondElement);
        System.out.println(stringSpace[2]);
        System.out.println(stringSpace[3]);
    }
}
