package ToString;
class Employees {
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
	 
	 Employees() {//default constructor
		 id=11;
		  name="samiksha";
		    salary=3500000;
		   
	}
	Employees(int id, String name, double salary) {//parameterized constructor
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	public String toString() {
		return "ID:"+this.id+"\nName:"+this.name+"\nSalary:"+this.salary;
	}
	
	}//class employee end here
	class SalesManagers extends Employees {//step 1
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
		 SalesManagers() {//default constructor
			 super();
			 incentive=11;
			 target=2;
			 
		}
		 SalesManagers(int id, String name, double salary,int incentive, int target) {//parametrized constructor
			super(id,name,salary);
			this.incentive = incentive;
			this.target = target;
		}
		 public String toString(){
			return super.toString()+"\nincentive:"+this.incentive+"\ntarget:"+this.target;
			 
		 }
	}

	class Admins extends Employees{
		int allowance;

		int getAllowance() {
			return allowance;
		}

	     void setAllowance(int allowance) {
			this.allowance = allowance;
		}
	    
	     Admins()//default constructor
	     {
	    	 super();
	    	 allowance=80;
	     }

	     Admins(int id, String name, double salary,int allowance) {//paramatrized constructor
			super(id,name,salary);
			this.allowance = allowance;
		}
	     public String toString(){
				return super.toString()+" \nAllowance: "+this.allowance;
		
	}
	}
	class HRs extends Employees{
		
		double commissions;

		 double getCommissions() {
			return commissions;
		}

	    void setCommissions(double commissions) {
			this.commissions = commissions;
		}

	    HRs(){
	    	super();
	    	commissions=1550.34;
	    }
	    
		 HRs(int id, String name, double salary,double commissions) {
			super(id,name,salary);
			this.commissions = commissions;
		}
		 public String toString(){
				return super.toString()+ " \nCommissions: " +this.commissions;
	}

	}
	class Test1{
		public static void main(String[] args) {
			Employees e;
			e =new SalesManagers();
			System.out.println(e);
			System.out.println();
			e=new  SalesManagers(112,"Divya",70000,12,3);
			System.out.println(e);
			System.out.println();
			e=new Admins();
			System.out.println(e);
			System.out.println();
			e=new HRs(112,"Rohan",70000,12000);
			System.out.println(e);
			System.out.println();
			
			
		} 
	}
