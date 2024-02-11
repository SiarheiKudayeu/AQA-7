package lesson13.collection.comporator;

public class Consoles  {

    private int cost;
    private Name name;

    public int getCost() {
        return cost;
    }

    public Name getName() {
        return name;
    }

    public Consoles(int cost, Name name) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Consoles{" +
                "cost=" + cost +
                ", name=" + name +
                '}';
    }

    public enum Name {
        PLAYSTATION("Playstation"), NINTENDO("Nintendo"), XBOX("Xbox");
        private String name;

        public String getName() {
            return name;
        }

        Name(String name) {
            this.name = name;
        }
    }
}
