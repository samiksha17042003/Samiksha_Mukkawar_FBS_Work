class HR{
int Id;
String name;
double salary;
double commissions;
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
}
class Test{
public static void main(String args[]){
HR h;
h=new HR();
h.setId(12);
h.setName("Sakshi");
h.setSalary(100000);
h.setCommissions(12);
System.out.println("HR id:-"+h.Id);
System.out.println("HR name:-"+h.name);
System.out.println("HR salary:-"+h.salary);
System.out.println("HR commissions:-"+h.commissions);
}
}