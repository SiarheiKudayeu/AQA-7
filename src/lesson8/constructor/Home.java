package lesson8.constructor;

public class Home {
    public String address;
    public int capacity;
    public int countOfFloors;
    public boolean isNew;

    public void getInfo() {
        System.out.println(getAddress());
        System.out.println(getCapacity());
        System.out.println(getCountOfFloors());
        System.out.println(isNew());
    }

    private void getPrivateInfo(){
        System.out.println(address);
        System.out.println(capacity);
        System.out.println(countOfFloors);
        System.out.println(isNew);
    }

    public void getPublicInfoFromPrivateMethod(){
        getPrivateInfo();
    }

    public Home(String address, int capacity, int countOfFloors, boolean isNew) {
        this.address = address;
        this.capacity = capacity;
        this.countOfFloors = countOfFloors;
        this.isNew = isNew;
    }

    public Home(String address, int capacity, boolean isNew, int countOfFloors) {
        this(capacity, isNew);
        this.address = address;
        this.countOfFloors = countOfFloors;
    }

    public Home(String address, boolean isNew) {
        this.address = address;
        this.capacity = 20;
        this.countOfFloors = 2;
        this.isNew = isNew;
    }

    public Home() {
    }

    public Home(int capacity, boolean isNew) {
        this.capacity = capacity;
        this.isNew = isNew;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCountOfFloors() {
        return countOfFloors;
    }

    public void setCountOfFloors(int countOfFloors) {
        this.countOfFloors = countOfFloors;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
