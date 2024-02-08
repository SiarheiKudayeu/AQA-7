package lesson12.generics.ex3;

public class GenericHuman<T extends Humanable>{
    private T humanable;

    public GenericHuman(T humanable) {
        this.humanable = humanable;
    }

    public void sayInfoAboutThisInstance(){
        humanable.sayWhoAmI();
    }

    public T getHumanable() {
        return humanable;
    }

    @Override
    public String toString() {
        return "GenericHuman is " + humanable;
    }
}
