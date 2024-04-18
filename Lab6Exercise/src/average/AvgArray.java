package average;

import java.util.Scanner;

public class AvgArray {

	// METHOD: Return the average of a double array
	public static int average(int[] array) {
    int sum = 0;
    for (int value : array)
        sum += value;
    return sum / array.length;
}
	
	// METHOD: Return the average of an integer array
	public static double average(double[] array) {
	    double sum = 0.0;
	    for (double value : array) 
	        sum += value;
	    return sum / array.length;
	}	
	
	
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter ten double values
	    double[] values = new double[10];
	    System.out.print("Please enter ten values (integers or doubles): ");

	    for (int i = 0; i < 10; i++) 
	        values[i] = input.nextDouble();

	    // Display the average
	    System.out.printf("The average is: %.2f", average(values));
	
		// Close the input
		input.close();
	}

}
