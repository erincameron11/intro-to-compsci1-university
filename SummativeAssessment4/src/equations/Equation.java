/* Write a program that solves a system of linear equations having 3 variables.
 * You must use matrices as 2 dimensional arrays in order to solve this problem.
 */

package equations;

import java.util.Scanner;

class LinearEquation1 {
	// Initialize variables and arrays
	int i, j;
	float determinant = 0;
	float[][] matrixA = {
		{1, 3, 2},
		{3, 5, 6},
		{2, 4, 3}
	};
	float[][] matrixB = {
		{5},
		{7},
		{8}
	};
	float[][] matrixC = new float[3][1]; // Used to store matrixA * matrixB values 
	float[][] inverse = new float[3][3]; // Inverse of matrixA
	
	LinearEquation1() {
		
	}
	
//	public float getInverse() {
//		// Find determinant
//		for(i = 0; i < 3; i++)
//			determinant += (matrixA[0][i] * (matrixA[1][(i + 1) % 3] * matrixA[2][(i + 2) % 3] - matrixA[1][(i + 2) % 3] * matrixA[2][(i + 1) % 3]));
//
//		// Calculate inverse of matrixA
//		System.out.println("\nThis is where the inverse of matrixA is calculated");
//		for(int i = 0; i < 3; ++i) {
//			for(int j = 0; j < 3; ++j)
//				System.out.print((((matrixA[(j + 1) % 3][(i + 1) % 3] * matrixA[(j + 2) % 3][(i + 2) % 3]) - (matrixA[(j + 1) % 3][(i + 2) % 3] * matrixA[(j + 2) % 3][(i + 1) % 3])) / determinant) + "  ");
//				System.out.print("\n");
//			}
////		return;
//	}
	
}

public class Equation {

	public static void main(String[] args) {		
		// The matrix solution to take the "Inverse of a Matrix" is X = A to the power of -1 * B
		// In other words, the variables' values = the inverse of matrixA multiplied by matrixB
		

		// Initialize variables and arrays
		int i, j;
		float determinant = 0;
		float[][] matrixA = {
			{1, 3, 2},
			{3, 5, 6},
			{2, 4, 3}
		};
		float[][] matrixB = {
			{5},
			{7},
			{8}
		};
		float[][] matrixC = new float[3][1]; // Used to store matrixA * matrixB values 
		float[][] inverse = new float[3][3]; // Inverse of matrixA

		
		// MATRIX A: Display to user
		System.out.println("MatrixA is:");
		for (int row = 0; row < matrixA.length; row++) {
			for (int column = 0; column < matrixA[row].length; column++) {
				System.out.print(matrixA[row][column] + "  "); 
			}
			System.out.println(); 
		}
		
		// MATRIX B: Display to user
		System.out.println("MatrixB is:");		
		for (int row = 0; row < matrixB.length; row++) {
			for (int column = 0; column < matrixB[row].length; column++) {
				System.out.print(matrixB[row][column] + "  "); 
			}
			System.out.println(); 
		}

		
		
		// Display the inverse of MatrixA
		System.out.println("\nInverse of matrixA: ");
//		LinearEquation linEq = new LinearEquation();
//		linEq.getInverse();
		    
		for(i = 0; i < 3; ++i) {
			for(j = 0; j < 3; ++j)
				System.out.print((((matrixA[(j + 1) % 3][(i + 1) % 3] * matrixA[(j + 2) % 3][(i + 2) % 3]) - (matrixA[(j + 1) % 3][(i + 2) % 3] * matrixA[(j + 2) % 3][(i + 1) % 3])) / determinant) + "  ");
				System.out.print("\n");
			}
			System.out.print("\nThis is where the assignment of values to matrixC happens");
			for(i = 0; i < 3; i++){    
				for(j = 0; j < 3; j++){    
					matrixC[i][j] = 0;      
					for(int k = 0; k < 3; k++){
						matrixC[i][j] += inverse[i][k] * matrixB[k][j];      
//						System.out.print(matrixC);
						
					}
					for (int row = 0; row < matrixC.length; row++) {
						for (int column = 0; column < matrixC[row].length; column++) {
							System.out.print(matrixC[row][column] + "  "); 
						}
						System.out.println(); 
					}
					
				}
				
		}
			
			
			
		
			
			
			
			
			
			// Inverse matrixA multiplied by matrixB
//			
//			int total = 0;
//			for (int row = 0; row < matrix.length; row++) {
//				for (int column = 0; column < matrix[row].length; column++) { total += matrix[row][column];
//			} }

	}

}
