package sin;

import java.util.Scanner;

public class SinChecker {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter their SSN
		System.out.print("Enter your SSN (XXX-XX-XXXX): ");
		String ssn = input.next();

		// Use if/else to determine if the format of the SSN provided is valid or invalid
	    if (
	    	   (ssn.length() == 11) 
			&& (ssn.charAt(0) <= '9') 
			&& (ssn.charAt(0) >= '0') 
			&& (Character.isDigit(ssn.charAt(1))) 
			&& (Character.isDigit(ssn.charAt(2))) 
			&& (ssn.charAt(3) == '-') 
			&& (Character.isDigit(ssn.charAt(4))) 
			&& (Character.isDigit(ssn.charAt(5))) 
			&& (ssn.charAt(6) == '-') 
			&& (Character.isDigit(ssn.charAt(7))) 
			&& (Character.isDigit(ssn.charAt(8))) 
			&& (Character.isDigit(ssn.charAt(9))) 
			&& (Character.isDigit(ssn.charAt(10)))
			)
	      System.out.println(ssn + " is a valid social security number");
	    else
	      System.out.println(ssn + " is an invalid social security number");
		
		// Close the input
		input.close();
	}

}
