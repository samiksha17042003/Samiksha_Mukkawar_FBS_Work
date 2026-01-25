package p1;
import p1.Employee;
public class Admin extends Employee{
	double allowance;

	double getAllowance() {
		return allowance;
	}

     void setAllowance(double allowance) {
		this.allowance = allowance;
	}
    
     Admin()//default constructor
     {
    	// TODO Auto-generated constructor stub	 
     }

     public Admin(int id, String name, double salary,double allowance) {//paramatrized constructor
		super(id,name,salary);
		this.allowance = allowance;
	}
	 
	 public double calsal() {
			return salary+allowance;
		}

	@Override
	public String toString() {
		return super.toString()+"\nAllowance:"+this.allowance;
	}
	 
}

