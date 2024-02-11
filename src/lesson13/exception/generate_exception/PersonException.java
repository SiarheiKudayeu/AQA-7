package lesson13.exception.generate_exception;

import java.util.Scanner;

public class PersonException {
    public static void main(String[] args)  {
        PersonException person = new PersonException();
        try {
            person.setName(askName());
        }catch (SiarheiNameException e){
            System.out.println(e.getMessage());
        }
        System.out.println("check");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String askName() throws SiarheiNameException{
        System.out.println("Input name for person:");
        String name = new Scanner(System.in).nextLine();
        if (name.equals("Siarhei")){
            throw new SiarheiNameException();
        }else {
            return name;
        }
    }
}
