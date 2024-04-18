/*
 * (Check password) Some websites impose certain rules for passwords. 
 * Write a method that checks whether a string is a valid password. 
 * Suppose the password rules are as follows:
 * ■■ A password must have at least ten characters. 
 * ■■ A password consists of only letters and digits. 
 * ■■ A password must contain at least three digits.
 * Write a program that prompts the user to enter a password and displays 
 * Valid Password if the rules are followed or Invalid Password otherwise.
 */

package password;

import java.util.Scanner;
import java.lang.Character;

class Verify {
	
	Verify() {
		// Default constructor
	}
	
	// METHOD: Check if there are ten characters in the string
	public static boolean tenCharacters(String pass) {
		boolean tenChar = pass.length() < 10;
		boolean tenCharValidity = false;
		
		if (tenChar) {
			tenCharValidity = false;
		} else {
			tenCharValidity = true;
		}
		return tenCharValidity;
	}
	
	// METHOD: Check if there are three digits in the password
	public static boolean threeDigits(String pass) {		
	    char[] passChar = pass.toCharArray();
	    int count = 0;
	    boolean digitValidity = false;
		
	    // Check if each character is a digit and add to counter if so
	    for (char i : passChar) {
        	if (Character.isDigit(i)) {
        		count++;
        	}
        
        	// If/Else to return valid or invalid
	        if (count < 3) {
	        	digitValidity = false;
	        } else {
	        	digitValidity = true;
	        }
        }
        return digitValidity;
	}
	
	// METHOD: Check if the password entered contains only letters or digits
	public static boolean charChecker(String pass) {
		boolean charValidity = false;
		
		int count = 0;
		for(int i = 0; i < pass.length(); i++){  
			char c = pass.charAt(i);
			
			if (Character.isLetterOrDigit(c))
				count++;
			
			
			if (count == 0) 
				charValidity = false;
			else 
				charValidity = true;
		}   
		return charValidity;
	}
	
}

public class CheckPassword {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a password
		System.out.print("Enter your 10 digit password: ");
		String pass = input.nextLine();
		
		// Create an object
//		Verify verify = new Verify(); OBJECT NOT REQUIRED WHEN ACCESSING A STATIC METHOD
		
		if (Verify.tenCharacters(pass) == true
			&& Verify.threeDigits(pass) == true
			&& Verify.charChecker(pass) == true)
			System.out.print("Valid Password");
		else
			System.out.print("Invalid Password");
		
		// Close the input
		input.close();
	}

}
