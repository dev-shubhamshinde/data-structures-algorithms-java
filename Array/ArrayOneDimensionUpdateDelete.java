package Array;

import java.util.Scanner;

public class ArrayOneDimensionUpdateDelete {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter number of array want to assign (Make sure use integer value while assigning): ");
        int arrayAllocation = scanner.nextInt(); // Read array size from user

        // Declare and initialize the array with user-defined size
        int[] arr = new int[arrayAllocation];

        // Populate the array with user input
        for (int i = 0; i < arrayAllocation; i++) {
            System.out.println("Enter value for index " + i + ": ");
            arr[i] = scanner.nextInt(); // Read and assign value to each index
        }

        // Display the original array
        System.out.println("Your array is: ");
        for (int i = 0; i < arrayAllocation; i++) {
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
        System.out.println(); // Move to the next line for better formatting

        // Ask user if they want to update (0) or delete (1) a value
        System.out.println("Want to replace value? Press 0 for replacement, 1 for deletion, or any other key to exit: ");
        int replacePermission = scanner.nextInt();

        if (replacePermission == 0) {
            // Replacement operation
            System.out.println("Enter index of replacement: ");
            int indexOfReplacement = scanner.nextInt();

            System.out.println("Enter value of replacement: ");
            int valueOfReplacement = scanner.nextInt();

            // Create a new array with one extra slot to insert new value
            int[] newArr = new int[arrayAllocation + 1];

            // Copy old values and insert the new one at specified index
            for (int i = 0; i < arrayAllocation + 1; i++) {
                if (i < indexOfReplacement) {
                    newArr[i] = arr[i]; // Copy values before replacement index
                } else if (i == indexOfReplacement) {
                    newArr[i] = valueOfReplacement; // Insert new value
                } else {
                    newArr[i] = arr[i - 1]; // Shift the remaining values
                }
            }

            // Display the updated array
            System.out.println("Your updated array is: ");
            for (int i = 0; i < arrayAllocation + 1; i++) {
                System.out.print(newArr[i] + " ");
            }

        } else if (replacePermission == 1) {
            // Deletion operation
            System.out.println("Enter index of deletion: ");
            int indexOfDeletion = scanner.nextInt();

            // Create a new array with one less slot
            int[] newDeletionArr = new int[arrayAllocation - 1];

            // Copy values except the one at deletion index
            for (int i = 0; i < arrayAllocation; i++) {
                if (i < indexOfDeletion) {
                    newDeletionArr[i] = arr[i]; // Copy values before deletion index
                } else if (i == indexOfDeletion) {
                    continue; // Skip the value at deletion index
                } else {
                    newDeletionArr[i - 1] = arr[i]; // Shift the remaining values
                }
            }

            // Display the array after deletion
            System.out.println("Your array after deletion is: ");
            for (int i = 0; i < arrayAllocation - 1; i++) {
                System.out.print(newDeletionArr[i] + " ");
            }

        } else {
            // If user input is not 0 or 1, exit the program
            System.out.println("No update or deletion performed.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
