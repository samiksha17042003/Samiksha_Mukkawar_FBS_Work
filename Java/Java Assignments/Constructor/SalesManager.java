class SalesManager{
int id;
String name;
double salary;
double incentive;
int target;

SalesManager() {//default constructor
                 System.out.println("SalesManager default constructor");
                 id=11;
	         name="Samiksha";
	         salary=3500000;
		 incentive=1100;
		 target=20;
		 
	}
	 SalesManager(int id, String name, double salary,int incentive, int target) {//parametrized constructor
		 System.out.println("SalesManager parametrized constructor");
	          this.id = id;
	          this.name = name;
	          this.salary = salary;
                  this.incentive = incentive;
		  this.target = target;
     
}

void setID(int i){
this.id=i;
}
void setName(String n){
this.name=n;
}
void setSalary(double s){
this.salary=s;
}
void setIncentive(double i){
this.incentive=i;
}
void setTarget(int t){
this.target=t;
}
int getId(){
return this.id;
}
int getID(){
return this.id;
}
String getName(){
return this.name;
}
double getSalary(){
return this.salary;
}
double getIncentive(){
return this.incentive;
}
int getTarget(){
return this.target;
}
void display(){
System.out.println("ID is:"+this.id);
System.out.println("Name is:"+this.name);
System.out.println("Salary is:"+this.salary);
System.out.println("Incentive is:"+this.incentive);
System.out.println("Target is:"+this.target);
}
}
class Test{
public static void main(String args[]){
SalesManager s1,s2;
s1=new SalesManager();
s1.display();
System.out.println();
s2=new SalesManager(34,"Yash",555000,5000,800);
s2.display();
System.out.println();
s1.setID(11);
s1.setName("Ram");
s1.setSalary(900000);
s1.setIncentive(7000.89);
s1.setTarget(60);
s2.setID(10);
s2.setName("Amit");
s2.setSalary(100000);
s2.setIncentive(8000.98);
s2.setTarget(67);
s1.display();
System.out.println();
s2.display();
if(s1.getSalary()>s2.getSalary()){
System.out.println("s1 Salary is Greater");
} 
else{
System.out.println("s2 Salary is Greater");
}

}
}



