package pyramid;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter an integer
		System.out.print("Enter an integer from 1 to 15: ");
		int lines = input.nextInt();
		
		// Loop through and create the rows of the pyramid
		for (int rows = 1; rows <= lines; rows++) {
			// Add a space in between each digit in a row
			for (int i = lines - rows; i >= 1; i--) {
				System.out.print("  ");
			}
			// Order the numbers in the row - Descending
			for (int j = rows; j >= 2; j--) {
				System.out.print(j + " ");
			}
			// Order the numbers in the row - Ascending
			for (int k = 1; k <= rows; k++) {
				System.out.print(k + " ");
			}
			// Stack the rows in separate lines
			System.out.println();
		}
		
		// Close the input
		input.close();

	}

}
