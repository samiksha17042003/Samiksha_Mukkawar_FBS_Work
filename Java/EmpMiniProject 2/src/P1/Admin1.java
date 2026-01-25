package P1;

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