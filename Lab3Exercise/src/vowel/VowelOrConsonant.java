package vowel;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a letter
		System.out.print("Enter a letter: ");
		String letter = input.next();
		letter = letter.toUpperCase(); // Convert letter to uppercase
		char ch = letter.charAt(0); // Convert to char
		
		// Check if the letter entered is a digit
		boolean letterCheck = Character.isLetter(ch);
	
		// Check if letter is a vowel, consonant, Y, or a digit
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.print(ch + " is a vowel");
		} else if (ch == 'Y') {
			System.out.print(ch + " is sometimes a vowel, sometimes not");
		} else if (!letterCheck) {
			System.out.print(ch + " is an invalid input");
		} else {
			System.out.print(ch + " is a consonant");
		}
		
		// Close the input
		input.close();

	}

}
