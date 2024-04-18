/*
 * (Longest common prefix) Write a program that prompts the user to enter two 
 * strings and displays the largest common prefix of the two strings.
 */

package prefix;

import java.util.Scanner;

public class LongestPrefix {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two strings
		System.out.print("Enter the first string: ");
		String s1 = input.nextLine();
		
		System.out.print("Enter the second string: ");
		String s2 = input.nextLine();
		
		System.out.print("The common prefix is: ");
		// Loop through the strings to check characters
		for (int i = 0; s1.charAt(i) == s2.charAt(i); i++) {
			System.out.print(s1.charAt(i));
		}
		
		// If/Else for if the prefix does not match at all
		if (s1.charAt(0) != s2.charAt(0))
			System.out.print("No common prefix");
		
		// Close the input
		input.close();

	}}
