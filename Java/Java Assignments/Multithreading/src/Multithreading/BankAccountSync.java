package Multithreading;

class BankAccountSync {
       double currentBalances;

	public BankAccountSync(double currentBalances) {
		this.currentBalances = currentBalances;
	}
       public synchronized void deposit(double amount) {
    	   System.out.println("Depositing:"+amount);
    	   this.currentBalances=this.currentBalances+amount;
    	   System.out.println("balance after deposite:"+this.currentBalances);
           notifyAll();
       }
       public synchronized void withdraw(double amount) {
    	   System.out.println("want to withdraw:"+amount);
    	   this.currentBalances=this.currentBalances+amount;
    	   while(this.currentBalances<amount) {
    	   System.out.println("Insufficient funds:"+this.currentBalances+"Waiting...");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Withdrawal interrupted");
				return;
			}
		}

		this.currentBalances = this.currentBalances - amount;
		System.out.println("Withdrawn:" + amount + ". Balance now: " + this.currentBalances);
	}

	public synchronized double getBalance() {
		return this.currentBalances;
	}
 }
class WaitNotifyAnonymousDemo{
	public static void main(String[] args) {
		BankAccountSync account=new BankAccountSync (5000);
		Thread t1=new Thread(new Runnable() {
			public void run() {
				account.withdraw(7000);
				System.out.println("completed withdrawal");
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				account.deposit(5000);
				System.out.println("completed deposit");
			}
		});
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
		}

		System.out.println("Final Balance: " + account.getBalance());
}
	}

       
	
	
	
