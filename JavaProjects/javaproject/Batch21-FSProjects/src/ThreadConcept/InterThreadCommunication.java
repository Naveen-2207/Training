package ThreadConcept;

class Customer {
	int amount = 10000;
	synchronized void withdraw(int amount) {
		System.out.println("I am going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance" + this.amount);
			System.out.println("Waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		this.amount -= amount;
		System.out.println("Balance..." + this.amount);
		System.out.println("Withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("Going to deposit...");
		this.amount += amount;
		System.out.println("Deposit completed..." + this.amount);
		notify();
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		Customer c = new Customer();
				
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}

}

