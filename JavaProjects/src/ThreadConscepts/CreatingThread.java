package ThreadConscepts;

public class CreatingThread extends Thread {

	public static void main(String[] args) {
		CreatingThread nav = new CreatingThread();
		nav.start();
		System.out.println("Program Terminated!!!");
	}
	public void run() {
		for(int i =0; i<5;i++) {
			System.out.println("Thread is Running");
			try {		
				System.out.println("index : " + i);
				sleep(500);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
