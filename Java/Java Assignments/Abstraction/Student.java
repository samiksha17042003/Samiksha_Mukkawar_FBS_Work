package Abstraction;

abstract class Student {
 int fbId;
 String name;
 int distance;
 
 
 Student(){
	 System.out.println("Student default constructor");
	  fbId=100;
	  name="samasha";
	  distance=0;
	  
 }//default constructor
 
 Student(int fbId, String name, int distance) {
	System.out.println("Student parameterized constructor");
	this.fbId = fbId;
	this.name = name;
	this.distance = distance;
	
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
 
 abstract void display();

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
	void display() {//override
		System.out.println("First id is:"+this.fbId);
		System.out.println("Name is:"+this.name);
		System.out.println("Distance travelled:"+this.distance);//step 4
		System.out.println("Company Name is:"+this.companyname );	
		System.out.println("Designation is:"+this.designation);
	}
}//class placestudent end here

class  StudentOverride
{
	public static void main(String[] args) {
		Student s1;
//		s1.display();
//		System.out.println();
//		s1=new Student(11,"Samu",101);
//		s1.display();
//		System.out.println();
	    s1=new PlaceStudent(12,"Shashawat",3000,"TCS","Teacher");
	    s1.display();
	    System.out.println();
	    s1=new PlaceStudent();
	    
	 
	}
	
}
