package matrix;

import java.util.Scanner;

public class MultiMatrix {
	
	public static void main(String[] args) {
		// Initialize two 3 x 3 matrices
		double[][] matrix1 = getmatrix(1);
		double[][] matrix2 = getmatrix(2);

		// Initialize matrix3 with the multiplication of matrix1 and matrix2
		double[][] matrix3 = multiplyMatrix(matrix1, matrix2);

		// Display matrix1, matrix2 and matrix3
		print(matrix1, matrix2, matrix3);
	}

	// METHOD: used to prompt user to enter matrix values and create the matrix
	public static double[][] getmatrix(int n) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a 3 x 3 matrix
		System.out.print("Enter matrix" + n + ": ");

		double[][] m = new double[3][3];
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++)
				m[row][column] = input.nextDouble();
		}
		
		return m;
	}

	// METHOD: Multiply two matrices and return the result
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int h = 0; h < c.length; h++) {
					c[i][j] += a[i][h] * b[h][j]; // c is added to the multiplication to sum the multiplied values up
				}
			}
		}
		return c;
	}
	/* MULTIPLIED IN THIS WAY:
	 * 
	 * 1.0  2.0  3.0       8.0  7.0  6.0      24.0 18.0 39.0
	 * 4.0  5.0  6.0   *   5.0  4.0  3.0   =  69.0 54.0 93.0
	 * 7.0  8.0  9.0       2.0  1.0  9.0     114.0 90.0147.0
	 * 
	 * (1.0 x 8.0) + (2.0 x 5.0) + (3.0 x 2.0) = 24.0
	 * (4.0 x 8.0) + (5.0 x 5.0) + (6.0 x 2.0) = 69.0
	 * (7.0 x 8.0) + (8.0 x 5.0) + (9.0 x 2.0) = 114.0
	 * This is your first column of matrix c
	 * Then, repeat above using matrix 2 column 2 (7.0, 4.0, 1.0)
	 * Multiplication of matrices here: https://www.mathsisfun.com/algebra/matrix-multiplying.html
	 * 
	 */


	// METHOD: Display all elements in row r
	public static void print(double[][] m, int r) {	
		for (int j = 0; j < m[r].length; j++) {
			System.out.printf("%5.1f", m[r][j]);
		}	
	}

	// METHOD: Display the results
	public static void print(double[][] m1, double[][] m2, double[][] m3) {
		System.out.println("The matrices are multiplied as follows");
		
		for (int i = 0; i < 3; i++) {
			print(m1, i);
			System.out.print((i == 1 ? "   * " : "     "));
			print(m2, i);
			System.out.print((i == 1 ? "   = " : "     "));
			print(m3, i);
			System.out.println();
		}
	}

}
