package javabasic;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Vishal Gupta";
		char[] strArr = str.toCharArray();
		
		System.out.println("Reverse of String <" + str + "> is: ");
		for(int i = strArr.length - 1; i >= 0; i--)
		{
			System.out.print(strArr[i]);
		}

	}

}
