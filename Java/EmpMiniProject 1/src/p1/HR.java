package p1;

public class HR extends Employee {
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

	 public HR(int id, String name, double salary,double commissions) {
		super(id,name,salary);
		this.commissions = commissions;
	}
   
   @Override
	public String toString() {
		return super.toString()+"\nCommission:" + commissions;
	}

       public double calsal() {
		return salary+commissions;
	}
   
}
