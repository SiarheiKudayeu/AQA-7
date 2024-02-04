package lesson10.final_word;

public class ParentClass {
    public String text = "Text";
    public static final String CONSTANT = "CONSTANT";

    public final void doSmth(){
        System.out.println("I am final method");
    }
    public void forOver(){
        System.out.println(" I am from Parent");
    }

}
