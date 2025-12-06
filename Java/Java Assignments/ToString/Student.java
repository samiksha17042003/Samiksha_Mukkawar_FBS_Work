package ToString;

class Student {
 int fbId;
 String name;
 int distance;
 static int count;
 
 Student(){
	 System.out.println("Student default constructor");
	  fbId=100;
	  name="Shiv";
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
 
public String toString() {
	return "First Id is:"+this.fbId+"\nName is:"+this.name+"\nDistance travelled:"+this.distance;
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
	public String toString(){
		return super.toString()+"\nCompany Name is:"+this.companyname +"\nDesignation is:"+this.designation; 
	 }
	
}//class placestudent end here

class  Test4
{
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1);
		System.out.println();
		s1=new Student(11,"Samiksha",101);
		System.out.println(s1);
		System.out.println();
	    s1=new PlaceStudent(12,"Shashawat",3000,"TCS","Doctor");
	    System.out.println(s1);
	    System.out.println();
	    s1=new PlaceStudent();
	    System.out.println(s1);
	    System.out.println("Student total count:"+Student.getCount());
	 
	}
	
}
