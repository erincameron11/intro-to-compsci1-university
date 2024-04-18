/*
 * 2D ARRAY
 * Write a method that accepts a 2D array as input and return a one-D array 
 * containing the sum of each row of the 2D. The number of rows in 2D array 
 * is the same as the number of letters in your first name. This method should 
 * also sort and print the rows 2D array according to the order of their sum. 
 * ( the row with smaller sum should occur first in the 2D array)
 * The method header is given as follows
 * 
 * public static float[] sumRows(float twoD[][]){}
 */

package examseven;

import java.util.Scanner;

public class ExamSeven {

	public static float[] sumRows(float twoD[][]){

		// Add matrix values
		float rows = twoD.length;
		float columns = twoD[0].length;  
		float[] sum = new float[3];
		
		for(int i = 0; i < rows; i++){     
            for(int j = 0; j < columns; j++){    
              sum[i] += twoD[i][j];    
            }    
            
            System.out.print("The sum of row " + (i + 1) + ": ");
            // Print out sum of each row in array sum
            System.out.print(sum[i] + "\n");
        }    
		
		// STILL NEED TO DO: Re-order array to smallest value first, largest last
		
		// Return an array of sum
		return sum;
		
	}
	
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// STILL NEED TO DO: prompt the user to enter their name
		// use their name for matrix row count
		
		// Prompt the user to enter a 3 x 3 matrix
		System.out.print("Enter a 3x3 matrix: ");
		
		float[][] twoD = new float[3][3];
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++)
				twoD[row][column] = input.nextFloat();
		}
		
		sumRows(twoD);
		
		// Close the input
		input.close();
	}

}
