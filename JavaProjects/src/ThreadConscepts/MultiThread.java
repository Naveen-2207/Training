package ThreadConscepts;

public class MultiThread extends Thread {

	public static void main(String[] args) {
		Thread nav1 = new MultiThread();
		Thread nav2 = new Thread(new MultiThread());
		MultiThread nav3 = new MultiThread();
		nav1.setName("T1");
		nav2.setName("T2");
		nav3.setName("T3");
		System.out.println("Name of Thread1: " + nav1.getName());
		System.out.println("Name of Thread2: " + nav2.getName());
		System.out.println("Name of Thread3: " + nav3.getName());
		nav1.start();
		nav2.start();
		nav3.start();
	}
	public void run() {
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
