package ArraysPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayProgramToFindMax {

	public static void main(String[] args) {
		// Input: 
		// 5              // size
		// 3 1 2 5 4      // array elements
		// Output:
		// 5 1            // max and min value in the array
		
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = obj.nextInt();
		int[] array = new int[size];
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		System.out.println("Enter array elements: ");
		for (int i = 0;i< size;i++) {
			array[i] = obj.nextInt();
			if (array[i] > max) {
				max = array[i];
			}
			
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Maximum value in an array: " + max);
		System.out.println("Minimum value in an array: " + min);
	}
}



