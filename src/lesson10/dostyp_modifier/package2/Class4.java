package lesson10.dostyp_modifier.package2;

import lesson10.dostyp_modifier.package1.Class1;

public class Class4 extends Class1{
    //protected String protectedString = "X";

    public void printFields(){
        System.out.println(protectedString);
        System.out.println(publicString);
    }
    public void printFromClass1(){
        Class1 class1 = new Class1();
        /*System.out.println(class1.defaultString);
        System.out.println(class1.protectedString);*/
        System.out.println(class1.publicString);
        //System.out.println(class1.privateString);

        Class4 class4 = new Class4();
        //System.out.println(class4.defaultString);
        System.out.println(class4.protectedString);
        System.out.println(class4.publicString);
        //System.out.println(class4.privateString);

    }
}
