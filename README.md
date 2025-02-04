# OOP-ASSIGNMENT
Project Overview
This project shows the use of Concrete Classes, Abstract Classes, and Interfaces in Java programming. It includes a Car class, an abstract Motorvehicle class, and a Vehicle interface. This is to show the differences and uses of each type of class.

**Explaining classes**
Concrete Class
A Concrete Class is a class that you can create objects from. In this project, the Car class is a Concrete Class. It implements the start method from the Vehicle interface and provides its own implementation of the displayInfo method, which is defined as an abstract method in the Motorvehicle class
The Car class is a concrete class because it has all the necessary method implementations.It implements the start method from the Vehicle interface and the displayInfo method from the Motorvehicle class. The constructor sets the brand and color of the car.

Abstract Class 
An Abstract Class is a class that cannot be instantiated directly. It may contain abstract methods that must be implemented by its subclasses. The Motorvehicle class is an Abstract Class in this project. It implements the stop method from the Vehicle interface and defines an abstract method displayInfo that must be implemented by its subclasses, such as Car.
The Motorvehicle class is abstract and cannot be instantiated.It implements the stop method from the Vehicle interface.  The abstract displayInfo method is left for subclasses eg Car to implement.

Interface 
An Interface something that specifies a set of methods that a class must implement. In this project, the Vehicle interface defines two methods: start and stop. Any class that implements this interface eg Car must provide implementations for these methods.
The Vehicle interface defines the methods start and stop.  These methods must be implemented by any class that implements the interface eg Car.

**Project Files**  
Car.java: Concrete Class that represents a car.  
Motorvehicle.java: Abstract Class representing a vehicle.  
Vehicle.java: Interface defining the basic vehicle actions.  
Main.java: The main class that demonstrates the functionality.

**Conclusion**  
This project demonstrates how Java allows for the use of Concrete Classes, Abstract Classes, and Interfaces to create a well-structured and good object-oriented program. Each class serves a different purpose and contributes to the design in its own way.
