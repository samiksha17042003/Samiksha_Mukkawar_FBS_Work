package p1;
import p1.Employee;
public class SalesManager extends Employee {
	  int target;
	  double incentive;
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
		 target=0;
		 incentive=0;
	}
	 public SalesManager(int id, String name, double salary,int target,double incentive) {//parametrized constructor
		super(id,name,salary);
		this.target = target;
		this.incentive = incentive;
	}
	 
	 public double calsal() {
			return salary+incentive;
		}
	 
	@Override
	public String toString() {
		return super.toString()+"\nTarget:" + target + "\nIncentive:" + incentive;
	}
	 
}//Class SalesManager1 ends here

