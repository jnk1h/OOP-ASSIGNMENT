public class Car extends Motorvehicle {
    String colour;

    // Constructor for setting the brand and colour
    public Car(String brand, String colour) {
        super(brand);
        this.colour = colour;
    }

    // Implementing abstract method from Transport
    public void displayInfo() {
        System.out.println("This is a " + colour + " " + brand);
    }

    // Implementing start method from Vehicle
    public void start() {
        System.out.println(brand + " is starting.");
    }
}
