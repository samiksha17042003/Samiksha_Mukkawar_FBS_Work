class Student{

int rollno;
String name;
int marks;

 Student(){
	 System.out.println("Student default constructor");
	 rollno=10;
	 name="Shivani";
	 marks=90;
	 }//default constructor

Student(int rollno, String name, int marks) {
	System.out.println("Student parameterized constructor");
        this.rollno=rollno;
	this.name=name;
	this.marks=marks;
	}//parametrized constructor

void setRollno(int r){
this.rollno=r;
}
void setName(String n){
this.name=n;
}
void setMarks(int m){
this.marks=m;
}
int getRollno(){
return this.rollno;
}
String getName(){
return this.name;
}
int getMarks(){
return this.marks;
}
void display(){
System.out.println("Rollno is:"+this.rollno);
System.out.println("Name is:"+this.name);
System.out.println("Marks is:"+this.marks);
}
}
class Test{
public static void main(String[] args){
Student s1=new Student();
s1.display();
System.out.println();
Student s2=new Student(15,"Shehal",80);
s2.display();
System.out.println();
s1.setRollno(32);
s1.setName("Samiksha");
s1.setMarks(90);
s2.setRollno(41);
s2.setName("Payal");
s2.setMarks(92);
s1.display();
System.out.println();
s2.display();
System.out.println();
if(s1.getMarks()>s2.getMarks()){
System.out.println("s1 Marks is Greater");
} 
else{
System.out.println("s2 Marks is Greater");
} 
}
}

