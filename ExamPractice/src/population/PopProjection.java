/*
 * (Population projection) The U.S. Census Bureau projects population based on the 
 * following assumptions:
	One birth every 7 seconds
	One death every 13 seconds
	One new immigrant every 45 seconds
   Write a program to display the population for each of the next five years. 
   Assume that the current population is 312,032,486, and one year has 365 days. 
   Hint: In Java, if two integers perform division, the result is an integer. 
   The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) 
   and 10 / 4 is 2 (not 2.5). To get an accurate result with the fractional part, 
   one of the values involved in the division must be a number with a decimal point. 
   For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */

package population;

public class PopProjection {

	public static void main(String[] args) {
		// Initialize variables
		double currentPop = 312032486;
		double year = 365.0;
		double birth = 7; // in seconds
		double death = 13; // in seconds
		double immigrant = 45; // in seconds
		
		// Calculate births / deaths / immigrants per year
		double birthYr = ((((60.0 / birth) * 60.0) * 24.0) * year);
		double deathYr = ((((60.0 / death) * 60.0) * 24.0) * year);
		double immigrantYr = ((((60.0 / immigrant) * 60.0) * 24.0) * year);
		
		// For loop: calculate and display the population for each of the next 5 years
		for (int i = 0; i < 5; i++) {
			currentPop += birthYr + immigrantYr - deathYr;
			System.out.println("The current population for year " + (i + 1) + " is: " + currentPop);
		}
		
	}
	
}
