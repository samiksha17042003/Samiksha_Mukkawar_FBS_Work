package Static;

public class BankAccount {
	int accountno;
	String accountholdername;
	double currentbalance;
	static double interestrate;
static {
	interestrate=12.7;
}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public double getCurrentbalance() {
		return currentbalance;
	}
	public void setCurrentbalance(double currentbalance) {
		this.currentbalance = currentbalance;
	}
	public double getInterestrate() {
		return interestrate;
	}
	static void setInterestrate(double n) {
		interestrate =n;
	}
	BankAccount(){
		 accountno=12345678;
		 accountholdername="Samiksha";
		 currentbalance=1000;
		 
	}
	public BankAccount(int accountno, String accountholdername, double currentbalance) {
		super();
		this.accountno = accountno;
		this.accountholdername = accountholdername;
		this.currentbalance = currentbalance;
		//this.interestrate=interestrate;
	}
	void display() {
		System.out.println("\naccountno is:"+this.accountno);
		System.out.println("accountholdername is:"+this.accountholdername);
		System.out.println("currentbalance is:"+this.currentbalance);
		System.out.println("interestrate is:"+this.interestrate);
	}
	
}
//class SavingAccount extends BankAccount{
//	double minbalancelimite;
//
//	public double getMinbalancelimite() {
//		return minbalancelimite;
//	}
//
//	public void setMinbalancelimite(double minbalancelimite) {
//		this.minbalancelimite = minbalancelimite;
//	}
//	 SavingAccount(){
//		 minbalancelimite=500;
//	 }
//
//	public SavingAccount(int accountno, String accountholdername, double currentbalance, double interestrate,double minbalancelimite) {
//		super(accountno,accountholdername, currentbalance,interestrate);
//		this.minbalancelimite = minbalancelimite;
//	}
//	void display() {
//		super.display();
//		System.out.println("minbalancelimite is:"+this.minbalancelimite);
//	}
//	 
//}
//class CurrentAccount extends BankAccount{
//	int overdraft;
//
//	public int getOverdraft() {
//		return overdraft;
//	}
//
//	public void setOverdraft(int overdraft) {
//		this.overdraft = overdraft;
//	}
//	CurrentAccount(){
//		overdraft=30000;
//	}
//
//	public CurrentAccount(int accountno, String accountholdername, double currentbalance, double interestrate,int overdraft) {
//		super( accountno,accountholdername,currentbalance,interestrate);
//		this.overdraft = overdraft;
//	}
//	void display() {
//		super.display();
//		System.out.println("overdraft is"+this.overdraft);
//	}
//	
//}
//class SalaryAccount extends BankAccount{
//	int lasttransactiondate;
//
//	public int getLasttransactiondate() {
//		return lasttransactiondate;
//	}
//
//	public void setLasttransactiondate(int lasttransactiondate) {
//		this.lasttransactiondate = lasttransactiondate;
//	}
//	SalaryAccount(){
//		lasttransactiondate=13-10-2025;
//	}
//
//	public SalaryAccount(int accountno,String accountholdername,double currentbalance,double interestrate,int lasttransactiondate) {
//		super(accountno,accountholdername,currentbalance,interestrate);
//		this.lasttransactiondate = lasttransactiondate;
//	}
//	void display() {
//		super.display();
//		System.out.println("lasttransactiondate is"+this.lasttransactiondate );
//	}
//}
class Bank {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount(5654,"Pratiksha",8000);
		b1.display();
		BankAccount b2=new BankAccount(1543,"Sheetal",6000.0);
		b2.display();
		BankAccount b3=new BankAccount(103,"Payal",6500.0);
		b3.display();
		//b2.display();
		BankAccount.setInterestrate(10.4);
		b1.display();
		b2.display();
		b3.display();
		
		
	}

}
