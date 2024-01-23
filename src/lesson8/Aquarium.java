package lesson8;

public class Aquarium {
        /*3) Создать класс Aquarium, в нем три поля типа int (length, width, height),
а также поле Типа String c названием фирмы данного аквариума. Сделать все поля класса приватными.
Сделать геттеры и сеттеры для имени и длины. Создать метод выводящий в консоль информацию о данном аквариуме.*/

    public int length, weight, height;
    public String companyName;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void getInfo() {
        System.out.println("Ваша высота: " + getLength());
        System.out.println("Ваша ширина: " + getWeight());
        System.out.println("Ваша длина: " + getLength());
        System.out.println("Название фирмы: " + getCompanyName());
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getLength() {
        return length;
    }

    public String getCompanyName() {
        return companyName;
    }

    public static void main(String[] args) {
        Aquarium aquarium1 = new Aquarium();
        aquarium1.setLength(50);
        aquarium1.setCompanyName("Aquatic");
        aquarium1.setWeight(49);
        aquarium1.setHeight(33);
        aquarium1.getInfo();
    }
}
