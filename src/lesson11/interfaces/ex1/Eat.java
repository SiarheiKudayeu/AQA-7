package lesson11.interfaces.ex1;

import java.util.Date;

public interface Eat {

    void eat();
    void earnForEat();

    default void whatDateISToday(){
        System.out.println(new Date());
    }
}
