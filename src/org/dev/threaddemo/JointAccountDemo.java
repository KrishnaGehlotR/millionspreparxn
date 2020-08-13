package org.dev.threaddemo;

class CboAccount {

	private int balance = 5000;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}
}

// MultiThreadNoSynchronization
public class JointAccountDemo implements Runnable {

	private CboAccount acct = new CboAccount();

	public static void main(String[] args) {

		JointAccountDemo jAcct = new JointAccountDemo();
		Thread td1 = new Thread(jAcct);
		Thread td2 = new Thread(jAcct);

		td1.setName("Jack");
		td2.setName("Jill");

		td1.start();
		td2.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {

			withDrawCash(1000);

			if (acct.getBalance() < 0) {
				System.out.println("Cash over drawn");
			}
		}

	}

	// Use synchronized for thread safety
	private synchronized void withDrawCash(int amt) {

//	private void withDrawCash(int amt) {

		if (acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " will withdraw");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		} else {
			System.out.println(
					"Insufficient fund Mr/Ms " + Thread.currentThread().getName() + " balance " + acct.getBalance());
		}
	}

}
