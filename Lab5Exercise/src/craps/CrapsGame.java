package craps;

public class CrapsGame {

	public static void main(String[] args) {
		
		// Initialize variables
		int firstRoll, secondRoll, total; 
		int score = 0;
		
		do {
			// Randomize the values of the dice
			firstRoll = (int)(1 + Math.random() * 6);
			secondRoll = (int)(1 + Math.random() * 6);
			total = firstRoll + secondRoll;
			
			// Display the roll for the user to see
			System.out.println("The result of your roll is " + firstRoll + " + " + secondRoll + " = " + total); 
			
			// If/Else Statement to determine what was rolled and display the correct result
			if (total == 2 || total == 3 || total == 12 || total == 7) {
				System.out.println("Oh no! You lose. Try again."); 
				break;
			} else if (total == 11) {
				System.out.println(" You won!"); 
				break;
			} else if (total == score) {
				System.out.println("The total is: " + score + ". You won!");
				break;
			} else {
				// If the score is of any other value (4, 5, 6, 8, 9, 10) a point is established
				score++;
				System.out.println("The total is " + score);
			}
		
		// Outline parameters for when to continue looping
		// Continue to roll the dice until either a 7 or the same point value is rolled
		} while (total != 7 || total != score);

	}

}
