package lesson12.generics.ex5;

import lesson9.task.Bear;

public class PrinterDemo {

    public static void division(PrinterWithTwoArguments<? extends Number, ? extends Number> printer) {
        System.out.println(printer.getFirstType().doubleValue() / printer.getSecondType().doubleValue());
    }

    public static void main(String[] args) {
        division(new PrinterWithTwoArguments<>(5f, 10f));
    }
}
