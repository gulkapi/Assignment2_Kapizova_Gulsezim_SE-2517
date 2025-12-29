public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private Driver driver;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine starting... Vroom vroom!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopping...");
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
        System.out.println("Type: Motorcycle, Has Sidecar: " + hasSidecar);
    }
}