/*
 * Create a program that prompts the user to guess a random number.
 * The program will tell the user when they guess correctly, and repeatedly prompt
 * the user to enter a value until the correct guess
 */

package guessnumbers;

import java.util.Scanner;
import java.lang.Math;

public class GuessNumbers {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		int guess = -1;
		int number = (int)(Math.random() * 100);
		System.out.println(number);
		
		while (guess != number) {
			System.out.print("Enter a number between 1 and 100: ");
			guess = input.nextInt();
			
			if (guess == number) {
				System.out.print("Congratulations, your guess of " + guess + " is correct!");
			} else {
				System.out.print("Incorrect guess. ");
			}
		}
		
		// Close the input
		input.close();
	}

}
