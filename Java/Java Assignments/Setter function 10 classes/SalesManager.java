class SalesManager{
int id;
String name;
double salary;
double incentive;
int target;
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
}
class Test{
public static void main(String args[]){
SalesManager s;
s=new SalesManager();
s.setID(11);
s.setName("samu");
s.setSalary(900000);
s.setIncentive(70.89);
s.setTarget(67);
System.out.println("ID is:"+s.id);
System.out.println("Name is:"+s.name);
System.out.println("Salary is:"+s.salary);
System.out.println("Incentive is:"+s.incentive);
System.out.println("Target is:"+s.target);
}
}



