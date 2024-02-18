package ThreadConcept;

public class MultithreadingConcept extends Thread {
	public static void main(String[] args) {
//		Thread threadObj1 = new MultithreadingConcept();
//		Thread threadObj2 = new Thread(new MultithreadingConcept());
		MultithreadingConcept threadObj1 = new MultithreadingConcept();
		MultithreadingConcept threadObj2 = new MultithreadingConcept();
		MultithreadingConcept threadObj3 = new MultithreadingConcept();
		
		threadObj1.setName("T1");
		threadObj2.setName("T2");
		threadObj3.setName("T3");

		System.out.println("Name of thread1: " + threadObj1.getName());
		System.out.println("Name of thread2: " + threadObj2.getName());
		System.out.println("Name of thread3: " + threadObj3.getName());
		
		threadObj1.start();
		threadObj2.start();
		threadObj3.start();
	}
	public void run() {
		System.out.println(Thread.currentThread().getName() + "is currently running");
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
