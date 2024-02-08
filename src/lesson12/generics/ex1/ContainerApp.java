package lesson12.generics.ex1;

public class ContainerApp {
    public static void main(String[] args) {
        Container container1 = new Container("Text");
        Container container2 = new Container("Text2");
        //container1.setObject(33);
        //String resultString = container2.getObject() + container1.getObject();
        String result = "";
        if(container2.getObject() instanceof String && container1.getObject() instanceof String){
            result = (String) container1.getObject() + (String)container2.getObject();
            System.out.println(result);
        }else {
            System.out.println("Different types");
        }

        GenericContainer<Integer> genericContainer1 = new GenericContainer<>(20);
        GenericContainer<Integer> genericContainer2 = new GenericContainer<>(25);
        GenericContainer<String> genericContainer3 = new GenericContainer<>("Text");
        GenericContainer<String> genericContainer4 = new GenericContainer<>("Text2");

        int resultIn = genericContainer1.getObject() + genericContainer2.getObject();
        String resultString2 = genericContainer3.getObject() + genericContainer4.getObject();

        //genericContainer1.setObject("Java");


    }


}
