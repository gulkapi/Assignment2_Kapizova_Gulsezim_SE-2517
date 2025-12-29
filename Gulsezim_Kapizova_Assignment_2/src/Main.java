public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 2022, 4, "Petrol");
        Motorcycle bike = new Motorcycle("Kawasaki", 2021, false);
        Truck truck = new Truck("Volvo", 2020, 15.5, 4);

        Driver driver1 = new Driver("Robert", "DL12345");
        Driver driver2 = new Driver("Roxie", "DL67890");


        car.assignDriver(driver1);
        bike.assignDriver(driver1);
        truck.assignDriver(driver2);

        Vehicle[] vehicles = {car, bike, truck};

        System.out.println("=== Vehicle Management System ===");
        System.out.println("Demonstrating Inheritance and Polymorphism\n");


        for (Vehicle vehicle : vehicles) {
            System.out.println("\n--- Processing Vehicle ---");
            vehicle.startEngine();
            vehicle.displayInfo();
            vehicle.stopEngine();


            if (vehicle instanceof Car) {
                Driver driver = ((Car) vehicle).getDriver();
                if (driver != null) {
                    System.out.print("Assigned Driver: ");
                    driver.displayDriverInfo();
                }
            } else if (vehicle instanceof Motorcycle) {
                Driver driver = ((Motorcycle) vehicle).getDriver();
                if (driver != null) {
                    System.out.print("Assigned Driver: ");
                    driver.displayDriverInfo();
                }
            } else if (vehicle instanceof Truck) {
                Driver driver = ((Truck) vehicle).getDriver();
                if (driver != null) {
                    System.out.print("Assigned Driver: ");
                    driver.displayDriverInfo();
                }
            }
        }

        System.out.println("\n=== Program Complete ===");
    }
}
