/*
 * (Statistics: compute mean and standard deviation) In business applications, 
 * you are often asked to compute the mean and standard deviation of data. The 
 * mean is simply the average of the numbers. The standard deviation is a statistic 
 * that tells you how tightly all the various data are clustered around the mean in 
 * a set of data. For example, what is the average age of the students in a class? 
 * How close are the ages? If all the students are the same age, the deviation is 0.
 * Write a program that prompts the user to enter 10 numbers and displays the mean 
 * and standard deviations of these numbers using the following formula: 
 * 
 * double mean = (n1 + n2 + n3) / 3;
 * double stdev = Math.sqrt((Math.pow((n1 - mean), 2) + 
 * 							 Math.pow((n2 - mean), 2) +
 * 							 Math.pow((n3 - mean), 2))
 */

package mean;

import java.util.Scanner;

public class MeanAndStandardDeviation {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter 10 numbers
		System.out.print("Enter 10 numbers separated by a space: ");
//		double[] numbers = input.nextDouble(numbers);
		double one = input.nextDouble();
		double two = input.nextDouble();
		double three = input.nextDouble();
		double four = input.nextDouble();
		double five = input.nextDouble();
		double six = input.nextDouble();
		double seven = input.nextDouble();
		double eight = input.nextDouble();
		double nine = input.nextDouble();
		double ten = input.nextDouble();
		
		// Calculate the mean
		double mean = (one + two + three + four + five + six + seven + eight + nine + ten) / 10;
		
		// Calculate Standard Deviation
		double stdev = Math.sqrt((Math.pow((one - mean), 2) + 
								  Math.pow((two - mean), 2) +
								  Math.pow((three - mean), 2) +
								  Math.pow((four - mean), 2) + 
								  Math.pow((five - mean), 2) +
								  Math.pow((six - mean), 2) +
								  Math.pow((seven - mean), 2) +
								  Math.pow((eight - mean), 2) +
								  Math.pow((nine - mean), 2) +
								  Math.pow((ten - mean), 2)) 
								  / 10);
		
		// Display results
		System.out.println("The mean is: " + mean);
		System.out.println("The standard deviation is: " + stdev);
		
		// Close the input
		input.close();
	}

}
