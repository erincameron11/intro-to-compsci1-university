package pi;

public class CalculatePi {

	public static void main(String[] args) {
		// Initialize variables
		double p = 0;
		  
		// Loop through and print out pi at i = 10000, i = 20000 and i = 100000 values
		for (int i = 1; i <= 100000; i++) {
			 // Formula to calculate pi = 4 * (1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + ... + (Math.pow(-1, (i + 1)) / (2 * i - 1)) 
			 p += Math.pow(-1, i + 1) / (2 * i - 1);
			 
			 if (i == 10000) {
				 System.out.println("Pi where i = 10000 equals " + p * 4);
			 } else if (i == 20000) {
			 	 System.out.println("Pi where i = 20000 equals " + p * 4);
			 } else if (i == 100000) {
			 	 System.out.println("Pi where i = 100000 equals " + p * 4);
		 	}
		 
		 }
		
	}

}
