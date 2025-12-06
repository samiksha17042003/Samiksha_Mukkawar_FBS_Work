class HR{
int Id;
String name;
double salary;
double commissions;

HR() {//default constructor
 System.out.println("HR default constructor");
	 Id=11;
	 name="Samiksha";
	 salary=3500000;
         commissions=1550.34;
}
HR(int id, String name, double salary,double commissions) {//parameterized constructor
 System.out.println("HR parametrized constructor");
	this.Id = id;
	this.name = name;
	this.salary = salary;
        this.commissions = commissions;
}
void setId(int x){
this.Id=x;
}
void setName(String x){
this.name=x;
}
void setSalary(double x){
this.salary=x;
}
void setCommissions(double x){
this.commissions=x;
}
int getId(){
return this.Id;
}
String getName(){
return this.name;
}
double getSalary(){
return this.salary;
}
double getCommissions(){
return this.commissions;
}
void display(){
System.out.println("HR id:-"+this.Id);
System.out.println("HR name:-"+this.name);
System.out.println("HR salary:-"+this.salary);
System.out.println("HR commissions:-"+this.commissions);
}
}
class Test{
public static void main(String args[]){
HR h1,h2;
h1=new HR();
h1.display();
System.out.println();
h2=new HR(45,"Rashamika",600000,3000.00);
h2.display();
System.out.println();
h1.setId(12);
h1.setName("Sakshi");
h1.setSalary(100000);
h1.setCommissions(12000);
h2.setId(32);
h2.setName("Arjuna");
h2.setSalary(500000);
h2.setCommissions(18000);
h1.display();
System.out.println();
h2.display();
if(h1.getCommissions()>h2.getCommissions()){
System.out.println("h1 Commission Greater");
} 
else{
System.out.println("h2 Commission Greater");
}

}
}