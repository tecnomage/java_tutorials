package module1;

public class Functions {
    // Function to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Function to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Function to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Function to divide two numbers
    public static double divide(double a, double b) {
        return a / b;
    }

    // Main method
    public static void main(String[] args) {
        // Function calls
        int sum = add(5, 3);
        int difference = subtract(10, 7);
        int product = multiply(4, 6);
        double quotient = divide(15.0, 3.0);

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}

// Key Points :
// Functions are blocks of code that perform a specific task.
// Functions can be reused throughout your code.
// Functions can take in parameters and return a value.
// Functions can be declared in a class or interface.
// Functions can be called from other functions.
// Experiment with different functions to understand their behavior.



