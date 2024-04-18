package point;

import java.util.Scanner;

public class CirclePoint {
	
	public static boolean circlePointCheck(int x, int y, int r, int h) {
		int checkPoint = (x - h) * (x - h) + (y - h) * (y - h);
		return r * r == checkPoint ? true : false;
	}

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Initialize variables
		int radius = 2;
		int height = 5;
		
		// Prompt the user to enter x1 and y1 coordinates
		System.out.print("Enter an integer for the value x: ");
		int x1 = input.nextInt();
		
		System.out.print("Enter an integer for the value y: ");
		int y1 = input.nextInt();
		
		boolean output = circlePointCheck(x1, y1, radius, height);
			if (output == true) {
				System.out.print("The point is within the circle");
			} else {
				System.out.print("The point is outside of the circle");
			}
			
		// Close the input
		input.close();

	}

}
