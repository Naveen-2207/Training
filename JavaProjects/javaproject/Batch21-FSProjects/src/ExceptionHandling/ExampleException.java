package ExceptionHandling;

public class ExampleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 5;
			String s = null;
			int b = 0;
			System.out.println(s.charAt(7) + a/b );
		}catch (ArithmeticException e) {
			System.err.println(e);
		}catch (NullPointerException e) {
			System.err.println(e);
		}catch (Exception e) {
			System.err.println(e);
		}
		System.out.println("Program completed");
	}

}
