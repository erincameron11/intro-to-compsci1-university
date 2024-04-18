package months;

import java.util.Scanner;

public class DaysPerMonthCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Initialize variable
		int numberOfDaysInMonth;
		
		// Prompt user to enter a month
		System.out.print("Enter a numerical month (between 1 - 12): ");
		int month = input.nextInt();
		
		// Prompt user to enter a year
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		// Switch statement
		switch (month % 13) {
			case 1: numberOfDaysInMonth = 31;
					System.out.println("January " + year + " equals " + numberOfDaysInMonth + " days in the month");
					break;
			case 2: if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
						numberOfDaysInMonth = 29;
					}
					else {
						numberOfDaysInMonth = 28;
					}
					System.out.println("February " + year + " equals " + numberOfDaysInMonth + " days in the month");
					break;
			case 3: numberOfDaysInMonth = 31;
					System.out.println("March " + year + " equals " + numberOfDaysInMonth + " days in the month");
					break;
			case 4: numberOfDaysInMonth = 30;
					System.out.println("April " + year + " equals " + numberOfDaysInMonth + " days in the month");
					break;
			case 5: numberOfDaysInMonth = 31;
					System.out.println("May " + year + " equals " + numberOfDaysInMonth + " days in the month");
					break;
			case 6: numberOfDaysInMonth = 30;
					System.out.println("June " + year + " equals " + numberOfDaysInMonth + " days in the month");
					break;
			case 7: numberOfDaysInMonth = 31;
					System.out.println("July " + year + " equals " + numberOfDaysInMonth + " days in the month");
					break;
			case 8: numberOfDaysInMonth = 31;
					System.out.println("August " + year + " equals " + numberOfDaysInMonth + " days in the month");
					break;
			case 9: numberOfDaysInMonth = 30;
					System.out.println("September " + year + " equals " + numberOfDaysInMonth + " days in the month");
					break;
			case 10: numberOfDaysInMonth = 31;
					 System.out.println("October " + year + " equals " + numberOfDaysInMonth + " days in the month");
					 break;
			case 11: numberOfDaysInMonth = 30;
					 System.out.println("November " + year + " equals " + numberOfDaysInMonth + " days in the month");
					 break;
			case 12: numberOfDaysInMonth = 31;
					 System.out.println("December " + year + " equals " + numberOfDaysInMonth + " days in the month");
					 break;
			default: System.out.print("Error: invalid month entered.");
					 System.exit(1);
					 break;
		}

		// Close the input
		input.close();
	}

}
