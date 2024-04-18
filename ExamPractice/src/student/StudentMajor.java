/*
 * (Student major and status) Write a program that prompts the user 
 * to enter two characters and displays the major and status represented 
 * in the characters. The first character indicates the major and the 
 * second is number character 1, 2, 3, 4, which indicates whether a student 
 * is a freshman, sophomore, junior, or senior. Suppose the following 
 * characters are used to denote the majors:
 * 
 * I: Information Management
 * C: Computer Science
 * A: Accounting
 */

package student;

import java.util.Scanner;

public class StudentMajor {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two characters
		System.out.print("Enter two characters: ");
		String s = input.nextLine();
		char first = s.charAt(0);
		char second = s.charAt(1);
		
		// If/Else to determine what major
		if (first == 'I') 
			System.out.print("Information Management ");
		  else if (first == 'C') 
			System.out.print("Computer Science ");
		  else if (first == 'A') 
			System.out.print("Accounting ");
		  else
			System.out.print("Invalid entry for major ");
		
		// If/Else to determine what year			
		if (second == '1')
			System.out.print("Freshman");
		  else if (second == '2')
			System.out.print("Sophmore");
		  else if (second == '3')
			System.out.print("Junior");
		  else if (second == '4')
			System.out.print("Senior");
		  else
			System.out.print("Invalid entry for year ");
		
		// Close the input
		input.close();
	}

}
