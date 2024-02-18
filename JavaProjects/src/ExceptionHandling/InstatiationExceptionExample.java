package ExceptionHandling;

abstract class A{
	
}

public class InstatiationExceptionExample {

	public static void main(String[] args) {
		
			try {
				A nav = A.class.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
