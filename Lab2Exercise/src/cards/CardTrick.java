package cards;

import java.util.Scanner;
import java.util.Random;

public class CardTrick {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to pick a card from the deck
		System.out.print("Pick a card, any card (hint, press any letter + Enter): ");
		String card = input.next();
		
		// Computer randomly selects card
		String rank[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; 
		String suit[] = {"Hearts", "Diamonds", "Spades", "Clubs"};
				
		// Display the card result
		Random random = new Random();
		System.out.print("The random card " + "\"" + card + "\"" + " you picked is: " 
						 + rank[random.nextInt(rank.length)] + " of " 
						 + suit[random.nextInt(suit.length)]);
		
		// Close the input
		input.close();
	}

}
