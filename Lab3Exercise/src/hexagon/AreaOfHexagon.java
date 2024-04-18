package hexagon;

import java.util.Scanner;
import java.lang.Math;

public class AreaOfHexagon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter length of a side
		System.out.print("Enter a numeric value for the hexagon's side: ");
		double s = input.nextDouble();
		
		// Calculate the area using the user's input value
		double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
		
		// Display the result
		System.out.printf("%2s%4.2f\n", "The area of the hexagon is: ", area);
		
		// Close the input
		input.close();
	}

}
