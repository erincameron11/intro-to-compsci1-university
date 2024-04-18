/*
 * (Financial application: loan amortization schedule) The monthly payment 
 * for a given loan pays the principal and the interest. The monthly interest 
 * is computed by multiplying the monthly interest rate and the balance 
 * (the remaining principal). The principal paid for the month is therefore the 
 * monthly payment minus the monthly interest. Write a program that lets the 
 * user enter the loan amount, number of years, and interest rate then displays 
 * the amortization schedule for the loan.
 * 
 * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12))
 * double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
 * double totalPayment = monthlyPayment * numberOfYears * 12;
 */

package loan;

import java.util.Scanner;

public class LoanAmortization {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter values
		System.out.print("Enter loan amount: ");
		double loan = input.nextInt();
		System.out.print("Enter number of years: ");
		double numberOfYears = input.nextInt();
		System.out.print("Enter annual interest rate: ");
		double interestRate = input.nextInt();
		
		// Calculate values
	
		/* The monthly payment = principal and the interest 
		 * The monthly interest = monthly interest rate * balance (the remaining principal)
		 * The principal paid for the month = monthly payment - the monthly interest
		 */
		 
		double monthlyInterestRate = interestRate / 1200;
		double monthlyPayment = loan * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		double balance = totalPayment - monthlyPayment;
		double principal = 0;
		
		System.out.println("Monthly Payment: " + monthlyPayment);
		System.out.println("Total Payment: " + totalPayment);
		
		System.out.println("Payment# \tInterest \t\t\tPrincipal \t\t\tBalance");
		for (int i = 1; i <= numberOfYears * 12; i++) { 
			double interest = monthlyInterestRate * balance; 
			principal = monthlyPayment - interest;
			balance -= principal; 
			System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance); 
		}
		
		

	// Close the input
	input.close();
}
}
