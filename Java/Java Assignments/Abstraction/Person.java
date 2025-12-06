package Abstraction;

abstract class Person {
	String name;
	int age;
	String gender;
	int mobileno;
	
	 String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	 int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	 String getGender() {
		return gender;
	}
	 void setGender(String gender) {
		this.gender = gender;
	}
	 int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	 
	Person(){
		name="Samiksha";
		age=22;
		gender="female";
		mobileno=954525089;
		
	}
	 Person(String name, int age, String gender, int mobileno) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobileno = mobileno;
		
	}
	 abstract void display();
     void ShowDetails(){
	 System.out.println("Showing general details of the person.");
 }
}
class Student1 extends Person{
	int rollno;
	int marks;
	String grade;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	Student1(){
		rollno=32;
		marks=90;
		grade="A";
	}
	public Student1(String name, int age, String gender, int mobileno,int rollno, int marks, String grade) {
		super(name,age,gender,mobileno);
		this.rollno = rollno;
		this.marks = marks;
		this.grade = grade;
	}
	void display() {//override
		System.out.println("Name is:"+this.name); 
		System.out.println("Age is:"+this.age); 
		System.out.println("Gender is:"+this.gender); 
		System.out.println("MobileNo is:"+this.mobileno); 
		System.out.println("Rollno is:"+this.rollno);
		System.out.println("Marks is:"+this.marks);
		System.out.println("Grade is:"+this.grade);
	}
	void ShowDetails(){
		 System.out.println("This is a student. Academic details are displayed above.");
	 }
	
}
class Teacher extends Person{
	int Id;
	String subject;
	double salary;
	int experiences;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getExperiences() {
		return experiences;
	}
	public void setExperiences(int experiences) {
		this.experiences = experiences;
	}
	Teacher(){
		Id=101;
		subject="Math";
		salary=80000;
		experiences=5;
	}
	public Teacher(String name, int age, String gender, int mobileno,int id, String subject, double salary, int experiences) {
		super(name,age,gender,mobileno);
		this.Id = id;
		this.subject = subject;
		this.salary = salary;
		this.experiences = experiences;
	}
	void display() {//override
		System.out.println("Name is:"+this.name); 
		System.out.println("Age is:"+this.age); 
		System.out.println("Gender is:"+this.gender); 
		System.out.println("MobileNo is:"+this.mobileno); 
		System.out.println("Id is:"+this.Id);
		System.out.println("Subject is:"+this.subject );
		System.out.println("Salary is:"+this.salary);
		System.out.println("Experiences is:"+this.experiences);
	}
	void ShowDetails(){
		 System.out.println("This is a teacher. Professional teaching details are displayed above.");
	 }
	
}
class Doctor extends Person{
	String Specialization;
	String hospitalname;
	int consultationfee;
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public String getHospitalname() {
		return hospitalname;
	}
	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}
	public int getConsultationfee() {
		return consultationfee;
	}
	public void setConsultationfee(int consultationfee) {
		this.consultationfee = consultationfee;
	}
	Doctor(){
		Specialization="Gynaecologiest";
		hospitalname="PMCH";
		consultationfee=1000;
	}
	Doctor(String name, int age, String gender, int mobileno,String specialization, String hospitalname, int consultationfee) {
		super(name,age,gender,mobileno);
		this.Specialization = specialization;
		this.hospitalname = hospitalname;
		this.consultationfee = consultationfee;
	}
	void display() {//override
		System.out.println("Name is:"+this.name); 
		System.out.println("Age is:"+this.age); 
		System.out.println("Gender is:"+this.gender); 
		System.out.println("MobileNo is:"+this.mobileno); 
		System.out.println("Specialization is:"+this.Specialization);
		System.out.println("Hospitalname is:"+this.hospitalname );
		System.out.println("Consultationfee is:"+this.consultationfee);
	}
	void ShowDetails(){
		 System.out.println("This is a doctor.Medical profession details are displayed above.");
	 }
}
class PersonOverride{
	public static void main(String[] args) {
		Person p;
		p =new Student1("Payal",22,"Female",97650954,18,95,"A");
		p.display();
		p.ShowDetails();
		System.out.println();
		p=new Teacher("Roshini",34,"Female",96651954,111,"Science",70000,5);
		p.display();
		p.ShowDetails();
		System.out.println();
		p=new Doctor("Vedant",30,"Male",94215369,"Neurosurgeon","AIIMS",5000);
		p.display();
		p.ShowDetails();
		
	} 
}
