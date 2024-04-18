/*
 * (Cost of driving) Write a program that prompts the user to enter 
 * the distance to drive, the fuel efficiency of the car in miles per 
 * gallon, and the price per gallon then displays the cost of the trip. 
 */

package drive;

import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter distance, fuel efficiency, price
		System.out.print("Enter the distance to drive in miles: ");
		double distance = input.nextDouble();
		
		System.out.print("Enter the fuel efficiency of the car in miles per gallon: ");
		double fuelEff = input.nextDouble();
		
		System.out.print("Enter the price per gallon: ");
		double price = input.nextDouble();
		
		// Calculate the cost
		double cost = (distance / fuelEff) * price;
		
		// Display the cost of the trip
		System.out.printf("This trip will cost you: $%5.2f", cost);
		
		// Close the input
		input.close();
	}

}
