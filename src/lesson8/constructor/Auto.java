package lesson8.constructor;

public class Auto {
       /*4)Создать класс Auto. В данном классе создать поле String name, int price, boolean isNew
создать геттеры и сеттеры для данных полей, а также конструктор класса,
принимающий в параметры все поля данного класса.
*/
       private String name;

    public Auto(String name, int price, boolean isNew) {
        this.name = name;
        this.price = price;
        this.isNew = isNew;
    }

    private int price;
    private boolean isNew;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    public void getInfo(){
        System.out.println(getName() + " " + getPrice() + " " + isNew());
    }

    public static void main(String[] args) {
        Auto bmw = new Auto("X1", 15000, true);
        bmw.getInfo();
    }
}
