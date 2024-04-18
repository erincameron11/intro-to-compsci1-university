package concatstrings;

import java.util.Scanner;

public class ConcatStrings {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter their name
		System.out.print("Enter your name: ");
		String name = input.next();
		
		// Initialize other variables
		String greeting1 = "Good Evening, ";
		String greeting2 = "! Nice to meet you";
		
		// Concatenate the strings
		String sentence = greeting1.concat(name);
		String sentenceFinal = sentence.concat(greeting2);
		
		// Convert all letters of the resulting string to capital
		String upperSentence = sentenceFinal.toUpperCase();
		
		// Display the sentence & Upper Case sentence
		System.out.println(sentenceFinal);
		System.out.print(upperSentence);

	}

}
