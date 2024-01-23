package lesson8.constructor;

import java.util.Scanner;

public class MainForConstructor {
    public static void main(String[] args) {
        System.out.println("Insert your address:");
        Home myHome = new Home("new Scanner(System.in).nextLine()", 30, 3, false);
        myHome.getInfo();
        System.out.println("===================");
        myHome.setAddress("Central square");
        myHome.getInfo();

        Home home2 = new Home("Best Street", 40, true, 3);
/*      myHome.setAddress("Center street");
        myHome.setCapacity(30);
        myHome.setNew(false);
        myHome.setCountOfFloors(3);
        myHome.getInfo();*/
        Home homeWithAddressAndBoolean = new Home("Not Best Street", true);
        System.out.println("============");
        homeWithAddressAndBoolean.getInfo();
        homeWithAddressAndBoolean.getPublicInfoFromPrivateMethod();
    }
}
