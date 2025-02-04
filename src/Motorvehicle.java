public abstract class Motorvehicle implements Vehicle {
    String brand;

    // Constructor for setting the brand of the vehicle
    public Motorvehicle(String brand) {
        this.brand = brand;
    }

    // Implementing the stop method from interface
    public void stop() {
        System.out.println(brand + " is stopping.");
    }
}
