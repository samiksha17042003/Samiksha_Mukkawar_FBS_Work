package p1;

public abstract class Employee {
	   int id;
	   String name;
	   double salary;
	  
	   public int getId() {
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
	 public void setSalary(double salary) {
		this.salary = salary;
	}
	 
	Employee() {//default constructor
		    id=11;
		    name="samiksha";
		    salary=3500000;
		   
	}
	Employee(int id, String name, double salary) {//parameterized constructor
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}

       public abstract double calsal();
	@Override
	public String toString() {
		return "ID:"+this.id +"\nName: "
				+this.name+"\nSalary"+
				this.salary;
	}
		
}
