package Array;

import java.util.Scanner; // Importing Scanner class for user input

public class ArrayOneDimensionInsertion {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of elements for the array
        System.out.println("Enter number of array want to assign (Make sure use integer value while assigning): ");
        int arrayAllocation = scanner.nextInt(); // Read the size of the array

        // Declare and initialize the array with the specified size
        int[] arr = new int[arrayAllocation];

        // Loop to insert elements into the array
        for (int i = 0; i < arrayAllocation; i++) {
            System.out.println("Enter value for index " + i + ": ");
            arr[i] = scanner.nextInt(); // Read and assign value to the array at index i
        }

        // Display the array elements
        System.out.println("Your array is: ");
        for (int i = 0; i < arrayAllocation; i++) {
            System.out.print(arr[i] + " "); // Print each element with a space
        }

        // Close the scanner object to prevent resource leak
        scanner.close();
    }
}
