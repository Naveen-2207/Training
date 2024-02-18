package ThreadConcept;

class ThreadClass1 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
		StaticSynchronizationExample.printTable(2);
	}
}

class ThreadClass2 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
		StaticSynchronizationExample.printTable(3);
	}
}

class ThreadClass3 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
		StaticSynchronizationExample.printTable(4);
	}
}

public class StaticSynchronizationExample {
	static synchronized void printTable(int num) {
		for (int i = 1; i < 6; i++) {
			System.out.println( num + " * " + i + " = " + (num*i));
		}
	}
	public static void main(String[] args) {
		ThreadClass1 obj1 = new ThreadClass1();
		ThreadClass2 obj2 = new ThreadClass2();
		ThreadClass3 obj3 = new ThreadClass3();
		obj1.setName("T1");
		obj2.setName("T2");
		obj3.setName("T3");
		obj1.start();
		obj2.start();
		obj3.start();

	}

}
