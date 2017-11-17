package javabasic;

import java.util.Scanner;

public class NumberFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number to find the factorial: ");
		int factVal = in.nextInt();
		int fact = factorial(factVal);
		System.out.println("Factorial of Number " + factVal + " is: " + fact);	
	}
	
	public static int factorial(int Num) {
		
		if(Num > 1) {
			return Num * factorial(Num - 1);
		}
		else {
			return 1;
		}
	}

}
