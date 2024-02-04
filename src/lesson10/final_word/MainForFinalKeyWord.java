package lesson10.final_word;

public class MainForFinalKeyWord {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        parentClass.text = "New text";
        System.out.println(parentClass.text);
        System.out.println(ParentClass.CONSTANT);

        ChildClass childClass = new ChildClass();
        childClass.forOver();
    }
}
