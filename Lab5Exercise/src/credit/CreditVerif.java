package credit;

import java.util.Scanner;

public class CreditVerif {

	// Return true if the credit card is valid
	public static boolean isValid(long number) {
		boolean valid = false; 
		
		if ((getSize(number) >= 13 && getSize(number) <= 16) // CC must be between 13 and 16 digits
			&& (prefixMatched(number, 4) // Visa cards
			|| prefixMatched(number, 5)  // Master cards
			|| prefixMatched(number, 37) // American Express cards
			|| prefixMatched(number, 6)) // Discover cards
			&& ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0)) // Luhn check or Mod 10 check
		
			valid = true;
		 	return valid;
		}
	
	
	// Get the result from step 2
	public static int sumOfDoubleEvenPlace(long number) {
		String n = "" + number;
		int res = 0;
		
		for(int i = getSize(number) - 2; i >= 0; i -= 2) {
			res += getDigit((n.charAt(i) - '0') * 2); 
		}
			System.out.println("The Sum of Double Even Place is: " + res);
			return res;
		}
		
	
	// Return sum of odd-place digits in number
	public static int sumOfOddPlace(long number) {
		String n = "" + number;
		int res = 0;
		
		for(int i = getSize(number) - 1; i >= 0; i -= 2) {
			res += n.charAt(i) - '0';
		}
			System.out.println("The Sum of Odd Place is: " + res);
			return res;
		}
		
	
	// Return true if digit d is a prefix for number
	public static boolean prefixMatched(long number, int d) { 
		if(getPrefix(number, getSize(d)) == d) 
			return true;
		else {
			System.out.println("Prefix match failed");
			return false;
		} 
	}
		
	
	// Return the first k number of digits from number.
	// If the number of digits in number is less than k, return number
	public static long getPrefix (long number, int k) { 
		String s = "" + number;
		return Long.parseLong(s.substring(0, k));
	}
		
	
	// Return this number if it is a single digit, otherwise, return the sum of the 2 digits
	// If the card is divisible by 10 it is valid, if not, it is invalid
	public static int getDigit(int number) {
		return (number <= 9 ? number: (number / 10 + number % 10)); 	
	}
		
	// Return number of digits in d
	public static int getSize(long number) {
		String s = "" + number; 
		return s.length();	
	}
		
	
	// Here is where we print the results and determine if the CC is valid or not based on their input
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter their CC number
		System.out.print("Enter a Credit card number: ");
		String creditNumber = input.next();
		System.out.println("Credit Card Number: " + creditNumber + " is " + (isValid(Long.parseLong(creditNumber)) ? "Valid " : "Not Valid"));
		
		// Close the input
		input.close();
	} 
}
