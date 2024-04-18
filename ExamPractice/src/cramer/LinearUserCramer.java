/*
 * (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using 
 * Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts 
 * the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, 
 * report that “The equation has no solution.”
 * 
 * ax + by = e
 * cx + dy = f
 * 
 * x = (ed - bf) / (ad - bc)
 * y = (af - ec) / (ad - bc)
 * 
 * Example:
 * 3.4x + 50.2y = 44.5 
 * 2.1x + .55y = 5.9
 * 
 */

package cramer;

import java.util.Scanner;

public class LinearUserCramer {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter values for a b c d e f
		System.out.print("Enter values for a, b, c, d, e, f separated by a space: ");		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		// Determinant calculation
		double det = (a * d) - (b * c);
		
		// If/Else x and y calculations
		if (det == 0) {
			System.out.print("The equation has no solution");
		} else {
			// Calculate x and y
			double x = (((e * d) - (b * f)) / det);
			double y = (((a * f) - (e * c)) / det);
			System.out.print("The value for x is: " + x + " \nThe value for y is: " + y);
		}
		
		// Close the input
		input.close();
	}

}
