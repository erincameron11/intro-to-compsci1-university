/* Write a program that solves a system of linear equations having 3 variables.
 * You must use matrices as 2 dimensional arrays in order to solve this problem.
 */

package equations;

import java.util.Scanner;

class LinEquation {
    // Function to print Matrix
    static void printMatrix(int M[][],
                            int rowSize,
                            int colSize)
    {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");
 
            System.out.println();
        }
    }
	
	
	// Function to multiply
    // two matrices A[][] and B[][]
    static void multiplyMatrix(
        int row1, int col1, int A[][],
        int row2, int col2, int B[][])
    {
        int i, j, k;
 
        // Print the matrices A and B
        System.out.println("\nMatrix A:");
        printMatrix(A, row1, col1);
        System.out.println("\nMatrix B:");
        printMatrix(B, row2, col2);
 
        // Check if multiplication is Possible
        if (row2 != col1) {
 
            System.out.println(
                "\nMultiplication Not Possible");
            return;
        }
 
        // Matrix to store the result
        // The product matrix will
        // be of size row1 x col2
        int C[][] = new int[row1][col2];
 
        // Multiply the two matrices
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
 
        // Print the result
        System.out.println("\nResultant Matrix:");
        printMatrix(C, row1, col2);
    }
}

public class LinearEquations {

	public static void main(String[] args) {
		// The matrix solution to take the "Inverse of a Matrix" is X = A to the power of -1 * B
		// In other words, the variables' values = the inverse of matrixA multiplied by matrixB
		

		// Initialize variables
		int i, j;
		float determinant = 0;
//		float matrixA[][] = new float[3][3];
//		float matrixB[][] = new float[3][1];
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
		float matrixC[][] = new float[3][1]; // Used to store matrixA * matrixB values 
			// Inverse of matrixA
		// Declare and initialize the variables in the linear equations
//		char[][] var = {
//			{'x'},
//			{'y'},
//			{'z'}
//		};
		
		// MATRIX A: Randomize matrix values and display to user
		System.out.println("MatrixA has been randomly selected as follows:");
//		for (int row = 0; row < matrixA.length; row++) {
//			for (int column = 0; column < matrixA[row].length; column++) {
//				matrixA[row][column] = (int)(Math.random() * 10); 
//			}
//		}
		for (int row = 0; row < matrixA.length; row++) {
			for (int column = 0; column < matrixA[row].length; column++) {
				System.out.print(matrixA[row][column] + "  "); 
			}
			System.out.println(); 
		}
		
		// MATRIX B: Randomize matrix values and display to user
		System.out.println("MatrixB has been randomly selected as follows:");
//		for (int row = 0; row < matrixB.length; row++) {
//			for (int column = 0; column < matrixB[row].length; column++) {
//				matrixB[row][column] = (int)(Math.random() * 10); 
//			}
//		}
		
		for (int row = 0; row < matrixB.length; row++) {
			for (int column = 0; column < matrixB[row].length; column++) {
				System.out.print(matrixB[row][column] + "  "); 
			}
			System.out.println(); 
		}

		
		
		// To find the inverse of matrixA:
		for(i = 0; i < 3; i++)
			determinant += (matrixA[0][i] * (matrixA[1][(i + 1) % 3] * matrixA[2][(i + 2) % 3] - matrixA[1][(i + 2) % 3] * matrixA[2][(i + 1) % 3]));
//		    System.out.println("\nDeterminant = " + determinant);
		    
		
		
		// Find the inverse of matrixA
		    System.out.println("\nThis is where the inverse of matrixA is calculated");
		for(i = 0; i < 3; ++i) {
			for(j = 0; j < 3; ++j)
				System.out.print((((matrixA[(j + 1) % 3][(i + 1) % 3] * matrixA[(j + 2) % 3][(i + 2) % 3]) 
								 - (matrixA[(j + 1) % 3][(i + 2) % 3] * matrixA[(j + 2) % 3][(i + 1) % 3])) 
							     / determinant) + "  ");
				System.out.print("\n");
			}	
		
		Scanner input = new Scanner(System.in);
		System.out.print("\nPlease copy and paste the inverse of matrixA you see as output above: ");
		float[][] inverse = new float[3][3];
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++)
                inverse[i][j] = input.nextFloat();

        
		// Find the value of matrixC - Inverse matrixA multiplied by matrixB
        
        
        
        
        
        
        
        
        
        
        
        
        
        
			System.out.print("\nThis is where the assignment of values to matrixC happens");
			for(i = 0; i < 3; i++){    
				for(j = 0; j < 3; j++){    
					matrixC[i][j] = 0;      
					for(int k = 0; k < 3; k++){
						matrixC[i][j] += inverse[i][k] * matrixB[k][j];
						System.out.print(matrixC);
						
					}
					for (int row = 0; row < matrixC.length; row++) {
						for (int column = 0; column < matrixC[row].length; column++) {
							System.out.print(matrixC[row][column] + "  "); 
						}
						System.out.println(); 
					}
					
				}
		}

	}
	}
