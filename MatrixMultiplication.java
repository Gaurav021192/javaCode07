package javabasic;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of first matrix");
		int m = in.nextInt();
		int n = in.nextInt();
		int[][] A = new int[m][n];
		System.out.println("Enter the elements of first matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = in.nextInt(); 
				} 
			} 
		
		System.out.println("Enter the number of rows and columns of the second matrix");
		int o = in.nextInt();
		int p = in.nextInt();
		
		// safety net - check order or each matrix, whether eligible for // multiplication or not
		
		while (n != o) {
			System.out.printf("Matrices with entered orders can't be multiplied with each other, " + "columnsOfFirstMatrix [%d] != rowsOfSecondMatrix [%d] %n", n, o);
			System.out.println("Enter the number of rows and columns of second matrix");
			o = in.nextInt();
			p = in.nextInt();
		} 
		
		int[][] B = new int[m][p];
		System.out.println("Enter numbers of second matrix");
		for (int i = 0; i < o; i++) {
			for (int j = 0; j < p; j++) {
				B[i][j] = in.nextInt(); 
				} 
			}
		
		// calculating product of two matrices in Java
		
		int[][] product = product(A, B);
		System.out.println("Product of entered matrices:-");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < p; j++) {
				System.out.printf("%d ", product[i][j]); 
				} 
			System.out.printf("%n"); 
			} 
		in.close();
	}

	public static int[][] product(int[][] matrix1, int[][] matrix2) {
		int columnsOfFirstMatrix = matrix1[0].length;
		int rowsOfSecondMatrix = matrix2.length;
		if (columnsOfFirstMatrix != rowsOfSecondMatrix) {
			throw new IllegalArgumentException(String.format("Can't multiply matrices, columns of first matrix" + " %d is not equal to rows of second matrix %d", columnsOfFirstMatrix, rowsOfSecondMatrix)); 
			} 
		int rowsOfFirstMatrix = matrix1.length; 
		int columnsofSecondMatrix = matrix2[0].length; 
		int[][] C = new int[rowsOfFirstMatrix][columnsofSecondMatrix];
		for (int i = 0; i < rowsOfFirstMatrix; i++) {
			for (int j = 0; j < columnsofSecondMatrix; j++) {
				int sum = 0; for (int k = 0; k < rowsOfSecondMatrix; k++) {
					sum = sum + matrix1[i][k] * matrix2[k][j]; } C[i][j] = sum; 
					} 
			} 
		return C; 
		}
}
