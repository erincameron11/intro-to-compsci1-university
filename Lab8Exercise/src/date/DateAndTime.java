package date;

class Date {
	
}

public class DateAndTime {

	public static void main(String[] args) {
		// Create a Date object
		java.util.Date date = new java.util.Date();
		long i = 0;
		
		// Set the Date object's elapsed time to specific values using for loop
	    for (i = 1000; i < 100000000000L; i *= 10) {
	        date.setTime(i);

			// Display date and time for each  using toString() method
	        System.out.println("Time elapsed: " + i + " milliseconds");
	        System.out.println("Date and time: " + date.toString());
	    }
	
	}

}
