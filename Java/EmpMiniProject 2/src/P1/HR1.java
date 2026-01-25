package P1;
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