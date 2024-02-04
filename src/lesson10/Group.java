package lesson10;

public class Group {
    public static void main(String[] args) {
        Group aqa7 = new Group("AQA7", "Siarhei", 11);
        System.out.println(aqa7);
    }
    public String name;
    public String nameOfLector;

    public Group(String name, String nameOfLector, int capacity) {
        this.name = name;
        this.nameOfLector = nameOfLector;
        this.capacity = capacity;
    }

    public int capacity;

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", nameOfLector='" + nameOfLector + '\'' +
                ", capacity=" + capacity;
    }
}
