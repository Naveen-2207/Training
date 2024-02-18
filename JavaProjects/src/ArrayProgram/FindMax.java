package ArrayProgram;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		System.out.println("Enter a num: ");
		Scanner nav = new Scanner(System.in);
		int size = nav.nextInt();
		int[] arr = new int[size];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = nav.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maximum value:" + max);
		System.out.println("Minimum Value:" + min);
		nav.close();

	}

}
