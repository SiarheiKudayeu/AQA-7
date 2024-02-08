package lesson12.generics.ex2;

import lesson9.task.Bear;

public class PrinterDemo {
    public static void main(String[] args) {
        PrinterWithTwoArguments<String, Integer> printer = new PrinterWithTwoArguments<>("Text", 123);
        printer.printBoth();
        System.out.println("==============");
        PrinterWithTwoArguments<String, Bear> printer2 = new PrinterWithTwoArguments<>("Text", new Bear("Miha",true));
        printer2.printBoth();

    }
}
