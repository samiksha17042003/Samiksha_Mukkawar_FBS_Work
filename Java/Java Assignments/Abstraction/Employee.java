package Abstraction;

abstract class Employee {//Abstract class
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
	 
	 Employee() {//default constructor
		 id=11;
		  name="samiksha";
		    salary=3500000;
		   
	}
	Employee(int id, String name, double salary) {//parameterized constructor
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	abstract void display();// function is also abstract 
	
	}//class employee end here
	class SalesManager extends Employee {//step 1
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
		 SalesManager() {//default constructor
			 super();
			 incentive=11;
			 target=2;
			 
		}
		 SalesManager(int id, String name, double salary,int incentive, int target) {//parametrized constructor
			super(id,name,salary);
			this.incentive = incentive;
			this.target = target;
		}
		 //override method
		 void display() {
			 System.out.println("-----SalesManager Details is-----");
			 System.out.println("Employee Id is:"+this.id);
		     System.out.println("Employee Name is:"+this.name);
		     System.out.println("Employee Salary is:"+this.salary);
			 System.out.println("Employee Incentive is:"+this.incentive);
			 System.out.println("Employee Target is:"+this.target);
			 
		 }
	}
	class Admin extends Employee {
		int allowance;

		int getAllowance() {
			return allowance;
		}

	     void setAllowance(int allowance) {
			this.allowance = allowance;
		}
	    
	     Admin()//default constructor
	     {
	    	 super();
	    	 allowance=80;
	     }

	     Admin(int id, String name, double salary,int allowance) {//paramatrized constructor
			super(id,name,salary);
			this.allowance = allowance;
		}
	   //override method
		 void display() {
			 System.out.println("-----Admin Details is-----");
			 System.out.println("Employee Id is:"+this.id);
		     System.out.println("Employee Name is:"+this.name);
		     System.out.println("Employee Salary is:"+this.salary);
			 System.out.println("Employee Allowance is:"+this.allowance);
		 }
		
	}
	class HR extends Employee{
		
		double commissions;

		 double getCommissions() {
			return commissions;
		}

	    void setCommissions(double commissions) {
			this.commissions = commissions;
		}

	    HR(){
	    	super();
	    	commissions=1550.34;
	    }
	    
		 HR(int id, String name, double salary,double commissions) {
			super(id,name,salary);
			this.commissions = commissions;
		}
		//override method
	    void display()
	    {
	    	 System.out.println("----- HR Details is-----");
			 System.out.println("Employee Id is:"+this.id);
		     System.out.println("Employee Name is:"+this.name);
		     System.out.println("Employee Salary is:"+this.salary);
	    	System.out.println("Employee Commissions is:"+this.commissions);
	    }
	}
	class Abstraction{
		public static void main(String[] args) {
			Employee e;
			e =new  SalesManager();
			e.display();
			e=new  SalesManager(112,"Rushiksha",70000,12000,30);
			e.display();
			e=new Admin(111,"Amita",80000,500);
			e.display();
			e=new HR(115,"Ojas",90000,5000);
			e.display();
			
		} 
	}
