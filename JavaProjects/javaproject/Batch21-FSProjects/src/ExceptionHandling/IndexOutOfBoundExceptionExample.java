package ExceptionHandling;

public class IndexOutOfBoundExceptionExample {
	public static void main(String[] args) {
		try {
			int[] arr = new int[] { 1, 2, 3, 4, 5 };
			System.out.println(arr[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array index out of bound");
		}
		
		try {
			String s = new String("Hello");
			System.out.println(s.charAt(7));
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("String index out of bound");
		}
		System.out.println("Program terminated");

	}

}
