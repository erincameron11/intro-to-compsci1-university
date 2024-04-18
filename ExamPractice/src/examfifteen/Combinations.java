/*
 * Create a public class called Combinations. This class has 2 attributes int n 
 * and int k. The class has one zero - arg constructor and a two argument constructor. 
 * The zero arg- constructor calls the 2 -arg constructor to set the value of n to 1 
 * and k to zero. The class has set and get methods to set the value of n and k. 
 * The class has a method int totalCombs() that returns the total combinations using the formula
 * 
 * Following are the headers of the methods:

Combinations(){}

Combinations(int num, int select){}

void setn(int num){}

int getn(){}

void setk(int select){}

int getk(){}

int totalCombs(){}
 */

package examfifteen;

public class Combinations {
		int num = 0;
		int n = 0;
		int k = 0;
	
		Combinations(){
			this(1, 0); // Calls constructor 2
		}

		Combinations(int num, int select){
			this.n = num;
			this.k = select;
		}

		void setn(int num){
			n = num;
		}

		int getn(){
			return n;
		}

		void setk(int select){
			k = select;
		}

		int getk(){
			return k;
		}

		int totalCombs(){
			int fact = 1;

	        for(int i = n; i >= 1; i--) {
	        	fact *= i;
	        }
	        return fact;
		}

	public static void main(String[] args) {  
		// Code to call the methods goes here but was not specified in question that we need it so leaving blank
		
	}

}
