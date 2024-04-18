package converttime;

import java.util.Scanner;

public class ConvertMinutesToHours {

	public static void main(String[] args) {
		// TODO Write a program to convert minutes to hours
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input 
		System.out.print("Enter an integer for minutes: "); 
		int minutes = input.nextInt();
		int hours = minutes / 60; 
		
		// Find minutes in seconds 
		int remainingMinutes = minutes % 60; 
		
		// Seconds remaining 
		System.out.println(minutes + " minutes is " + hours + " hours and " + remainingMinutes + " minutes");

		// Close input
		input.close();
	}

}
