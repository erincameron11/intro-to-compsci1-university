/*
 * (Convert square meter into ping) Write a program that converts square 
 * meter into ping. The program prompts the user to enter a number in square 
 * meter, converts it to ping, and displays the result. One square meter is 
 * 0.3025 ping.
 */

package ping;

import java.util.Scanner;

public class Ping {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter number of square metres
		System.out.print("Enter number of square metres to convert to ping: ");
		double sqMetre = input.nextDouble();
		
		// Calculate from square metres to ping
		double ping = sqMetre * 0.3025;
		
		// Display the square metres in ping
		System.out.print(sqMetre + " square metres is equivalent to: " + ping + " pings");
		
		// Close the input
		input.close();

	}

}
