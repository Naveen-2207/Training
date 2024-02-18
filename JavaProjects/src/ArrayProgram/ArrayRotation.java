package ArrayProgram;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		System.out.println("Enter a num: ");
		Scanner nav = new Scanner(System.in);
		int size = nav.nextInt();
		int[][] arr = new int[size][size];
		System.out.print("Enter the matrix values: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr[i][j] = nav.nextInt();
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Enter the Rotation :");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j <size; j++) {
				arr[j][i] = arr[i][j];
			}
		}
		for (int i = 0; i < size; i++) {
			for (int j = 2; j >= 0; j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		nav.close();

	}

}
