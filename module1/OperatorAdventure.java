package module1;

public class OperatorAdventure {
    public static void main(String[] args) {
        // Declare variables
        int age = 25;
        int score = 80;
        boolean isWinner = true;

        // Arithmetic operators
        int totalScore = score + 10;  // Addition
        int remainingLives = 3 - 1;   // Subtraction
        int area = 5 * 7;            // Multiplication
        double average = 100.0 / 5;  // Division

        // Comparison operators
        boolean isPerfectScore = score == 100;  // Equality check
        boolean isGameOver = remainingLives <= 0;  // Less than or equal to

        // Logical operators
        boolean isQualified = isWinner && score >= 75;  // AND operator
        boolean canRetry = !isGameOver;  // NOT operator (negation)

        // Assignment operators
        age = age + 5;  // Add 5 to age
        score *= 2;  // Double the score
        isWinner = false;  // Change isWinner to false

        // Print results to see the values
        System.out.println("Total score: " + totalScore);
        System.out.println("Is qualified: " + isQualified);
        System.out.println("Can retry: " + canRetry);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
        System.out.println("Is winner: " + isWinner);
        System.out.println("Is perfect score: " + isPerfectScore);
        System.out.println("Is game over: " + isGameOver);
        System.out.println("Remaining lives: " + remainingLives);
        System.out.println("Area: " + area);
        System.out.println("Average: " + average);
        
        // Add more print statements to explore other values
    }
}
