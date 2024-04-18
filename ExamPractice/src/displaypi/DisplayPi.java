/*
 * Write a program that displays the result of 
 * 4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11))
 * and 4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + (1/13))
 * Use 1.0 instead of 1 in your program
 */

package displaypi;

public class DisplayPi {

	public static void main(String[] args) {
		// Initialize variables and calculate value
		double pi = 4.0 * (1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0));
		double pi2 = 4.0 * (1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0) + (1.0/13.0));
		
		// Display the results
		System.out.println(pi);
		System.out.print(pi2);

	}

}
