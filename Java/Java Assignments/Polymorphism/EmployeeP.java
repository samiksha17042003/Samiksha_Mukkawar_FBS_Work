package Polymorphism;

class EmployeeP {
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
 
EmployeeP() {//default constructor
	    id=11;
	    name="samiksha";
	    salary=3500000;
	   
}
EmployeeP(int id, String name, double salary) {//parameterized constructor
	this.id = id;
	this.name = name;
	this.salary = salary;
	
}
void display() {
	System.out.println("Employee Id is:"+this.id);
	System.out.println("Employee Name is:"+this.name);
	System.out.println("Employee Salary is:"+this.salary);
}
double calsal() {
	return salary;
}
}//class employee end here
class SalesManager1 extends EmployeeP {//step 1
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
	 SalesManager1() {//default constructor
		 super();
		 incentive=11;
		 target=2;
		 
	}
	 SalesManager1(int id, String name, double salary,int incentive, int target) {//parametrized constructor
		super(id,name,salary);
		this.incentive = incentive;
		this.target = target;
	}
	 void display() {
		 super.display();
		 System.out.println("incentive is:"+this.incentive);
		 System.out.println("target is:"+this.target);
		
	 }
	 double calsal() {
			return salary+incentive;
		}
}//Class SalesManager1 ends here
class Admin1 extends EmployeeP{
	int allowance;

	int getAllowance() {
		return allowance;
	}

     void setAllowance(int allowance) {
		this.allowance = allowance;
	}
    
     Admin1()//default constructor
     {
    	 super();
    	 allowance=80;
     }

     Admin1(int id, String name, double salary,int allowance) {//paramatrized constructor
		super(id,name,salary);
		this.allowance = allowance;
	}
	 void display() {
		 super.display();
		 System.out.println("allowance is:"+this.allowance);
	 }
	 
	 double calsal() {
			return salary+allowance;
		}
}
class HR1 extends EmployeeP{
	
	double commissions;

	 double getCommissions() {
		return commissions;
	}

    void setCommissions(double commissions) {
		this.commissions = commissions;
	}

    HR1(){
    	super();
    	commissions=1550.34;
    }

	 HR1(int id, String name, double salary,double commissions) {
		super(id,name,salary);
		this.commissions = commissions;
	}
    void display()
    {
    	super.display();
    	System.out.println("commissions is:"+this.commissions);
    	
    }
    double calsal() {
		return salary+commissions;
	}
    
}
class EmployeeOverride{
	public static void main(String[] args) {
		EmployeeP e1;
		e1=new EmployeeP(101,"Sachine",4000);
		e1.display();
		e1=new SalesManager1(120,"Rahul",9000,3000,500);
		e1.display();
		System.out.println("SalesManager1 total salary is:"+e1.calsal());
		e1=new Admin1(123,"Rahul",4000,500);
		e1.display();
		System.out.println("Admin1 total salary is:"+e1.calsal());
		e1=new HR1(125,"Radhika",40000,300);
		e1.display();
		System.out.println("HR1 total salary is:"+e1.calsal());	
		} 
}