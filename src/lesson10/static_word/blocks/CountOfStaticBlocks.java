package lesson10.static_word.blocks;

public class CountOfStaticBlocks {
    static int counter;

    static {
        counter = 1;
        //System.out.println("This is block number " + counter);
        counter++;
    }

    static {
        //System.out.println("This is block number " + counter);
        counter++;
    }

    static {
        //System.out.println("This is block number " + counter);
        counter++;
    }

    static {
        //System.out.println("This is block number " + counter);
        counter++;
    }

    static {
        //System.out.println("This is block number " + counter);
        counter++;
    }

    static {
        //System.out.println("This is block number " + counter);
        counter++;
    }

    static {
        //System.out.println("This is block number " + counter);
        counter++;
    }

    static {
        System.out.println("Count of static blocks is " + counter);
        counter++;
    }


}
