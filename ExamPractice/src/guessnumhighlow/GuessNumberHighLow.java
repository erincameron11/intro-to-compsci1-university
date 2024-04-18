/*
 * Create a program that prompts the user to guess a random number.
 * The program will tell the user if the value guessed is too high or too low
 * When the user guesses correctly, tell them they won
 */

package guessnumhighlow;

import java.util.Scanner;

public class GuessNumberHighLow {

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
			} else if (guess < number) {
				System.out.print("Too low. ");
			} else if (guess > number) {
				System.out.print("Too high. ");
			}
		}
			
		// Close the input
		input.close();
	}

}
