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
}

class Test{
public static void main(String[] args){
Admin a;
a=new Admin();
a.setId(18);
a.setName("Vedu");
a.setSalary(500000);
a.setAllowances(2000);
System.out.println("Admin id:"+a.id);
System.out.println("Admin name:"+a.name);
System.out.println("Admin salary:"+a.salary);
System.out.println("Admin allowances:"+a.allowances);
}
}