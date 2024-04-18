package finance;

import java.util.Scanner;
import java.lang.Math;

public class InvestmentCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		
		System.out.print("Enter annual interest rate in percentage: ");
		double monthlyInterestRate = 1 + (input.nextDouble() / 1200);
	
		
		System.out.print("Enter number of years: ");
		double numberOfYears = input.nextDouble() * 12;
	
		
		double interestRate = Math.pow(monthlyInterestRate, numberOfYears);
		
		double futureInvestmentValue = investmentAmount * interestRate;
		
		System.out.print("Accumulated value is: " + String.format("%.2f", futureInvestmentValue));
		
		input.close();
		
	}

}
