package reverse;

import java.util.Scanner;

public class ReverseNum {
	
	public static int[] reverse() {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Initialize array variables
		int a[] = new int [10]; 
		int b[] = new int [10];
		
		// Prompt the user to enter 10 elements
		System.out.print("Enter 10 elements separated with spaces: ");
		for (int i = 0; i < 10; i++) {
			a[i] = input.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			b[i] = a[9 - i];
		}
		
		// Close the input
		input.close();
		
		// Return the values to the caller
		return b;
	}

	public static void main(String[] args) {
		// Display the reversed numbers to the user
		int b[] = new int [10];
		b = reverse();
		System.out.println("The reversed elements are: ");
		
		for (int i = 0; i < 10; i++) {
			System.out.print(b[i]);
		}

	}

}
