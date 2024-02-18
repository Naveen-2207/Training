package ThreadConscepts;

public class RunnableThread implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingThread nav1 = new CreatingThread();
		Thread nav = new Thread(nav1);
		nav.start();
		System.out.println("Program Terminated");
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
