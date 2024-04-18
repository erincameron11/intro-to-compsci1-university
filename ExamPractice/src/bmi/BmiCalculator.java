/*
 * (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, 
 * to let the user enter weight, feet, and inches. For example, if a person 
 * is 5 feet and 10 inches, you will enter 5 for feet and 10 for inches.
 * 
 * REMEMBER: the formula for BMI is...
 * BMI = weight in kg / Math.pow(height metres, 2)
 */

package bmi;

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter weight, and height
		System.out.print("Enter weight in pounds: ");
		double weightLb = input.nextDouble();
		
		System.out.print("Enter height feet: ");
		double heightFt = input.nextDouble();
		
		System.out.print("Enter height inches: ");
		double heightIn = input.nextDouble();
		
		// Convert pounds to kilograms
		double weightKg = weightLb * 0.453592; // 1 pound is 0.453592 kilograms
		
		// Convert feet to inches
		double heightFtToIn = heightFt * 12;
		
		// Convert height in inches to meters
		double heightMt = (heightFtToIn + heightIn) * 0.0254; // 1 inch is 0.0254 meters
		
		// Calculate BMI
		double bmi = weightKg / Math.pow(heightMt, 2);
		
		// Display the result
		System.out.println("The BMI is: " + bmi);
		
		if (bmi < 18.5)
			System.out.println("Underweight"); 
		else if (bmi < 25)
			System.out.println("Normal"); 
		else if (bmi < 30)
			System.out.println("Overweight"); 
		else
			System.out.println("Obese");
		
		// Close the input
		input.close();
	}

}
