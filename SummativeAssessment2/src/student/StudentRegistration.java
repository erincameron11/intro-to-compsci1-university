package student;

import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a student name, student number, semester number, and CGPA
		System.out.print("Enter the following information followed by spaces: "
						  + "First Name, Student Number, Semester Number, and CGPA: ");
		String name = input.next();
		final int stuNumber = input.nextInt();
		int semester = input.nextInt();
		float gradePointAv = input.nextFloat();
	
		// Ensure than semester is always positive, and print out results, else inform user of invalid semester number
		if (semester > 0) {
			System.out.printf("%16s %12d %4d %4.3f", name, stuNumber, semester, gradePointAv);
		} else {
			System.out.print("Sorry, you have entered an invalid semester number. Try again!");
		}
		
		// Close the input
		input.close();
	}

}
