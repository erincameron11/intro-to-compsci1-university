package vector;

import java.lang.Math;

public class VectorCalculation {

	public static void main(String[] args) {
		/* Write a program to calculate components 
		 * of vector A ̄ = 4 units if it has an angle 
		 * θ = 30° . Note that the components vectors 
		 * are given by (rx , ry) = (r . cosθ, r . sinθ). 
		 * Convert degrees to radians if necessary. */

		// Initialize variables
		int angle = 30;
		int a = 4;
		
		// Convert angle to radians
		double angleRad = Math.toRadians(angle);
		
		// Calculate the components for the vector in the format of (vx, vy)
		double vx = a * Math.cos(angleRad);
		double vy = a * Math.sin(angleRad);
		
		// Display results
		System.out.print("The components of a vector with 4 units that has an angle of 30 degrees is: ("
						  + vx + ", " + vy + ")");
	}

}
