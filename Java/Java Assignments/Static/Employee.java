package Static;

public class Employee {
       String name;
       double basicsalary;
       static double companyBonusrate;
       static{
    	   companyBonusrate=10.00;
       }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicSalary() {
		return basicsalary;
	}
	public void setBasicSalary(double salary) {
		this.basicsalary = salary;
	}
	public static double getCompanyBonusrate() {
		return companyBonusrate;
	}
	    static void setCompanyBonusrate(double companyBonusrate) {
		Employee.companyBonusrate = companyBonusrate;
	}
	public Employee() {
		name="Virata";
		basicsalary=500000;
	}
	public Employee(String name, double salary) {
		this.name = name;
		this.basicsalary = salary;
	}    
	void display() {
		System.out.println("\nEmployee Name is:"+this.name);
		System.out.println("Employee BasicSalary is:"+this.basicsalary);
		System.out.println("Employee TotalSalary is:"+calculateTotalSalary());
	}
	
	double calculateTotalSalary() {
		double bonusamount=basicsalary*companyBonusrate/100;
		return this.basicsalary+bonusamount;
		
	}
}
class Test{
	public static void main(String[] args) {
		Employee e1=new Employee("Dipali",76000);
		e1.display();
		Employee e2=new Employee("Kartika",45000);
		e2.display();
		Employee e3=new Employee("Kaushika",900000);
		e3.display();
		Employee.setCompanyBonusrate(80);
		e1.display();
		e2.display();
		e3.display();
		
	}
}