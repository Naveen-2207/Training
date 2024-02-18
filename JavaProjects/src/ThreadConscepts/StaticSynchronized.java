package ThreadConscepts;

class a extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is Running");
		StaticSynchronized.printable(2);
	}
}

class b extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is Running");
		StaticSynchronized.printable(3);
	}
}

class c extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is Running");
		StaticSynchronized.printable(4);
	}
}

class d extends Thread {
	public void run() {
		synchronized(this) {
		System.out.println(Thread.currentThread().getName() + " is Running");
		StaticSynchronized.printable(5);
	}
}
}

public class StaticSynchronized {
	synchronized static void printable(int num) {
		for (int i = 1; i <= 6; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

	public static void main(String[] args) {
		a nav = new a();
		b nav1 = new b();
		c nav2 = new c();
		d nav3 = new d();
		nav.setName("t1");
		nav1.setName("t2");
		nav2.setName("t3");
		nav3.setName("t4");
		nav.start();
		nav1.start();
		nav2.start();
		nav3.start();

	}

}
