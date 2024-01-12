package module1;
import java.util.Scanner;

public class SimpleJavaProgram {
    public static void main(String[] args) {
        // Create a Scanner object for console input
        Scanner scanner = new Scanner(System.in);

        // Output a prompt to the console
        System.out.println("Please enter your name:");

        // Read input from the console
        String name = scanner.nextLine();

        // Output the input back to the console
        System.out.println("Hello, " + name + "!");

        // Close the scanner
        scanner.close();
    }
}