package ArraysPrograms;

import java.util.Scanner;

public class TwoDimensionalArrayProgram {

	public static void main(String[] args) {
		// 2-D Array Program
		// Input:
		// 3
		// 1 2 3 4 5 6 7 8 9 // matrix 1
		// 9 8 7 6 5 4 3 2 1 // matrix 2
		// Output:
		// 10 10 10 // sum of matrix1 and matrix 2
		// 10 10 10
		// 10 10 10

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the rows and columns of a matrix: ");
		int row = obj.nextInt();
		int col = obj.nextInt();

		int[][] array1 = new int[row][col];
		int[][] array2 = new int[row][col];
		
		System.out.println("Enter matrix value 1: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array1[i][j] = obj.nextInt();
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("Enter matrix value 2: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array2[i][j] = obj.nextInt();
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
//		int[][] sum = new int[size][size];
		
		System.out.println("Result matrix: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
//				sum[i][j] = array1[i][j] + array2[i][j];
				System.out.print(array1[i][j] + array2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
