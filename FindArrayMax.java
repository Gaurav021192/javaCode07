package javabasic;

import java.util.ArrayList;
import java.util.Scanner;

public class FindArrayMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Scanner inner = new Scanner(System.in);
        int n;
        n = inner.nextInt();*/
        int arr[] = {12, 23, 34, 23};
        int max = 0;
        ArrayList<Integer> arrList = new ArrayList<Integer>();
     
        // Insertion of data in one-dimensional array of length n.
        /*for(int i = 0; i < n; i++){
            arr[i] = inner.nextInt();
        }*/
        
        for(int i = 0; i < arr.length; i++){
            arrList.add(arr[i]);
        }
        // Finding maximum value in array with initial max value as first value.
        max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("Maximum Value from array" + arrList + " is " + max);

	}

}
