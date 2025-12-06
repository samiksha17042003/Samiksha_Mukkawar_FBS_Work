package Abstraction;


abstract class EmployeeA {//only class is Abstract
	   int id;
	   String name;
	   double salary;
	   int getId() {
		return id;
	}
	 void setId(int id) {
		this.id = id;
	}
	 String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	 void setSalary(double salary) {
		this.salary = salary;
	}
	 
	 EmployeeA() {//default constructor
		 id=11;
		  name="samiksha";
		    salary=3500000;
		   
	}
	EmployeeA(int id, String name, double salary) {//parameterized constructor
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	 void display() {
		 System.out.println("-----Employee Details is-----");
		 System.out.println("Employee Id is:"+this.id);
	     System.out.println("Employee Name is:"+this.name);
	     System.out.println("Employee Salary is:"+this.salary);
	 }
	
	}//class employee end here
	class SalesManagerr extends EmployeeA{//step 1
		  double incentive;
		  int target;
		  double getIncentive() {
			return incentive;
		}
		void setIncentive(double incentive) {
			this.incentive = incentive;
		}
		 int getTarget() {
			return target;
		}
		void setTarget(int target) {
			this.target = target;
		}
		 SalesManagerr() {//default constructor
			 super();
			 incentive=11;
			 target=2;
			 
		}
		 SalesManagerr(int id, String name, double salary,int incentive, int target) {//parametrized constructor
			super(id,name,salary);
			this.incentive = incentive;
			this.target = target;
		}
		 void display() {
			 System.out.println("-----SalesManager Details is-----");
			 System.out.println("Employee Id is:"+this.id);
		     System.out.println("Employee Name is:"+this.name);
		     System.out.println("Employee Salary is:"+this.salary);
			 System.out.println("Incentive is:"+this.incentive);
			 System.out.println("Target is:"+this.target);
			 
		 }
	}
	class Adminn extends EmployeeA {
		int allowance;

		int getAllowance() {
			return allowance;
		}

	     void setAllowance(int allowance) {
			this.allowance = allowance;
		}
	    
	     Adminn()//default constructor
	     {
	    	 super();
	    	 allowance=80;
	     }

	     Adminn(int id, String name, double salary,int allowance) {//paramatrized constructor
			super(id,name,salary);
			this.allowance = allowance;
		}
		 void display() {
			 System.out.println("-----Admin Details is-----");
			 System.out.println("Employee Id is:"+this.id);
		     System.out.println("Employee Name is:"+this.name);
		     System.out.println("Employee Salary is:"+this.salary);
			 System.out.println("Allowance is:"+this.allowance);
		 }
		
	}
	class HRR extends EmployeeA{
		
		double commissions;

		 double getCommissions() {
			return commissions;
		}

	    void setCommissions(double commissions) {
			this.commissions = commissions;
		}

	    HRR(){
	    	super();
	    	commissions=1550.34;
	    }
	    
		 HRR(int id, String name, double salary,double commissions) {
			super(id,name,salary);
			this.commissions = commissions;
		}
	    void display()
	    {
	    	 System.out.println("----- HR Details is-----");
			 System.out.println("Employee Id is:"+this.id);
		     System.out.println("Employee Name is:"+this.name);
		     System.out.println("Employee Salary is:"+this.salary);
	    	System.out.println("Commissions is:"+this.commissions);
	    }
	}
	class TestAbstraction{
		public static void main(String[] args) {
			Employee e;
			e =new  SalesManager();
			e.display();
			e=new  SalesManager(112,"Shivani",70000,12,3);
			e.display();
			e=new Admin(111,"Amita",80000,500);
			e.display();
			e=new HR(112,"Rohan",70000,12000);
			e.display();
			
		} 
	}

