package P1;
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
