package Inheritance;

	class Employee1 {
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
		 Employee1() {//default constructor
			 id=11;
			  name="samiksha";
			    salary=3500000;
			    count++;
		}
		Employee1(int id, String name, double salary) {//parameterized constructor
			this.id = id;
			this.name = name;
			this.salary = salary;
			count++;
		}
		void display() {
			System.out.println("id is:"+this.id);
			System.out.println("name is:"+this.name);
			System.out.println("salary is:"+this.salary);
		}
		}//class employee end here
		class SalesManagers extends Employee1 {//step 1
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
			 void display() {
				 super.display();
				 System.out.println("incentive is:"+this.incentive);
				 System.out.println("target is:"+this.target);
				 
			 }
		}
		class AreaSalesmanager extends SalesManagers{
			int area;

			 int getArea() {
				return area;
			}

			 void setArea(int area) {
				this.area = area;
			}
		
		AreaSalesmanager(){
			area=90;
		}
	        AreaSalesmanager(int id, String name, double salary,int incentive, int target,int area) {
			super(id,name,salary,incentive,target);
			this.area = area;
		}
	        void display() {
	        	super.display();
	        	System.out.println("Area:"+this.area );
	        }
		}

class Area extends AreaSalesmanager{
	String Areaname;

	String getAreaname() {
		return Areaname;
	}

	 void setAreaname(String areaname) {
		Areaname = areaname;
	}
	 Area(){
		 Areaname="Shirampur";
	 }

	Area(int id, String name, double salary,int incentive, int target,int area,String areaname) {
		super(id,name,salary,incentive,target,area);
		Areaname = areaname;
	}
	void display() {
		super.display();
		System.out.println("Areaname is"+this.Areaname);
	}
	 
	
}
		class Admins extends Employee1 {
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
			 void display() {
				 super.display();
				 System.out.println("allowance is:"+this.allowance);
			 }
			
		}
		class HRs extends Employee1{
			
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
		    void display()
		    {
		    	super.display();
		    	System.out.println("commissions is:"+this.commissions);
		    }
		}
            class Inheritances{
			public static void main(String[] args) {
				SalesManagers sm1 =new  SalesManagers();
				sm1.display();
				SalesManagers sm2 =new  SalesManagers(112,"shalu",70000,12,3);
				sm2.display();
				Admins a=new Admins();
				a.display();
				HRs h=new HRs();
				h.display();
				AreaSalesmanager as=new AreaSalesmanager();
				as.display();
				Area A=new Area();
				A.display();
				System.out.println("Employee total count:"+Employee.getCount());
			} 
            }

