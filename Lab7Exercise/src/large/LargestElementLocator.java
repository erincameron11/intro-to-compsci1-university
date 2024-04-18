/*
    Write the following method that returns the location
    of the largest element in a two-dimensional array.
    public static int[] locateLargest(double[][] a)
    The return value is a one-dimensional array that contains two elements. These
    two elements indicate the row and column indices of the largest element in the
    two-dimensional array. Write a test program that prompts the user to enter a two dimensional
    array and displays the location of the largest element in the array.
*/

package large;

import java.util.Scanner;

public class LargestElementLocator {
	
	// METHOD: Locate the largest integer in the array
	public static int[] locateLargest(double[][] a) {
        int[] location = new int[]{0, 0};
        double largest = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (largest < a[i][j]) {
                    largest = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        
        return location;
	}

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the columns and rows in array
		System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        
        // Create an array and place the user's input into that array
        double[][] userArray = new double[rows][columns];
        System.out.println("Enter the array: ");
        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray[i].length; j++) {
                userArray[i][j] = input.nextDouble();
            }
        }

        // Call on the locateLargest method above to locate the largest element in the array
        int[] location = locateLargest(userArray);
        System.out.printf("The location of the largest element is (%d, %d)%n",
            location[0], location[1]);
    
		// Close the input
		input.close();
	}

}
