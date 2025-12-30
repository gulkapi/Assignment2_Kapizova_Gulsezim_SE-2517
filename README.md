 Assignment 2: Object-Oriented Student Management System (Kapizova Gulsezim SE_2517)
Project: Vehicle Management System
I will write everything point by point.

A. Project Overview
This Vehicle Management System demonstrates core Object-Oriented Programming principles 
including inheritance, composition, aggregation, and abstraction. 
The system models different types of vehicles (Car, Motorcycle, Truck) that share common 
characteristics through inheritance from an abstract Vehicle class.

B. Class Hierarchy
 Superclass: Vehicle (Abstract):
1. Fields: brand (String), year (int) - both protected
2. Abstract Methods: startEngine(), stopEngine()
3. Concrete Method: displayInfo()
4. Access Modifiers: Protected fields allow subclass access while maintaining encapsulation

 Subclasses:
1. "Car"
   - Additional fields: doors (int), fuelType (String)
   - Overrides: startEngine(), stopEngine()

2. "Motorcycle"
   - Additional field: hasSidecar (boolean)
   - Overrides: startEngine(), stopEngine()

3. "Truck"
   - Additional fields: capacity(double), numAxles(int)
   - Overrides: startEngine(), stopEngine()

 Driver Class
1.Demonstrates composition (Vehicle HAS-A Driver)
2.Demonstrates aggregation (Driver MAY-HAVE multiple Vehicles)

C. Instructions to Compile and Run
1. Compile all Java files
javac src/*.java
2. Run the main program
cd src
java Main

E. Reflection Section
1. Inheritance allowed me to create a common base class (Vehicle) that encapsulates shared 
properties and behaviors. This eliminated code duplication and made the system more 
maintainable. 
2. Each vehicle subclass overrides the startEngine() and stopEngine()
methods to provide vehicle-specific implementations.
3. I used protected for the vehicle fields so subclasses could access them directly, 
but this felt a bit too open. I added getters to be safer. Using default (no modifier) 
access was tricky because I had to keep all my classes in the same package. 

