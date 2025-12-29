public class Truck extends Vehicle {
    private double capacity;
    private int numAxles;
    private Driver driver;

    public Truck(String brand, int year, double capacity, int numAxles) {
        super(brand, year);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine starting... BRRRRMMM!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopping...");
    }

    public void assignDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck, Capacity: " + capacity + " tons, Axles: " + numAxles);
    }
}