class Admin{
int id;
String name;
double salary;
int allowances;

void setId(int x){
this.id=x;
}
void setName(String a){
this.name=a;
}
void setSalary(double d){
this.salary=d;
}
void setAllowances(int z){
this.allowances=z;
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
int getAllowances(){
return this.allowances;
}
void display(){
System.out.println("Admin id:"+this.id);
System.out.println("Admin name:"+this.name);
System.out.println("Admin salary:"+this.salary);
System.out.println("Admin allowances:"+this.allowances);
}
}

class Test{
public static void main(String[] args){
Admin a1,a2;
a1=new Admin();
a2=new Admin();
a1.setId(18);
a1.setName("Vedu");
a1.setSalary(500000);
a1.setAllowances(2000);
a2.setId(45);
a2.setName("Prutha");
a2.setSalary(900000);
a2.setAllowances(1000);
a1.display();
a2.display();
if(a1.getSalary()>a2.getSalary()){
System.out.println("a1 Salary is Greater");
} 
else{
System.out.println("a2 Salary is Greater");
}
}
}