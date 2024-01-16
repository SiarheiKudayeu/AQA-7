package lesson4;

public class Task1 {
    /*  Имеется переменная text:
        "Повседневная практика показывает, что разбавленное изрядной долей эмпатии, рациональное мышление выявляет срочную потребность глубокомысленных рассуждений. Раздел 16."
        Необходимо вывести в консоль следующие значения:
        a) Общую длину всего предложения.
        б) Количество слов в данном предложении
        в) 3 и 7 слово в данном предложении. (без запятых).
        г) Вывести в консоль сообщение:
        "5 слово имеет значение {ЗНАЧЕНИЕ_5_СЛОВА}, 10 слово имеет значение {ЗНАЧЕНИЕ_10_СЛОВА}.
        Пятое слово длиннее десятого и это {true либо false}"
        д)Значение последнего слова из предложения умноженное на два.*/
    public static void main(String[] args) {
        String a="Повседневная практика показывает, что разбавленное изрядной долей эмпатии, рациональное мышление выявляет " +
                "срочную потребность глубокомысленных word рассуждений. Раздел 16.";

        System.out.println(a.length());
        System.out.println(a.split("\\s").length);
        System.out.println(a.split(" ")[2].replace(",","")+" "+a.split(" ")[6]);
        System.out.println("5 слово имеет значение "+a.split(" ")[4]+", 10 слово имеет значение "+a.split(" ")[9]+".\n" +
                "        Пятое слово длиннее десятого и это "+(a.split(" ")[4].length()>a.split(" ")[9].length())+".");
        System.out.println(a.split(" ")[a.split("\\s").length-1].replace(".",""));
        System.out.println(Integer.parseInt(a.split(" ")[a.split("\\s").length-1].replace(".",""))*2);
        String lastword = a.split(" ")[a.split("\\s").length-1];
        lastword = lastword.replace(".","");
        int intLastWord = Integer.parseInt(lastword);
        System.out.println(intLastWord*2);

    }
}