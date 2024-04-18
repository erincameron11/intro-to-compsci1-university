/*
 * (Geometry: great circle distance) The great circle distance is the 
 * distance between two points on the surface of a sphere. Let (x1, y1) 
 * and (x2, y2) be the geographical latitude and longitude of two points. 
 * The great circle distance between the two points can be computed using 
 * the following formula:
 * 
 * d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 * 
 * Write a program that prompts the user to enter the latitude and longitude of 
 * two points on the earth in degrees and displays its great circle distance. 
 * The average radius of the earth is 6,371.01 km. Note you need to convert the 
 * degrees into radi- ans using the Math.toRadians method since the Java 
 * trigonometric methods use radians. The latitude and longitude degrees in the 
 * formula are for north and west. Use negative to indicate south and east degrees.
 */

package greatcircle;

import java.util.Scanner;
import java.lang.Math;

public class GreatCircleDistance {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Initialize variables
		final double radius = 6371.01; // radius of earth in kilometers
		
		// Prompt the user to enter latitude and longitude
		System.out.print("Enter point 1 latitude and longitude in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x1Rad = Math.toRadians(x1);
		double y1Rad = Math.toRadians(y1);
		
		System.out.print("Enter point 2 latitude and longitude in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x2Rad = Math.toRadians(x2);
		double y2Rad = Math.toRadians(y2);
		
		// Calculate the distance between the two points
		double distance = radius * Math.acos((Math.sin(x1Rad) * Math.sin(x2Rad)) + (Math.cos(x1Rad) * Math.cos(x2Rad) * Math.cos(y1Rad - y2Rad)));
		
		// Display the distance
		System.out.print("The distance between the two points is " + distance);

		// Close the input
		input.close();
	}

}
