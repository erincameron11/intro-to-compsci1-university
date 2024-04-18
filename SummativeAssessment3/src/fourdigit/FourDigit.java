package fourdigit;

import java.util.Scanner;

public class FourDigit {

	// METHOD: Determine if the number is a prime number
	public static boolean primeNum(int number) {
	    boolean prime = false;
	    
	    for (int i = 2; i <= number / 2; ++i) {
	      // Condition for non-prime number
	      if (number % i == 0) {
	        prime = true;
	        break;
	      }
	    }

	    if (!prime) {
	      System.out.println(number + " IS a prime number");
	    } else {
	      System.out.println(number + " is NOT a prime number");
	    }
	    return prime;   
	}
	
	// METHOD: main and to determine if digits are repeated
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a four digit integer
		System.out.print("Enter a four digit number without decimals: ");
		int digits = input.nextInt();
		
		// Close the input
		input.close();
		
		
		// Determine if the number has any repeated digits, and if so, what are those digits and how many
		// Initialize variables
		boolean repeat = primeNum(digits);
		int digit1;
		int digit2; 
		int digit3;
		int digit4;
		int count1 = 0;
		int count2 = 0; 
		
		// If/Else statement to determine what digits repeat/if any
	    if(repeat == false) {	    
	    	digit1 = digits % 10;
	    	digit2 = (digits / 10) % 10;
	    
			if(digit1 == digit2)
			    count1++;
			    digit3 = (digits / 100) % 10;
			
			if(digit1 == digit3)
			    count1++; 
			else if(digit2 == digit3)
			    count2++; 
			    digit4 = (digits / 1000);
			    
			if(digit1 == digit4)
			    	count1++; 
			else if(digit2 == digit4)
			    	count2++;
	    
			if(count1 > 0) {
			    System.out.println("The repeated digit is " + digit1 + " and it is repeated " + (count1 + 1) + " times");
			} else if (digit2 == digit3 || digit2 == digit4) {
			    	System.out.println("The repeated digit is " + digit2 + " and it is repeated " + (count2 + 1) + " times");
			} else if(digit3 == digit4) {
			    	System.out.println("The repeated digit is " + digit3 + " and it is repeated two times");
			} else {
			    	System.out.println("None of the digits are repeated");  
			}
	    }
	
	
	}
	
	}
