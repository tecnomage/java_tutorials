package module2;

// Define a class
/**
 * Represents a car with color, model, and year properties.
 */
public class Car {
    // Properties
    String color;
    String model;
    int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }
// 
    // Method
    public void startEngine() {
        System.out.println("The " + color + " " + model + " of " + year + " is starting its engine!");
    }

    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("Red", "Toyota", 2020);

        // Access properties
        System.out.println("My car's color: " + myCar.color);
        System.out.println("My car's model: " + myCar.model);
        System.out.println("My car's year: " + myCar.year);

        // Call method
        myCar.startEngine();
    }

}
