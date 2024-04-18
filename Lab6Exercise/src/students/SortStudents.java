package students;

import java.util.Scanner;

public class SortStudents {
	
	// METHOD: Sort a string and integer array in decreasing order
	public static void sortDecreasing(String[] str, int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			int max = numbers[i];
			int maxIndex = i;
			String temp;

			// Find the minimum in the list[i..nums.length - 1]
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] > max) {
					max = numbers[j];
					maxIndex = j;
				}
			}
			
			if (maxIndex != i) {
				// Switch the string array
				temp = str[i];
				str[i] = str[maxIndex];
				str[maxIndex] = temp;

				// Switch the integer array
				numbers[maxIndex] = numbers[i];
				numbers[i] = max;
			}
		
		}
		
	}

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of students
		System.out.print("Enter the number of students: ");
		String[] students = new String[input.nextInt()];
		int[] scores = new int[students.length];

		// Prompt the user to enter each students' names and their scores
		System.out.println("Enter the name and score for each student:");
		for (int i = 0; i < students.length; i++) {
			System.out.print("Student " + (i + 1) + " name: ");
			students[i] = input.next();
			System.out.print("Score: ");
			scores[i] = input.nextInt();
		}

		// Sort student names in decreasing order of their scores
		sortDecreasing(students, scores);

		// Display student name in decreasing order of their scores
		for (String e: students) {
			System.out.println(e);
		}
		
		// Close the input
		input.close();
	}

}
