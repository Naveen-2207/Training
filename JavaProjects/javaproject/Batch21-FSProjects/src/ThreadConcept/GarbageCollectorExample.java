package ThreadConcept;

public class GarbageCollectorExample {

	public static void main(String[] args) {
		System.out.println("Good morning");
		GarbageCollectorExample obj = new GarbageCollectorExample();
		obj = null;
		System.gc();
		System.out.println("Program terminated!!!");
	}
	
	public void finalize() {
		System.out.println("Finalize method invoked");
	}
}
