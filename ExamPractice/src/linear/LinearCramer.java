/*
 * (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve 
 * the following 2 * 2 system of linear equation provided that ad – bc is not 0:
 * ax + by = e
 * cx + dy = f
 * 
 * x = (ed - bf) / (ad - bc)
 * y = (af - ec) / (ad - bc)
 * Write a program that solves the following equation and displays the value for 
 * x and y: (Hint: replace the symbols in the formula with numbers to compute x 
 * and y. This exercise can be done in Chapter 1 without using materials in later 
 * chapters.)
 * Example:
 * 3.4x + 50.2y = 44.5 
 * 2.1x + .55y = 5.9
 */

package linear;

public class LinearCramer {

	public static void main(String[] args) {
		// Initialize variables
		double a = 2.4;
		double b = 4.0;
		double c = 1.7;
		double d = 8.1;
		double e = 11.1;
		double f = 12.0;
		
		// Determinant calculation
		double det = (a * d) - (b * c);
		
		// x and y calculations
		double x = ((e * d) - (b * f) / det);
		double y = ((a * f) - (e * c) / det);
		
		System.out.print("The value for x is: " + x + " \nThe value for y is: " + y);
		
	}

}
