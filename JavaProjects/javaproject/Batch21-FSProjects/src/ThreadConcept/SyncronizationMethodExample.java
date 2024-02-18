package ThreadConcept;

public class SyncronizationMethodExample extends Thread {
	public static void main(String[] args) {
		SyncronizationMethodExample threadObj1 = new SyncronizationMethodExample();
		SyncronizationMethodExample threadObj2 = new SyncronizationMethodExample();
		threadObj1.setName("T1");
		threadObj2.setName("T2");
		threadObj1.start();
		threadObj2.start();
	}

	public void run() {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + " is running");
			printTable();
		}
	}
	
	synchronized void printTable() {
		for (int i = 1; i < 6; i++) {
			System.out.println("5 * " + i + " = " + (5*i));
		}
	}

}
