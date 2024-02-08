package lesson12.generics.ex3;

public class Elf extends Humanable{
    public Elf(String name) {
        super(name);
        this.type = Type.ELF;
    }
    public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    protected void sayWhoAmI() {
        System.out.println("My name is " + name + ", I am " + type);
    }
}
