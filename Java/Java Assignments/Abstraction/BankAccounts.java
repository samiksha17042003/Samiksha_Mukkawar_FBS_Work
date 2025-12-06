package Abstraction;

abstract class BankAccounts
{
	int accountNumber;
	String accHolderName;
	double currentBalance;
	static double interestRate;

	static
	{
		interestRate=12.5;
	}	

	BankAccounts()
	{
		this.accountNumber=0;
		this.accHolderName="Not Assign";
		this.currentBalance=0.0;
		//this.interestRate=0.0;
	}

	BankAccounts(int i,String n,double c)
	{
		this.accountNumber=i;
		this.accHolderName=n;
		this.currentBalance=c;
		//this.interestRate=r;
	}

	void setAccountNo(int x)
	{
		this.accountNumber=x;
	}
	
	int getAccountNo()
	{
		return this.accountNumber;
	}

	void setaccHolderName(String x)
	{
		this.accHolderName=x;
	}
	
	String getaccHolderName()
	{
		return this.accHolderName;
	}

	void setcurrentBalance(double x)
	{
		this.currentBalance=x;
	}
	
	double getcurrentBalance()
	{
		return this.currentBalance;
	}

	static void setinterestRate(double x)
	{
		interestRate=x;
	}
	
	double getinterestRate()
	{
		return this.interestRate;
	}
	
	void withdraw(double amount) {
        if (amount <= currentBalance) {
            currentBalance -= amount;
            System.out.println(amount + " withdrawn successfully!");
            System.out.println(currentBalance + " Remaining!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

	void display()
	{
		System.out.println("Account No is "+this.accountNumber);
		System.out.println("Account Name is "+this.accHolderName);
		System.out.println("Account CurrentBalance is "+this.currentBalance);
		System.out.println("Account Interestrate is "+this.interestRate);
	}

	

}

class SavingAcc extends BankAccounts
{
	double minBalance=1000;
	
	SavingAcc(int i,String n,double c)
	{
		super(i,n,c);
	}
	
	void withdraw(double amount)
	{
		if(currentBalance-amount>=minBalance)
		{
			currentBalance -=amount;
			System.out.println("Withdraw from saving Account: "+amount);
		}
		else
		{
			System.out.println("Cannot Withdraw below minimum balance! ");
		}
	}
	
	
}

class CurrentAcc extends BankAccounts
{
	double overdraftLimit=5000;
	
	CurrentAcc(int i,String n,double c)
	{
		super(i,n,c);
	}
	
	void withdraw(double amount)
	{
		if(amount <= currentBalance + overdraftLimit)
		{
			currentBalance-=amount;
			System.out.println("Withdrawn using Overdraft:"+amount);
		}
		else
		{
			System.out.println("Overdraft limit exceed");
		}
	}
}

class SalaryAcc extends BankAccounts
{
	SalaryAcc(int i,String n,double c)
	{
		super(i,n,c);
	}
	
	void withdraw(double amount) {
        if (amount <= currentBalance) {
            currentBalance -= amount;
            System.out.println(" withdrawn from salary Account!"+amount);
            
        } else {
            System.out.println("Insufficient Balance in Salary Account!");
        }
    }
}


 class Bank {

	public static void main(String[] args) {
		BankAccounts bacc;
//		bacc=new  BankAccounts(101,"Samiksha",50000);
//		bacc.withdraw(700);
//		bacc.display();
//		System.out.println("\n\n");
		
		bacc=new  SavingAcc(102,"Sheetal",6000);
		bacc.withdraw(500);
		bacc.display();
		System.out.println("\n\n");
		
		
		bacc=new  CurrentAcc(103,"Payal",6500);
		bacc.withdraw(600);
		bacc.display();
		System.out.println("\n\n");
		
		
		bacc=new  SalaryAcc(104,"Samata",60000);
		bacc.withdraw(1000);
		bacc.display();
		System.out.println("\n\n");
		
		
	}

}
