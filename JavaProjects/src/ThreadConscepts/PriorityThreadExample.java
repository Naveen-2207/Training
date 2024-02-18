package ThreadConscepts;

public class PriorityThreadExample extends Thread {

	public static void main(String[] args) {
		PriorityThreadExample nav = new PriorityThreadExample();
		PriorityThreadExample nav1 = new PriorityThreadExample();
		PriorityThreadExample nav2 = new PriorityThreadExample();
		nav.setName("T1");
		nav1.setName("T2");
		nav2.setName("T3");
		System.out.println("Default Priority of T1: " + nav.getPriority());
		System.out.println("Default Priority of T2: " + nav1.getPriority());
		System.out.println("Default Priority of T3: " + nav2.getPriority());
		nav.setPriority(MIN_PRIORITY);
		nav2.setPriority(MAX_PRIORITY);
		System.out.println(" Priority of T1: " + nav.getPriority());
		System.out.println(" Priority of T2: " + nav1.getPriority());
		System.out.println(" Priority of T3: " + nav2.getPriority());
		nav.start();
		nav1.start();
		nav2.start();

	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is currently running");  
  		for(int i =0; i<5;i++) {
			System.out.println("Thread is Running");
			try {		
				System.out.println("index : " + i);
				Thread.sleep(500);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}
