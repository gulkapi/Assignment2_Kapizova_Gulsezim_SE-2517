public class Car extends Vehicle {
    private int doors;
    private String fuelType;
    private Driver driver;

    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine starting... Vroom!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopping...");
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
        System.out.println("Type: Car, Doors: " + doors + ", Fuel: " + fuelType);
    }
}
