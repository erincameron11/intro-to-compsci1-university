package standarddeviation;

import java.util.Scanner;
import java.lang.Math;

public class StandardDeviation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter three numbers
		System.out.print("Enter three numbers separated by a space: ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		
		// Calculate standard deviation
		double mean = (n1 + n2 + n3) / 3;
		double stdev = Math.sqrt((Math.pow((n1 - mean), 2) + 
						          Math.pow((n2 - mean), 2) + 
						          Math.pow((n3 - mean), 2)) 
					   / 3);
		System.out.print(stdev);
		
		// Close the input
		input.close();
	}

}
