package javabasic;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, num;
		try {
			a = 10;
			b = 5;
			c = 5;
			num = a / (b - c);
		}
		catch(Exception e)
		{
			System.out.println("Exception : Divide By Zero. Value of Denominator should be greater than Zero.");
		}
	}

}
