package monetarycounter;

import java.util.Scanner;

public class MonetaryCounter {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
				
		// Prompt user
		System.out.println("Enter amount as decimal number (such as 11.56): ");
		double amount = input.nextDouble();
				
		// Convert into cents
		double cents = amount * 100;
		int remainingCents = (int)(amount * 100);
				
		// Find number of dollars
		double dollars = cents / 100;
		remainingCents = remainingCents % 100;
				
		// Find quarters
		double quarters = remainingCents / 25;
		remainingCents = remainingCents % 25;
				
		// Find dimes
		double dimes = remainingCents / 10;
		remainingCents = remainingCents % 10;
				
		// Find nickels
		double nickels = remainingCents / 5;
		remainingCents = remainingCents % 5;
				
		System.out.println("The dollars are " + (int)dollars);
		System.out.println("The quarters are " + (int)quarters);
		System.out.println("The dimes are " + (int)dimes);
		System.out.println("The nickels are " + (int)nickels);
		System.out.println("The cents are " + (int)remainingCents);
				
		// Close the input
		input.close();	

	}

}
