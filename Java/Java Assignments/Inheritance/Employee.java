package Inheritance;

class Employee {
   int id;
   String name;
   double salary;
   static int count;
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
 static int getCount() {
	return count;
}
 static void setCount(int count) {
	Student.count = count;
}
 Employee() {//default constructor
	 id=11;
	  name="Samiksha";
	    salary=3500000;
	    count++;
}
Employee(int id, String name, double salary) {//parameterized constructor
	this.id = id;
	this.name = name;
	this.salary = salary;
	count++;
}
void display() {
	System.out.println("Id is:"+this.id);
	System.out.println("Name is:"+this.name);
	System.out.println("Salary is:"+this.salary);
}
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
	 void display() {
		 super.display();
		 System.out.println("Incentive is:"+this.incentive);
		 System.out.println("Target is:"+this.target);
		 
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
	 void display() {
		 super.display();
		 System.out.println("Allowance is:"+this.allowance);
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
    void display()
    {
    	super.display();
    	System.out.println("Commissions is:"+this.commissions);
    }
}
class EmployeeInheritance{
	public static void main(String[] args) {
		SalesManager sm1 =new  SalesManager();
		sm1.display();
		System.out.println();
		SalesManager sm2 =new  SalesManager(112,"Shivani",70000,12,3);
		sm2.display();
		System.out.println();
		Admin a=new Admin(123,"Rahul",8000,300);
		a.display();
		System.out.println();
		HR h=new HR(125,"Radhika",40000,300);
		h.display();
		System.out.println("Employee total count:"+Employee.getCount());
	} 
}
