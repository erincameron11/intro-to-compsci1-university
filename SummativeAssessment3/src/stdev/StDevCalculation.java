package stdev;

import java.lang.Math;

public class StDevCalculation {
	
	// METHOD: Calculate average of randomized numbers
	public static double average(double ...number) {
		double avg = 0;
		for (int i = 0; i < number.length; i++) {
			avg += number[i];
		}
		return avg / number.length;
	}
	
	// METHOD: Calculate Standard Deviation
	// REMEMBER: calculation is: Math.sqrt(((Math.pow((n1 - mean), 2) + (Math.pow((n1 - mean), 2) + ...) / n)
	static double calcStDev(double ...number) {
		// Initialize variables
		double mean = average(number);
		double stdev = 0;
		
		// Calculate Standard Deviation
		for (int i = 0; i < number.length; i++) {
			stdev += ((number[i] - mean) * (number[i] - mean));
		}
		stdev /= number.length - 1;
		return Math.sqrt(stdev);
	}

	// METHOD: Run all code and call on external methods
	public static void main(String[] args) {
		// Randomize numbers
		System.out.print("Randomized numbers for Standard Deviation calculation are: ");
		double randNum[] = new double [10];
		for(int i = 0; i < 10; i++) {
			randNum[i] = Math.random() * 10; 
			System.out.println(randNum[i]);
		}
		
		// Display to user the result
		System.out.println("Standard Deviation of the randomized array of numbers is: " + calcStDev(randNum));

	}

}
