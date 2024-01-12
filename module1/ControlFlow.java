package module1;

public class ControlFlow {
    // **If/Else Statements**

    public static void main(String[] args) {
        int age = 20;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not old enough to vote.");
        }

        // **Loops**

        // For loop: Repeat a block of code a specific number of times
        for (int i = 1; i <= 5; i++) {
            System.out.println("Counting: " + i);
        }

        // While loop: Repeat a block of code as long as a condition is true
        int counter = 0;
        while (counter < 3) {
            System.out.println("Looping...");
            counter++; // Increment counter to eventually exit the loop
        }

        // Do-while loop: Execute the code block at least once, then repeat as long as
        // the condition is true
        int choice = 0;
        do {
            System.out.println("Enter a number (1-5): "); // Prompt the user
            // ... (code to read user input and store in choice)
        } while (choice < 1 || choice > 5); // Repeat if invalid input

        // Nested Control Flow: Combining structures
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}

// Key Points :
// Control flow statements allow you to control the execution of your code.
// If/else statements allow you to execute code based on a condition.
// Loops allow you to repeat a block of code a specific number of times or until
// a condition is met.
// The for loop is used to repeat a block of code a specific number of times.
// The while loop is used to repeat a block of code as long as a condition is
// true.
// The do-while loop is used to execute a block of code at least once, then
// repeat as long as a condition is true.
// You can combine control flow statements to create more complex logic.
// Experiment with different control flow statements to understand their
// behavior.