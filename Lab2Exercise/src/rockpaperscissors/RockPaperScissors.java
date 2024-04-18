package rockpaperscissors;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		// Define variables
		int rock = 1;
		int paper = 2;
		int scissors = 0;
		
		// Prompt the user to enter a number
		System.out.print("Enter a number: scissor (0), rock (1), paper (2): ");
		int userSelection = input.nextInt();
		System.out.println("You chose: " + userSelection);
		
		// Program randomly generates a number between 0-2 for the computer's selection
		int computerSelection = random.nextInt(paper);
		System.out.println("The computer chose: " + computerSelection);
		
		// If / else for ties, wins and losses
		if (userSelection == computerSelection) {
			System.out.print("It's a tie! You selected: " + userSelection 
						     + " and the computer selected: " + computerSelection);
		} else if ((userSelection == paper && computerSelection == scissors)
					|| (userSelection == rock && computerSelection == paper)
					|| (userSelection == scissors && computerSelection == rock)) {
			System.out.print("The computer wins!");
		} else if ((userSelection == paper && computerSelection == rock)
					|| (userSelection == scissors && computerSelection == paper)
					|| (userSelection == rock && computerSelection == scissors)) {
			System.out.print("You win!");
		} else {
			System.out.print("Invalid entry...therefore the computer wins!");
		}

		// Close the input
		input.close();
	}

}
