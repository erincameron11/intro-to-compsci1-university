package examfive;

class BigClass{

	private double decimalNo;

	public void setDecimalNo( double d){
		decimalNo = d;
		}

}

public class MyClass{


	public static void main(String[] args){

		BigClass b = new BigClass();

		b.setDecimalNo(20.5);

	}

}