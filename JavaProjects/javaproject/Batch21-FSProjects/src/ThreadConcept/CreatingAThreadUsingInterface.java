package ThreadConcept;

public class CreatingAThreadUsingInterface implements Runnable {
	public static void main(String[] args) {
		CreatingAThreadUsingClass classObj = new CreatingAThreadUsingClass();
		Thread threadObj = new Thread(classObj);
		threadObj.start();
		
		System.out.println("Program terminated");
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread is running");
			try {
				System.out.println("Index: " + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
