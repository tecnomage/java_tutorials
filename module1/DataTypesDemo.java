package module1;

public class DataTypesDemo {
    public static void main(String[] args) {
        // Primitive Data Types:

        // Numeric Types:
        byte age = 30;      // Small whole number
        short year = 2024;  // Larger whole number
        int population = 780000000;  // General-purpose integer
        long nationalDebt = 30000000000000L;  // Very large whole number
        float pi = 3.14159f;  // Single-precision decimal
        double gravity = 9.81;  // Double-precision decimal

        // Boolean:
        boolean isSunny = true;  // Logical value

        // Character:
        char initial = 'B';  // Single character

        // Non-Primitive Data Types:

        String name = "Bard";  // Text string
        int[] scores = {85, 92, 70};  // Array of integers

        // Class (user-defined):
        Person person = new Person("Alice", 25);  // Example of a custom class

        // Interface (not shown in code, as it's abstract)
        System.out.println("asdasdasdte ");
    }

    // Example of a user-defined class:
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}

// Key Points :
// Java has two categories of data types: primitive and non-primitive.
// Primitive data types are the most basic data types in Java.
// Primitive data types include numeric types, boolean, and character.
// Numeric types include byte, short, int, long, float, and double.
// Non-primitive data types include String, arrays, classes, and interfaces.
// You can declare variables of different data types in Java.
// You can create your own custom classes and interfaces.
// Experiment with different data types to understand their behavior.
