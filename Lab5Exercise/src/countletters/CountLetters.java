package countletters;

import java.util.Scanner;

public class CountLetters {
	
	public static int countLetters (String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i)))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Initialize variables
		String s1;
		
		// Prompt the user to enter a string
		System.out.print("Enter your string: ");
		s1 = input.nextLine();
		
		// Display the number of characters in the String
		System.out.println("The number of characters is: " + countLetters(s1));
		
		// Close the input
		input.close();
	}

}
