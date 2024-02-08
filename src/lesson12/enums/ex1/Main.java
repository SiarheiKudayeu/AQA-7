package lesson12.enums.ex1;

public class Main {
    public static void main(String[] args) {
        startPlatform(Platforms.WRONG_PLATFORM);
        System.out.println("=================");
        startPlatform2(Platforms.WRONG_PLATFORM);
    }

    public static void startPlatform(Platforms platforms) {
        if (platforms.equals(Platforms.ANDROID)) {
            System.out.println("We started Android OS!");
        } else if (platforms.equals(Platforms.IOS)) {
            System.out.println("We started iOS OS!");
        } else if (platforms.equals(Platforms.WINDOWS)) {
            System.out.println("We started WINDOWS OS!");
        } else {
            System.out.println("Your platform is " + Platforms.WRONG_PLATFORM);
        }
    }

    public static void startPlatform2(Platforms platforms) {
        switch (platforms){
            case ANDROID -> System.out.println("We started Android OS!");
            case IOS -> System.out.println("We started iOS OS!");
            case WINDOWS -> System.out.println("We started WINDOWS OS!");
            default -> System.out.println("Your platform is " + Platforms.WRONG_PLATFORM);
        }
    }
}
