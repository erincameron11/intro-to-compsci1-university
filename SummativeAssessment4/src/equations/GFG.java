package equations;

import java.util.Scanner;

class outside {
	
	outside() {
		// Default constructor
	}
	
	// METHOD: Display the matrix
    static void displayMatrix(double matrix[][],
    						  int sizeOfRow,
    						  int sizeOfColumn) {
        for (int i = 0; i < sizeOfRow; i++) {
            for (int j = 0; j < sizeOfColumn; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // METHOD: Multiply inverseMatrix by matrixB
    static void multiMatrices(
        int rowI, int columnI, double matrixA[][],
        int rowB, int columnB, double matrixB[][],
        int rowA, int columnA, double inverseMatrix[][]) {
        
    	// Define variables
    	int i, j, k;
 
        // Display both matrixA and matrixB
        System.out.println("\nmatrixA:");
        displayMatrix(matrixA, rowI, columnI);
        System.out.println("\nmatrixB:");
        displayMatrix(matrixB, rowB, columnB);
 
        // Create a new matrix to store the multiplication of matrixA by matrixB answers
        double matrixC[][] = new double[rowA][columnB];
        
        // Multiply the two matrices and store values in matrixC
        for (i = 0; i < rowA; i++) {
            for (j = 0; j < columnB; j++) {
                for (k = 0; k < rowB; k++)
                	matrixC[i][j] += inverseMatrix[i][k] * matrixB[k][j];
            }
        }
        // Display matrixC
        System.out.println("\nFinal matrixC (inverseMatrix * matrixB answers): ");
        displayMatrix(matrixC, rowA, columnB);
        System.out.println("For x, z, y, respectively.");  
    }
    
}

class GFG {
 
    // METHOD: Main method where the other methods are called, and final results are displayed
    public static void main(String[] args) {
    	// Show the user what linear equations we are solving
    	System.out.print("The equations we are solving for are: "
    					+ "\n1x + 3y - 2z = 5 "
    					+ "\n3x + 5y + 6z = 7 "
    					+ "\n2x + 4y + 3z = 8 \n\n");
 
    	// Define matrixA and matrixB
        double matrixA[][] = { 
        	{1, 3, 2},
        	{3, 5, 6},
       		{2, 4, 3}
        };
        
        double matrixB[][] = { 
			{5},
			{7},
			{8}
        };
        
     // To find the determinant of matrixA:
        int determinant = 0;
     	for(int i = 0; i < 3; i++)
     		determinant += (matrixA[0][i] * (matrixA[1][(i + 1) % 3] * matrixA[2][(i + 2) % 3] - matrixA[1][(i + 2) % 3] * matrixA[2][(i + 1) % 3]));
     		   
     // Use the determinant discovered above to find the inverse of matrixA:
     	System.out.println("The inverse of matrixA is: ");
     	for(int i = 0; i < 3; ++i) {
     		for(int j = 0; j < 3; ++j)
     			System.out.print((((matrixA[(j + 1) % 3][(i + 1) % 3] * matrixA[(j + 2) % 3][(i + 2) % 3]) 
     							 - (matrixA[(j + 1) % 3][(i + 2) % 3] * matrixA[(j + 2) % 3][(i + 1) % 3])) 
     							 / determinant) + "  ");
     			System.out.print("\n");
     		}	
     	
     	Scanner input = new Scanner(System.in);
     	System.out.print("\nPlease copy and paste the inverse matrixA above: ");
     	double[][] inverseMatrix = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inverseMatrix[i][j] = input.nextDouble();
 
        outside out = new outside();
        out.multiMatrices(3, 3, matrixA, 3, 1, matrixB, 3, 3, inverseMatrix);
        
    }
}