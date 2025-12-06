class Employee{
int id;
String name;
double salary;

void setId(int x){
this.id=x;
}
void setName(String a){
this.name=a;
}
void setSalary(double d){
this.salary=d;
}
}//Employee ends here
class Test{
public static void main(String args[]){
Employee e;
e=new Employee();
e.setId(3);
e.setName("Samiksha");
e.setSalary(30000.00);
System.out.println("Employee Id:"+e.id+"\n"+e.name+"\n"+e.salary);



}
}//Test ends here