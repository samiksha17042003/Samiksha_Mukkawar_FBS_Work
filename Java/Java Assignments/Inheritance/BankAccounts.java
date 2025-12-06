package Inheritance;

class BankAccounts
{
	int accountNumber;
	String accHolderName;
	double currentBalance;

	BankAccounts()
	{
		this.accountNumber=0;
		this.accHolderName="Not Assign";
		this.currentBalance=0.0;
		
	}

	BankAccounts(int i,String n,double c)
	{
		this.accountNumber=i;
		this.accHolderName=n;
		this.currentBalance=c;
		
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

	void display()
	{
		System.out.println("Account No is "+this.accountNumber);
		System.out.println("Account Name is "+this.accHolderName);
		System.out.println("Account CurrentBalance is "+this.currentBalance);
		
	}

	

}

class SavingAcc extends BankAccounts
{
	double minBalance=1000;
	
	SavingAcc(int i,String n,double c)
	{
		super(i,n,c);
	}
	
}

class CurrentAcc extends BankAccounts
{
	double overdraftLimit=5000;
	
	CurrentAcc(int i,String n,double c)
	{
		super(i,n,c);
	}
	
}

class SalaryAcc extends BankAccounts
{
	SalaryAcc(int i,String n,double c)
	{
		super(i,n,c);
	}
	
}


 class BankInheritance {

	public static void main(String[] args) {
		BankAccounts bacc;
		bacc=new  BankAccounts(101,"Samiksha",50000);
		bacc.display();
		System.out.println("\n\n");
		
		bacc=new  SavingAcc(102,"Sheetal",6000);
		bacc.display();
		System.out.println("\n\n");
		
		
		bacc=new  CurrentAcc(103,"Payal",6500);
		bacc.display();
		System.out.println("\n\n");
		
		
		bacc=new  SalaryAcc(104,"Samata",60000);
		bacc.display();
		System.out.println("\n\n");
		
		
	}

}
