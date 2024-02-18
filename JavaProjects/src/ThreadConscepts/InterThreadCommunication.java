package ThreadConscepts;

class Coustomer{
	int amt = 10000;
	synchronized void withdraw(int amt) {
		System.out.println("I am going to withdraw...");
		if(this.amt<amt) {
			System.out.println("Less Balance.." + this.amt); 
			System.out.println("Waiting for Deposit...");
		try {
			wait();
		}catch(Exception e) {
			System.out.println(e);
		}
		}
		this.amt -= amt;
		System.out.println("Balance..." + this.amt);
		System.out.println("withdraw completed");
	}
	synchronized void deposit(int amt) {
		System.out.println("Going to deposit...");
		this.amt += amt;
		System.out.println("Deposit completed..." + this.amt);
	    notify();
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		Coustomer nav =  new Coustomer();
		new Thread() {
			public void run() {
				nav.withdraw(150000);
			}
		}.start();
		new Thread() {
			public void run() {
				nav.deposit(100000);
			}
		}.start();

	}

}
