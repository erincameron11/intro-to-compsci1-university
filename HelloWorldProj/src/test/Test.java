package test;

public class Test {
	
	

}


/** MIDTERM COSC2006 */
//public static void main(String[] args) {
//	/** MIDTERM */
//	Book[] books;
//	
//	books = new Book[10];
//	
//	int count = 0;
//	while (count <= 4) {
//		books[count] = new Book();
//		count++;
//	}
//
//System.out.println(books[4].getY());
//	
//}



/** MIDTERM COSC2006 recursively calculates the sum of an array */
//public int sum(int myArray[], int total, int count) {
//	
//	// Base Case if array length is 0
//	if (count == 0) {
//		return total;
//	
//	// Else recursively call the function to calculate the sum, by adding
//	} else {
//		
//		total = total + myArray[count - 1];
//		return sum(myArray, total, count - 1);
//		
//	}
//	
//}
//
//public static void main(String[] args) {
//	Test test = new Test();
//	
//	int[] myArray = {2, 1, 5, 4};
//	
//	// Display the result of 14
//	System.out.println(test.sum(myArray, 0, myArray.length));
//}



/** MIDTERM COSC2006 writes string backwards with space between recursively */
//public String upperReverse(String s) {
//	
//	// Base Case
//	if (s.length() < 1) {
//		return s;
//		
//	// Else print out each character backwards with a space between each
//	} else {
//		System.out.print(s.toUpperCase().charAt(s.length() - 1) + " ");
//	    return upperReverse(s.substring(0, s.length() - 1));
//	
//	}
//}
//
//
//public static void main(String[] args) {
//	Test test = new Test();
//	
//	// Test printing backwards
//	System.out.println(test.upperReverse("hello"));
//
//}





//public void remove(int index) throws ListIndexOutOfBoundsException {
//	for(int i = size() - 1; i >= index; i--) {			
//		data[i - 1] = data[i];
//	}
//	data[index] = obj;
//	size()--;
//}



//public void remove(int index) throws ListIndexOutOfBoundsException {
//
//	if (index >= 1 && index <= size()) {
//		
//		// Locate i and remove from the list, shift all other elements down
//		for (int i = index; i <= size(); i++) {
//			list[i - 1] = list[i];
//		}
//		size()--;
//		return list[index]; // Return what was removed from the list
//		
//	} else {
//		// If the index is out of range
//		throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException: Index out of range. Item not removed.");
//	}
//	
//}





//public static String ruler(int length, int count, boolean firstRun) {
//	if (firstRun) {
//		System.out.print(" " + 0);
//		firstRun = false;
//	}
//	
//	if (length == 1) {
//		return " ";
//	} else {
//		int middleHeight = (int)Math.round(Math.log(length) / Math.log(2));  // Calculation of log base e --> log base 2 for middle height
//		int middle = length / 2;
//				
//		// Construct the ruler with the middle point and recursively call the method on the left and right side until lengths = 1
//		return ruler(middle, count, false) + middleHeight + ruler(middle, count, false);
//	}
//}
//
//
//public static String count(int count, int length, int counter) {
//	if (count == length + 1) {
//		return " ";
//	} else {
//		if (counter > 9) {
//			counter = 0;
//		}
//		System.out.print(" " + counter);
//		return count(count + 1, length, counter + 1);
//	}
//}
//
//
//public static void main(String[] args) {
//	
//	// Display ruler 8
//	System.out.print(ruler(8, 0, true));
//	System.out.println(0);
//	System.out.println(count(0, 8, 0) + "\n");
//	
//	
//	// Display ruler 16
//	System.out.print(ruler(16, 0, true));
//	System.out.println(0);
//	System.out.println(count(0, 16, 0));
//	
//	
//	
//}





// SWITCH WITH MISSING CASES
//char classAverage = 'B';
//switch (classAverage) {
//  case 'A': System.out.println("Perfect"); break;
//  case 'B':
//  case 'C': System.out.println("avg"); break;
//  case 'D': System.out.println("Pass"); break;
//  case 'F': System.out.println("fail"); break;
//  default: System.out.println("invalid");
//}
	

// SWITCH WITH NEGATIVE NUMBERS
//int number = 75;
//switch (number){
//  case -35: System.out.println("Hello");
//  default: System.out.println("Good");
//  case 55: case 65: System.out.println("Bye");
//}



//// midterm
//ArrayList<Integer> array = new ArrayList<>();
//
//// Randomly generate 10 arraylist integers
//for (int i = 1; i < 10; i++) {
//	array.add(i);
//}
//
//// Calculate product of values
//int product = 1;
//for (int i = 0; i < array.size(); i++) {
//	product *= array.get(i);
//}
//
//// Display product amount
//System.out.println(product);
//
//}




//// #13 midterm
//public class Test {
//
//	  public static void main(String[] args) {
//	    
//		  A a = new A();
//		  a.method1(3.0);
//		  a.method1(5);
//		  
//		  a.method2(3.0);
//		  a.method2(5);
//	  }
//}
//
//class B {
//	public void method1(double i) {
//		System.out.println(i + 2);
//	}
//	
//	public void method2(double i) {
//		System.out.println(i - 1);
//	}
//	
//	
//}
//
//
//class A extends B {
//	public void method1(double i) {
//		System.out.println(i);;
//	}
//	
//	public void method2(int i) {
//		System.out.println(i + 3);
//	}





//class C{
//
//private int c;
//
//	public void setc(int cc)
//	{c = cc;}
//
//	public int getc()
//	{return c;}
//
//}
//
//class Test{
//
//public static void main(String[] args){
//
//C cucumber;
//
//System.out.println(cucumber);
//
//}
//
//}




		   		
// EXAMPLE OF REFERENCING MULTI-DIMENSIONAL ARRAYS
//	    int[][][] data = {
//		{
//			{1, 2}, 
//			{3, 4}
//		},
//	    {
//			{5, 6}, 
//			{7, 8}
//	    }
//	};
//
//	    System.out.print(data[1][0][0]); 
		  
		  
// EXAMPLE OF REFERENCING TWO DIMENSIONAL ARRAYS
//		  int[][] x = {{1, 2}, {3, 4}, {5, 6}};
//		  
//		  /*
//		   *  1	 2
//		   *  3  4  5
//		   *  5  6  5  9
//		   */
//		 
//		  	System.out.println(x[0].length); // column 1
//		    System.out.println(x[1].length); // column 2
//		    System.out.println(x[2].length); // column 3

		
