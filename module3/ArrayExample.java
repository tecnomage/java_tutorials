package module3;

public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Access elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // Modify an element of the array
        numbers[2] = 100;
        System.out.println("Modified third element: " + numbers[2]);

        // Iterate over the array
        System.out.println("All elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Find the sum of all elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of all elements: " + sum);

        // Find the maximum element
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum element: " + max);

        // Find the average of all elements
        double average = (double) sum / numbers.length;
        System.out.println("Average of all elements: " + average);

        // Reverse the array
        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println("Reversed array:");
        for (int number : reversedNumbers) {
            System.out.println(number);
        }
    }
}
