package Inheritance;

class Student {
 int fbId;
 String name;
 int distance;
 static int count;
 
 Student(){
	 System.out.println("Student default constructor");
	fbId=100;
	 name="Shivani";
	  distance=0;
	  count++;
 }//default constructor
 
 Student(int fbId, String name, int distance) {
	System.out.println("Student parameterized constructor");
	this.fbId = fbId;
	this.name = name;
	this.distance = distance;
	count++;
}//parametrized

int getFbId() {
	return fbId;
}
void setFbId(int fbId) {
	this.fbId = fbId;
}
 String getName() {
	return name;
}
 void setName(String name) {
	this.name = name;
}
int getDistance() {
	return distance;
}
 void setDistance(int distance) {
	this.distance = distance;
}
 static int getCount() {
	return count;
}
 static void setCount(int count) {
	Student.count = count;
}
void display() {
System.out.println("First id is:"+this.fbId);
System.out.println("Name is:"+this.name);
System.out.println("Distance travelled:"+this.distance);
}


}//class student end here

class PlaceStudent extends Student{//step 1 "is a"
	//step2 remove state and behavior which is available in super class
	 String companyname;
	 String designation;
	 PlaceStudent() {
		 super();//step 3 a
		  companyname="xyz";
		  designation="pqr";
		  System.out.println("PlaceStudent default constructor");
}
	PlaceStudent(int fbId, String name, int distance, String companyname, String designation) {
		super(fbId,name,distance);//step 3 b call parametre intialization disk
		System.out.println("PlaceStudent paramatrized constructor");
		this.companyname = companyname;
		this.designation = designation;
	}
	String getCompanyname() {
		return companyname;
	}
	void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	 String getDesignation() {
		return designation;
	}
	void setDesignation(String designation) {
		this.designation = designation;
	}
	void display() {
		super.display();//step 4
		System.out.println("Company name is:"+this.companyname );	
		System.out.println("Designation is:"+this.designation);
	}
}//class placestudent end here

class  StudentInheritance
{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.display();
	    Student s2=new Student(11,"samu",101);
	    s2.display();
	    System.out.println("Student total count:"+Student.getCount());
	    PlaceStudent ps1=new PlaceStudent(12,"Shashawati",3000,"TCS","Teacher");
	    System.out.println("Student total count:"+Student.getCount());
	    ps1.display();
	    PlaceStudent ps2=new PlaceStudent();
	    ps2.display();
	    System.out.println("Student total count:"+Student.getCount());
	   
	}
	
}
