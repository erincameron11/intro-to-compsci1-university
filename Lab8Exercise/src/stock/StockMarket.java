package stock;

class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	// Default constructor
	Stock() {
		symbol = "ORCL";
		name = "Oracle Corporation";
	}
	
	void getChangePercent(double previousClosingPrice, double currentPrice) {
		// Set values
		this.previousClosingPrice = previousClosingPrice;
		this.currentPrice = currentPrice;
		
		System.out.println("The price-change percentage is: " + (((currentPrice - previousClosingPrice) / previousClosingPrice) * 100) + " %");
	}
}

public class StockMarket {

	public static void main(String[] args) {
		// A constructor is called
		Stock obj = new Stock();
		
		// Call on getChangePercent() object
		obj.getChangePercent(34.5, 34.35);
	}

}
