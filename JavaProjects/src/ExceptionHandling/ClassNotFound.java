package ExceptionHandling;

public class ClassNotFound {

	public static void main(String[] args) {
		
		try {
			Class.forName("NewClass");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Program Terminated");
	}

}
