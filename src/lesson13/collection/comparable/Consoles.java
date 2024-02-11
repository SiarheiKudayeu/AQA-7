package lesson13.collection.comparable;

public class Consoles implements Comparable<Consoles> {
    public static void main(String[] args) {
        Consoles console1 = new Consoles(1000, Name.PLAYSTATION);
        Consoles console2 = new Consoles(1500, Name.NINTENDO);
        System.out.println(console2.compareTo(console1));
    }

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

    /*   @Override
       public int compareTo(Consoles o) {
           if (this.cost > o.cost) {
               return 1;
           } else if (this.cost < o.cost) {
               return -1;
           } else {
               return 0;
           }
       }*/
/*    @Override
    public int compareTo(Consoles o) {
      return this.cost - o.cost;
    }*/

    /*    @Override
        public int compareTo(Consoles o) {
            return this.name.getName().compareTo(o.name.getName());
        }*/
    @Override
    public int compareTo(Consoles o) {
        return o.name.getName().compareTo(this.name.getName());
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
