/*
 * (Enter three countries) Write a program that prompts the user 
 * to enter three countries and displays them in descending order.
 */

package countries;

import java.util.Scanner;

public class AscendingCountries {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter three countries
		System.out.print("Enter the first country: ");
		String country1 = input.nextLine();
		System.out.print("Enter the second country: ");
		String country2 = input.nextLine();
		System.out.print("Enter the third country: ");
		String country3 = input.next();
		
		// Determine alphabetical order
		String placeholder;
		if (country2.compareTo(country1) < 0 && country2.compareTo(country3) < 0) {
			placeholder = country1;
			country1 = country2;
			country2 = placeholder;
		} else if (country3.compareTo(country1) < 0 && country3.compareTo(country2) < 0) {
			placeholder = country1;
			country1 = country3;
			country3 = placeholder;
		} else if (country3.compareTo(country2) < 0) {
			placeholder = country2;
			country2 = country3;
			country3 = placeholder;
		}

		System.out.print("The countries in ascending order are: " + country3 + " " + country2 + " " + country1);
			
		// Close the input
		input.close();
	}

}
