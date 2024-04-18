package highscore;

import java.util.Scanner;

public class HighScoreCalculator {

	public static void main(String[] args) {
		// Create a Scanner, and prompt the user to enter the number of students
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int numStudents = input.nextInt();
				
		// Initialize variables
		int highestScore = 0;
		int lowestScore = 0;
		String name1 = ""; // Placeholder
		String name2 = ""; // Placeholder
		
		// Prompt the user to enter each student's name and score
		for (int i = 0; i < numStudents; i++) {
			System.out.print("Enter name and score of student " + (i + 1) + " (with a space in between):"); // i + 1 due to index numbering
			String name = input.next(); // Store the name input
			int score = input.nextInt(); // Store the score input
			
			// If/Else to determine who has the highest and lowest score and assign them to the proper variables
			if (score > highestScore) {
				lowestScore = highestScore;
				name2 = name1;
				highestScore = score;
				name1 = name;
			} else if (score > lowestScore) {
				lowestScore = score;
				name2 = name;
			}
			
		}
		
		System.out.println("The student with the highest score is: " + name1 + " with the score: " + highestScore);
		System.out.println("The student with the second highest score is: " + name2 + " with the score: " + lowestScore);
		
		// Close the input
		input.close();
	}

}	