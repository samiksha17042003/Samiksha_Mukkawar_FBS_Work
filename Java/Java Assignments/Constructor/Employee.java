class Employee{
int id;
String name;
double salary;

Employee() {//default constructor
 System.out.println("Employee default constructor");
	 id=11;
	  name="Samiksha";
	    salary=3500000;
}

Employee(int id, String name, double salary) {//parameterized constructor
 System.out.println("Employee parametrized constructor");
	this.id = id;
	this.name = name;
	this.salary = salary;
}

void setId(int x){
this.id=x;
}
void setName(String a){
this.name=a;
}
void setSalary(double d){
this.salary=d;
}
int getId(){
return this.id;
}
String getName(){
return this.name;
}
double getSalary(){
return this.salary;
}
void display(){
System.out.println("Id is:"+this.id);
System.out.println("Name is:"+this.name);
System.out.println("Salary is:"+this.salary);
}
}
class Test{
public static void main(String args[]){
Employee e1,e2;
e1=new Employee();
e1.display();
System.out.println();
e2=new Employee(16,"Tanvi",55000);
e2.display();
System.out.println();
e1.setId(3);
e1.setName("Swami");
e1.setSalary(30000.00);
e2.setId(5);
e2.setName("Vedant");
e2.setSalary(9000000.00);
e1.display();
System.out.println();
e2.display();
if(e1.getSalary()>e2.getSalary()){
System.out.println("e1 Salary is Greater");
} 
else{
System.out.println("e2 Salary is Greater");
}
}
}