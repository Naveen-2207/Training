package ArrayProgram;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		System.out.println("Enter a num: ");
		Scanner nav = new Scanner(System.in);
		int size = nav.nextInt();
		int[][] arr = new int[size][size];
		int[][] arr1 = new int[size][size];
		System.out.println("Enter the matrix values:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr[i][j] = nav.nextInt();
			}
		}
		System.out.println("Enter the matrix values1:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr1[i][j] = nav.nextInt();
			}
		}
		System.out.println("sum of the matrix values:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(arr[i][j] + arr1[i][j] + " ");
			}
			System.out.println();
			nav.close();
		}
	}

}
