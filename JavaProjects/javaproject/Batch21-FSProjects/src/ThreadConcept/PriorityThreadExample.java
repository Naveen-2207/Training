package ThreadConcept;

public class PriorityThreadExample extends Thread{
	public static void main(String[] args) {
		PriorityThreadExample threadObj1 = new PriorityThreadExample();
		PriorityThreadExample threadObj2 = new PriorityThreadExample();
		PriorityThreadExample threadObj3 = new PriorityThreadExample();
		threadObj1.setName("T1");
		threadObj2.setName("T2");
		threadObj3.setName("T3");
		System.out.println("Default priority of T1: " +threadObj1.getPriority());
		System.out.println("Default priority of T2: " +threadObj2.getPriority());
		System.out.println("Default priority of T3: " +threadObj3.getPriority());
		threadObj1.setPriority(MIN_PRIORITY);
		threadObj3.setPriority(MAX_PRIORITY);
		System.out.println("Priority of T1: " +threadObj1.getPriority());
		System.out.println("Priority of T2: " +threadObj2.getPriority());
		System.out.println("Priority of T3: " +threadObj3.getPriority());
		
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
