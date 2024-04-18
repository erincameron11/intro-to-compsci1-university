/*
 * (Compute the perimeter of a triangle) Write a program that reads 
 * three edges for a triangle and computes the perimeter if the input 
 * is valid. Otherwise, display that the input is invalid. The input 
 * is valid if the sum of every pair of two edges is greater than the 
 * remaining edge.
 */

package triangle;

import java.util.Scanner;

public class TrianglePerimeter {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter three edges for a triangle
		System.out.print("Enter three values for the edges of a triangle: ");
		double edge1 = input.nextDouble();
		double edge2 = input.nextDouble();
		double edge3 = input.nextDouble();
		
		// Calculate edge sums
		double edge12 = edge1 + edge2;
		double edge23 = edge2 + edge3;
		double edge31 = edge3 + edge1;
		
		double perimeter = edge1 + edge2 + edge3;
		
		// If/Else to determine if the edges are valid inputs
		if (edge12 < edge3 || edge23 < edge1 || edge31 < edge2)
			System.out.print("The input is invalid");
		else
			System.out.print("The perimeter of the triangle is: " + perimeter);
			
		// Close the input
		input.close();
	}

}
