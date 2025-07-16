package Array;

import java.util.Scanner;

public class ArrayTwoDimensionInsertion {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter number of rows for the 2D array
        System.out.println("Enter row (Make sure to enter an integer value): ");
        int rowValue = scanner.nextInt(); // Read row count

        // Prompt user to enter number of columns for the 2D array
        System.out.println("Enter column: ");
        int columnValue = scanner.nextInt(); // Read column count

        // Declare and initialize a 2D array with user-defined dimensions
        int[][] arr = new int[rowValue][columnValue];

        // Prompt the user to enter the values for each element in the 2D array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rowValue; i++) {
            for (int j = 0; j < columnValue; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt(); // Read value for each cell
            }
        }

        // Display the entire 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < rowValue; i++) {
            for (int j = 0; j < columnValue; j++) {
                System.out.print(arr[i][j] + " "); // Print element followed by a space
            }
            System.out.println(); // Move to the next line after printing each row
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
