package ExceptionHandling;

abstract class A{
	
}

public class InstatiationExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			A obj = A.class.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program Terminated");
	}
}
