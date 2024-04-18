package log;

import java.util.Scanner;
import java.lang.Math;

public class LogCalculation {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Define variables
		final double e = 2.71828;
		
		// Prompt user to enter radix value
		System.out.print("Enter a value for the radix: ");
		double radix = input.nextDouble();
		
		// Prompt the user to enter a number value
		System.out.print("Enter a number value: ");
		double number = input.nextDouble();
		
		// Formula for log calculation / mathematical constant e = 2.71828
		double calcLog = (Math.log(number)) / (Math.log(radix));

		// Display the result
		System.out.print("The log calculation result is: " + calcLog);
		
		// Close the input
		input.close();
	}

}
