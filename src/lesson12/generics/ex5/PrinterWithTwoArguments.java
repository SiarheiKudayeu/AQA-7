package lesson12.generics.ex5;

public class PrinterWithTwoArguments <S, M>{
    private S firstType;
    private M secondType;

    public PrinterWithTwoArguments(S firstType, M secondType) {
        this.firstType = firstType;
        this.secondType = secondType;
    }

    public S getFirstType() {
        return firstType;
    }

    public M getSecondType() {
        return secondType;
    }
}
