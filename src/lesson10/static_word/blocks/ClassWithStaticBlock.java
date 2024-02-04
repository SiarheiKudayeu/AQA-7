package lesson10.static_word.blocks;

import javax.xml.crypto.Data;
import java.util.Date;

public class ClassWithStaticBlock {

    static Date data;
    static double usd;
    static double euro;
public void printValues(){
    System.out.println("Euro = " + euro);
    System.out.println("Usd = " + usd);
}

    static void methodToStart() {
        System.out.println("I am start method");
    }

    static double getUsdFromBank() {
        return 30;
    }

    static double getEuroFromBank() {
        return 35;
    }

    static {
        System.out.println("I am static block");
        usd = getUsdFromBank();
        euro = getEuroFromBank();
        data = new Date();
    }

    public void printDate(){
        System.out.printf("Вывести дату в формате: %1$ta %1$td %1$tB", data);
    }

}
