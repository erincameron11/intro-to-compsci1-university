package error;

// If Scanner is not imported, "Scanner cannot be resolved to a type" error
// If input is not closed at the end (ie: "input.close()"), then we see a "Resource leak: 'input' is never closed" Warning
// If Scanner is imported, "Resource leak: 'input' is never closed" warning
// It is a Logic Error - the result of a % b is incorrect ??? No it's not

import java.util.Scanner;

public class CodeErrorIdentification {

	public static void main(String[] args) {
		int a,b;
		Scanner input= new Scanner(System.in);
		System.out.println (" Enter value of a:");
		a=input.nextInt();
		System.out.println(" Enter value of b"); 
		b=input.nextInt(); 
		System.out.println(a%b);
	}

}


//public static void main(String[] args) {
//int a,b;
//Scanner input= new Scanner(System.in); 
//System.out.println (" Enter value of a:"); 
//a=input.nextInt();
//System.out.println(" Enter value of b"); 
//b=input.nextInt(); 
//System.out.println(a%b);
//
//}