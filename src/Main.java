public class Main {
    public static void main(String[] args) {
        // Creating a Car object with a brand and color
        String colour = "black";  // By doing this I am giving a colour to the car
        Car myCar = new Car("Tesla", colour);  // By doing this I am passing brand and color to the constructor

        myCar.displayInfo();  // This will call the method from Car class
        myCar.start();        // This will call the method from Car class
        myCar.stop();         // This will call the method from Motorvehicle class
    }
}

