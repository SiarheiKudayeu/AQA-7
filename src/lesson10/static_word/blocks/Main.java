package lesson10.static_word.blocks;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        ClassWithStaticBlock.methodToStart();
        ClassWithStaticBlock classWithStaticBlock = new ClassWithStaticBlock();
        ClassWithStaticBlock classWithStaticBlock2 = new ClassWithStaticBlock();
        ClassWithStaticBlock.methodToStart();
        classWithStaticBlock.printValues();
        classWithStaticBlock.printDate();

        //CountOfStaticBlocks
        System.out.println("\nCountOfStaticBlocks");
        CountOfStaticBlocks countOfStaticBlocks = new CountOfStaticBlocks();


    }
}
