package volume;

import java.util.Scanner;
import java.lang.Math;

public class VolumeOfSphere {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Define constants
		final double PI = 3.14159265359;
		
		// Prompt the user to enter a radius
		System.out.print("Enter a radius: ");
		double radius = input.nextDouble();
		
		// Calculate the volume of the sphere
		double volume = (4.0/3) * PI * (Math.pow(radius, 3));

		// Display the volume
		System.out.print("The volume of the sphere is: " + volume);
		
		// Close the input
		input.close();
	}

}
