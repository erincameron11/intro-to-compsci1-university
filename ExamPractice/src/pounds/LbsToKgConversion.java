/*
 * (Conversions between pounds and kilograms) Write a class that contains the 
 * following two methods:
 * 
 * Convert from pounds to kilograms
 * public static double poundToKilogram(double pound) 
 * 
 * Convert from kilograms to pounds
 * public static double kilogramToPound(double kilogram)
 * 
 * The formula for the conversion is:
 * pound = 0.453 * kilogram 
 * kilogram = 2.204 * pound
 * 
 * Write a test program that invokes these methods to display the following tables:
 * 
 * Kilograms Pounds | Pounds Kilograms
 * 1 		 2.2    | 20 	 9.09
 * 3 		 6.6 	| 25 	 11.36
 * ...
 * 197 		 433.4  | 510 	 231.82
 * 199 		 437.8  | 515	 234.09
 */

package pounds;

class Conversion {
	
	Conversion() {
		// Default constructor
	}
	
	public static double poundToKilogram(double pound) {
		double kilogram = 2.204 * pound;
		return kilogram;
	}
	
	public static double kilogramToPound(double kilogram) {
		double pound = 0.453 * kilogram;
		return pound;
	}
	
}

public class LbsToKgConversion {

	public static void main(String[] args) {
		
		System.out.println("Kilograms \t\tPounds");
		for (int i = 1; i <= 200; i++) { 
//			Conversion conversion = new Conversion(); // DO NOT NEED TO CREATE AN OBJECT FOR STATIC METHODS
			System.out.println(i + "\t\t\t" + Conversion.kilogramToPound(i)); 
		}
		
		System.out.println("\n\nPounds \t\tKilograms");
		for (int i = 20; i <= 515; i++) { 
//			Conversion conversion = new Conversion(); // DO NOT NEED TO CREATE AN OBJECT FOR STATIC METHODS
			System.out.println(i + "\t\t" + Conversion.poundToKilogram(i)); 
		}
		
		
	}

}
