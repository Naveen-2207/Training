package ExceptionHandling;

public class IndexOutOfFoundExample {

	public static void main(String[] args) {
		try {
			int[] arr = new int[] {1,2,3,4,5,6,7};
			System.out.println(arr[9]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		}
		try {
			String s = new String("Navee");   
			System.out.println(s.charAt(7));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String index out of bound");
		}
		System.out.println("Program terminated");
	}

}
