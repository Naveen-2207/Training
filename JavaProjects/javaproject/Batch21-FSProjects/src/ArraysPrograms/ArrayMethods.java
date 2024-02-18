package ArraysPrograms;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		Arrays.asList(arr);
		System.out.println("Binary search method: " + Arrays.binarySearch(arr, 1));
		System.out.println("Binary search using fromindex and toindex" + Arrays.binarySearch(arr, 1, 5, 7));
		System.out.println("Compare Method: " + Arrays.compare(arr, arr1));
		System.out.println("Equals method: " + Arrays.equals(arr, arr1));
		

		int[] arr2 = Arrays.copyOf(arr1, 3);
		System.out.println("Copy of: " + Arrays.toString(arr2));

		int[] arr3 = Arrays.copyOfRange(arr1, 1, 5);
		System.out.println("Copy of range: " + Arrays.toString(arr3));

		int[][] matrix = new int[][] { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

		int[][] matrix1 = new int[][] { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

//		System.out.println("Compare Method: " + Arrays.compare(matrix, matrix1));

		System.out.println("Equals method for 2d array: " + Arrays.deepEquals(matrix, matrix1));
		System.out.println("to string method: " + Arrays.deepToString(matrix));

		System.out.println("Hash code: " + Arrays.hashCode(arr1));
		System.out.println("Hash code: " + Arrays.hashCode(arr2));

		System.out.println("Hash code: " + Arrays.deepHashCode(matrix));

		int[] arr4 = new int[] { 5, 9, 7, 1, 2 };
		System.out.println(Arrays.toString(arr4));
		Arrays.sort(arr4, 2, 4);
		System.out.println(Arrays.toString(arr4));
		
		int[] arrNew = new int[]{1,2,3,4,5};
		int[] arrNew1 = new int[]{1,2,3,8,4,5};
		System.out.println("Array mismatch: " + Arrays.mismatch(arrNew, arrNew1)); //
	}

}
