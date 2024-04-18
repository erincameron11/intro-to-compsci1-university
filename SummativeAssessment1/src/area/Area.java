package area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the length
		System.out.print("Enter the length: ");
		double length = input.nextDouble();
		
		// Prompt the user the enter the width
		System.out.print("Enter the width: ");
		double width = input.nextDouble();
		
		// Calculate the area
		double area = length * width;
		
		// Display result to user
		System.out.print("The area of the room is: " + area);
		
		// Close the input
		input.close();
	}

}
