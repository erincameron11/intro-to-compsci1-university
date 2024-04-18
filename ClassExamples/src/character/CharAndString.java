package character;

import java.util.Scanner;

public class CharAndString {

	public static void main(String[] args) {
		// TODO Define character data type
		Scanner input = new Scanner(System.in);
		
		// Initialize variables
		char c = 'H';
		String s = "Happy";
		String t;
		float f = 1.57f;
		
		System.out.println(c);
		System.out.println(s);
		System.out.print("Enter a word: ");
		t = input.next();
		
		System.out.print("You typed: " + t);
		
		input.close();
	}

}
