package ThreadConscepts;

import java.awt.print.Printable;

public class SynchronizationMethod extends Thread{

	public static void main(String[] args) {
		SynchronizationMethod nav = new SynchronizationMethod();
		SynchronizationMethod nav1 = new SynchronizationMethod();
		nav.setName("T1");
		nav1.setName("T2");
		nav.start();
		nav1.start();

	}
	public void run() {
		synchronized(this) {
		printable();
	}
	}
	synchronized void printable() {
		System.out.println(Thread.currentThread().getName() + " is Running");
		for(int i = 1;i < 6;i++) {
			System.out.println("5 * " + i + " = " + (5*i));
		}
	}

}
