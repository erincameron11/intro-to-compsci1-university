/*
 * (Geometry: area of a pentagon) The area of a pentagon can be computed 
 * using the following formula:
 * Area = (5 * s^2) / (4 * tan(PI/5))
 * 
 * Write a method that returns the area of a pentagon using the following header:
 * public static double area(double side)
 * 
 * Write a main method that prompts the user to enter the side of a pentagon and 
 * displays its area.
 */

package pentagon;

import java.util.Scanner;
import java.lang.Math;

class Area {
	double side = 0;
	
	Area() {
		// Default constructor
	}
	
	// METHOD: Returns the area of a pentagon
	public static double area(double side) {
		double area = (5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI/5)));
		return area;
	}
}

public class AreaOfPentagon {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a value for side
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		// Create an object
//		Area a = new Area(); // DO NOT NEED TO CREATE AN OBJECT FOR STATIC METHODS
		
		// Display the results.
		System.out.print("The area of the pentagon is: " + Area.area(side));
		
		// Close the input
		input.close();
	}

}
