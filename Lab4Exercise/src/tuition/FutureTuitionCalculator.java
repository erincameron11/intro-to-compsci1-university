package tuition;

public class FutureTuitionCalculator {

	public static void main(String[] args) {
		// Initialize variables
		int totalTuition = 0;
		int tuition = 10000;
		int tuitionTenYears = 0;
		
		// Loop through and increase tuition - for a total of 5% per year
		for (int year = 1; year <= 14; year++) {
			tuition += (tuition * 0.05); // Increasing tuition 5% = 0.05 until year 14 since this is where we do our last calculation
		
			// Increases totalTuition if year greater than 10
			// (since it will stop at 14 years from the original for loop, this will get us our 4 years' tuition)
			if (year > 10) {
				totalTuition += tuition;
			}

			// If year equals 10, then assign the value of the tuition to tuitionTenYears
			if (year == 10) {
				tuitionTenYears = tuition;
			}
		
		} 
		
		// Display the tuition cost in 10 years time
		System.out.println("The tuition cost after 10 years will be: $" + tuitionTenYears + " per year");
		
		// Display the total cost of tuitionTotal for 4 years (after the 10th year)
		System.out.println("The total cost for four years' tuition after the tenth year will be: $" + totalTuition);

	}

}
