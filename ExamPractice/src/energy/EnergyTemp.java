/*
 * (Science: calculating energy) Write a program that calculates the energy 
 * needed to heat water from an initial temperature to a final temperature. 
 * Your program should prompt the user to enter the amount of water in kilograms 
 * and the initial and final temperatures of the water. The formula to compute 
 * the energy is Q = M * (finalTemperature – initialTemperature) * 4184
 * where M is the weight of water in kilograms, initial and final temperatures 
 * are in degrees Celsius, and energy Q is measured in joules. 
 */

package energy;

import java.util.Scanner;

public class EnergyTemp {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter amount of water in kilograms
		System.out.print("Enter the following values separated by a space"
						+ "\nAmount of water (kilograms)\nInitial temperature (celsius) \nFinal temperature (celsius): ");
		double water = input.nextDouble();
		double initialTemp = input.nextDouble();
		double finalTemp = input.nextDouble();
		
		// Calculate the amount of energy
		double energy = water * (finalTemp - initialTemp) * 4184;
		
		// Display the results
		System.out.print("The energy needed to heat " + water + " kilograms of water to " 
						 + finalTemp + " degrees is: " + energy + " joules");
		
		// Close the input
		input.close();
	}

}
