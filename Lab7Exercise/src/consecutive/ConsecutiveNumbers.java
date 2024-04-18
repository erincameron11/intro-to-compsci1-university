/*    (Pattern recognition: four consecutive equal numbers)
      Write the following method that tests whether a two-dimensional array
      has four consecutive numbers of the same value, either horizontally,
      vertically, or diagonally.
      public static boolean isConsecutiveFour(int[][] values)

      Write a test program that prompts the user to enter the number of
      rows and columns of a two-dimensional array and then the values in
      the array and displays true if the array contains four consecutive numbers
      with the same value. Other- wise, display false.
*/

package consecutive;

import java.util.Scanner;

public class ConsecutiveNumbers {

	// METHOD: true/false if there are four consecutive integers
	public static boolean isConsecutiveFour(int[][] values) {
		  return vertical(values) || horizontal(values) || diagonal(values);
		 }
		 
	// METHOD: Check the array vertically
	public static boolean vertical(int[][] values) {
		  for (int i = 0; i < values[0].length; i++) {
			  int initial = values[0][i];
			  int count = 1;
			  	for (int j = 1; j < values.length; j++) {
			  		if (initial == values[j][i]) {
			  			count++;
			  	} else {
			  		initial = values[j][i];
			  		count = 1;
			  	}
		 
			  		if (count == 4) {
			  			return true;
			  		}
			  	}
		  }
		  return false;
	}
		 
	// METHOD: Check the array horizontally
	public static boolean horizontal(int[][] values) {
		for (int i = 1; i < values.length; i++) {
			  int initial = values[i][0];
			  int count = 1;
			  	for (int j = 1; j < values[i].length; j++) {
			  		if (initial == values[i][j]) {
			  			count++;
			  	} else {
			  		initial = values[i][j];
			  		count = 1;
			  	}
		 
			  		if (count == 4) {
			  			return true;
			  		}
			  	}
		  }
		  return false;
	}
		 
	// METHOD: Check the array diagonally
	public static boolean diagonal(int[][] values) {
		// Traverse the row from upper left to lower right
		for (int i = 0; i < values.length; i++) {
			int initial = values[i][0];
			int count = 1;
				for (int j = i+1, k = 1; j < values.length && k < values[0].length; j++, k++) {
					if (initial == values[j][k]) {
						count++;
				 	} else {
				 		initial = values[j][k];
				 		count = 1;
				 	}
					if (count == 4) {
			 			return true;
			 		}
			 	}
	  }
		 
		// Traverse the column
		for (int i = 0; i < values[0].length; i++) {
			int initial = values[0][i];
			int count = 1;
				for (int j = i+1, k = 1; j < values[0].length && k < values.length; j++, k++) {
			  		if (initial == values[k][j]) {
			  			count++;
			  		} else {
			  			initial = values[k][j];
			  			count = 1;
			  		}
		 
			  		if (count == 4) {
			  			return true;
			  		}
			  	}
		  }
		 
		  // Go through the column from upper right to lower left
		  for (int i = 0; i < values[0].length; i++) {
			  int initial = values[0][i];
			  int count = 1;
			  for (int j = 1, k = i-1; j < values.length && k >= 0; j++, k--) {
				  if (initial == values[j][k]) {
					  count++;
				  } else {
					  initial = values[j][k];
					  count = 1;
				  }
				  if (count == 4) {
					  return true;
				  }
			  }
		  }
		 
		  // Traverse through the row
		  for (int i = 0; i < values.length; i++) {
			  int initial = values[i][values[i].length - 1];
			  int count = 1;
			  	for (int j = i+1, k = values[0].length - 2; j < values.length && k >= 0; j++, k--) {
			  		if (initial == values[j][k]) {
			  			count++;
			  		} else {
			  			initial = values[j][k];
			  			count = 1;
			  		}
			  		if (count == 4) {
			  			return true;
			  		}
			  	}
		  } 
		  return false; 
	}
	
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows and columns: ");
		int[][] n = new int[input.nextInt()][input.nextInt()];
		System.out.println("Enter the values in the array: ");
		 
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = input.nextInt();
			}
		 
		 }
		System.out.println(isConsecutiveFour(n));
		
		// Close the input
		input.close();
	}

}
