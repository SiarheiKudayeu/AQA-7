package lesson12.generics.ex3;

public abstract class Humanable {
    protected String name;
    protected Type type;

    public Humanable(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }
    protected abstract void sayWhoAmI();
}
