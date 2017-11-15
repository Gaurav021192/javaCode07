package javabasic;

import java.util.ArrayList;
import java.util.Scanner;

public class FindArrayMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        int arr[] = {12, 23, 34, 23, 95};
        int max = 0;
		
        // Finding maximum value in array with initial max value as first value.
        max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("Maximum Value from array is " + max);

	}

}
