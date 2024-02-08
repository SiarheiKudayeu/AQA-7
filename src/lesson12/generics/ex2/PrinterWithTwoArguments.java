package lesson12.generics.ex2;

public class PrinterWithTwoArguments <S, M>{
    private S firstType;
    private M secondType;

/*    public void division(){
        System.out.println(firstType/secondType);
    }*/

    public PrinterWithTwoArguments(S firstType, M secondType) {
        this.firstType = firstType;
        this.secondType = secondType;
    }

    private void printInfoFirstField(){
        System.out.println("Type of this instance is " + firstType.getClass().getName());
        System.out.println(firstType);
    }

    private void printInfoSecondField(){
        System.out.println("Type of this instance is " + secondType.getClass().getName());
        System.out.println(secondType);
    }

    public void printBoth(){
        printInfoFirstField();
        printInfoSecondField();
    }


}
