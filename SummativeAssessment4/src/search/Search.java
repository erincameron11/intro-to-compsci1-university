/* 
 * Write a program that uses methods that implement (a) binary search (b) linear search
 * on an array of integers. The program must print the number of iterations in which
 * the item was found.
 */

package search;

class LinearSearch {
	// Initialize variable
	int key;
	// Initialize array of integers
	int[] array = {-2, 0, 1, 4, 4, 5, 7, 2, 6, 23, 9, 6, 7, 8, -5, 45, 32, 22, 1, 8};
			
	LinearSearch(int[] array, int key) {
		this.key = key;
	}
	
	public int getLinear() {
		for(int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + " \n"); // Display the iterations
			if(key == array[i])
				return i;
			}
		return -1;
		}
	}


class BinarySearch {
	// Initialize variables
	int key;
	int low = 0;
	
	// Initialize array of integers
	int[] array = {-5, -2, 0, 1, 1, 2, 4, 4, 5, 6, 6, 7, 7, 8, 8, 9, 22, 23, 32, 45}; // Sorted
	
	BinarySearch(int[] array, int key) {
		this.key = key;
	}
	
	public int getBinary() {
		int high = array.length - 1;
		int count = 1;
		
		while (high >= low) {
			System.out.print((count++) + " \n");
			int mid = (low + high) / 2;
			if (key < array[mid])
				high = mid - 1;
			else if (key == array[mid])
				return mid; 
			else
				low = mid + 1;
			}
		return -low - 1; // Key not found
	}
}

public class Search {

	public static void main(String[] args) {
		// Initialize array of integers
		int[] array = {-5, -2, 0, 1, 1, 2, 4, 4, 5, 6, 6, 7, 7, 8, 8, 9, 22, 23, 32, 45};
		
		// Linear search on array
		LinearSearch lin = new LinearSearch(array, 23);
		System.out.print("The number above is the number of iterations. \nLINEAR: The index for key 23 is " + lin.getLinear() + "\n\n");
		
		// Binary search on array
		BinarySearch bin = new BinarySearch(array, 23);
		System.out.print("The number above is the number of iterations. \nBINARY: The index for key 23 is " + bin.getBinary());

	}

}
