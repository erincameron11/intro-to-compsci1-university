/*
 * (Find the Unicode of a character) Write a program that receives a 
 * character and displays its Unicode.
 */

package unicode;

import java.util.Scanner;

public class FindUnicode {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a character
		System.out.print("Enter a character: ");
		String s = input.next();
		char character = s.charAt(0);
		int uni = (int)character;
		
		// Display the unicode
		System.out.print("The unicode for the character " + character + " is " + uni);
		
		// Close the input
		input.close();
	}

}
