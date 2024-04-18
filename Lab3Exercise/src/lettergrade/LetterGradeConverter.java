package lettergrade;

import java.util.Scanner;

public class LetterGradeConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a letter grade
		System.out.print("Enter a letter grade: ");
		String grade = input.next();
		
		// Convert string to char and convert entries to Upper Case
		char chGrade = grade.charAt(0);
		char chGradeUpper = Character.toUpperCase(chGrade);
		
		switch (chGradeUpper) {
			case 'A': System.out.print("The numeric value for A is " + 4);
				      break;
			case 'B': System.out.print("The numeric value for B is " + 3);
					  break;
			case 'C': System.out.print("The numeric value for C is " + 2);
		      		  break;
			case 'D': System.out.print("The numeric value for D is " + 1);
			  		  break;
			case 'F': System.out.print("The numeric value for F is " + 0);
	  		  		  break;
	  		default: System.out.print("Invalid grade");
	  				  break;
		}
		
		// Close the input
		input.close();
	}

}









// INSTEAD OF SWITCH THIS IS ALSO AN OPTION BUT LONGER
//if (chGradeUpper == 'A') {
//	System.out.print("The numeric value for " + chGradeUpper + " is " + a);
//} else if (chGradeUpper == 'B') {
//	System.out.print("The numeric value for " + chGradeUpper + " is " + b);
//} else if (chGradeUpper == 'C') {
//	System.out.print("The numeric value for " + chGradeUpper + " is " + c);
//} else if (chGradeUpper == 'D') {
//	System.out.print("The numeric value for " + chGradeUpper + " is " + d);
//} else if (chGradeUpper == 'F') {
//	System.out.print("The numeric value for " + chGradeUpper + " is " + f);
//} else {
//	System.out.print("Invalid grade");
//}