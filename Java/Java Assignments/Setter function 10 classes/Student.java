class Student{

int rollno;
String name;
int marks;

void setRollno(int r){
this.rollno=r;
}
void setName(String n){
this.name=n;
}
void setMarks(int m){
this.marks=m;
}
}
class Test{
public static void main(String[] args){
Student s=new Student();
s.setRollno(32);
s.setName("Samiksha");
s.setMarks(90);
System.out.println("Rollno is:"+s.rollno);
System.out.println("Name is:"+s.name);
System.out.println("Marks is:"+s.marks);
}
}
