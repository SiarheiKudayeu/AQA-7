package lesson12.enums.ex2;

public class PersonConcert {
    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public PersonConcert(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void whichConcertICanGo() {
        if (money < Groups.METALLICA.getCostOfTicket()) {
            System.out.println("Stay at home!!!");
        } else if (money < Groups.ACDC.getCostOfTicket() && money > Groups.METALLICA.getCostOfTicket()) {
            System.out.println(name + " you can go to " + Groups.METALLICA.getName() + " concert!");
        } else if (money < Groups.QUEEN.getCostOfTicket() && money > Groups.ACDC.getCostOfTicket()) {
            System.out.println(name + " you can go to " + Groups.ACDC.getName() + " concert!");
        } else {
            System.out.println("Go whenever you want!!!");
        }
    }
}
