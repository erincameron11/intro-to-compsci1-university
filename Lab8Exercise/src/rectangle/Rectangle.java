package rectangle;

class Shape {
	double width, height;
	double a;
	double p;
	
	// Default constructor
	Shape() {
		// Default values for width and height are 1
		width = 1;
		height = 1;
	}
	
	Shape(double height, double width){
		this.width = width;
		this.height = height;
	}
	
	// Returns the area of the rectangle
	public double getArea() {
		return a = width * height;
	}
	
	// Returns the perimeter of the rectangle
	public double getPerimeter() {
		return p = 2 * (width + height);
	}
	
}

public class Rectangle {

	public static void main(String[] args) {
		// Rectangle 1 - call on objects for different height and width arguments
		Shape rect1 = new Shape(40.0, 4.0); // A constructor is called
		System.out.print("For a rectangle with a height of 40 and width of 4: \nArea = " 
						+ rect1.getArea() + " \nPerimeter = " + rect1.getPerimeter());

		// Rectangle 2 - call on objects for different height and width arguments
		Shape rect2 = new Shape(35.9, 3.5); // A constructor is called
		System.out.print("\n\nFor a rectangle with a height of 35.9 and width of 3.5: \nArea = " 
						+ rect2.getArea() + " \nPerimeter = " + rect2.getPerimeter());
		
	}

}
