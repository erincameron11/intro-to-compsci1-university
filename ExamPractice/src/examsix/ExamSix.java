/*
 * PIVOT
 * This method should select the middle element of the list as pivot. 
 * The method returns pivot and rearranges the list such that all elements that 
 * are less than pivot, are placed at indices lower than pivot. 
 * Elements that are greater than pivot are stored at higher indices. 
 * The method prints the list after re-arranging the elements.
 */

package examsix;

import java.util.Scanner;

public class ExamSix {
	
	public static void partition(int [] list){
		// Select middle element
		int middle = list[list.length / 2];
		System.out.println("\nThe middle element is: " + middle);
		
		// Initialize variables
		int pivot = list[0];
		int pivotSpot = 0;
		int highElements = list.length - 1;
		
		// Rearrange list: Use a while loop to loop through the elements of the array
		while (pivotSpot < highElements) {
			// Nested If/Else to determine where the elements belong (beginning or end)
			// IF to move the item to the left of the array (beginning)
			if(pivot > list[pivotSpot + 1]) {
			    list[pivotSpot] = list[pivotSpot + 1];
			    list[pivotSpot + 1] = pivot;
			    pivotSpot++;
			   // ELSE to instead move the item towards the right side (end) of the array
			   } else {
			    int temp = list[highElements];
			    list[highElements]=list[pivotSpot + 1];
			    list[pivotSpot + 1] = temp;
			    highElements--;
			   }
		}
		
		// Print out the list after partition
		System.out.println("After the partition has run the list is: ");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		
	}

	public static void main(String[] args) {
		// Prompt user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list size: ");
		int[] list = new int[input.nextInt()];
		System.out.println("Enter a list of numbers: ");
		// Initialize list
		for (int i = 0; i < list.length; i++) {
			   list[i] = input.nextInt();
		}
		
		System.out.println("The list before the partition: ");
		// Print out the list before partition
		for (int i = 0; i < list.length; i++) { 
			System.out.print(list[i] + " ");
		}
		
		partition(list);
		
		// Close the input
		input.close();
	}

}


