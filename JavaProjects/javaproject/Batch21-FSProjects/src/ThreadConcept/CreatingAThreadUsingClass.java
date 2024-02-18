package ThreadConcept;

public class CreatingAThreadUsingClass extends Thread {
	public static void main(String[] args) {
		CreatingAThreadUsingClass threadObj = new CreatingAThreadUsingClass();
		threadObj.start();
		System.out.println("Program Terminated!!!");
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread is running");
			try {
				System.out.println("Index: " + i);
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
