package Abstraction;

abstract class Vehicle {
	int no;
	String model;
	String colour;
	int average;
	
	 int getNo() {
		return no;
	}
	 void setNo(int no) {
		this.no = no;
	}
	 String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}
	 String getColour() {
		return colour;
	}
	void setColour(String colour) {
		this.colour = colour;
	}
	 int getAverage() {
		return average;
	}
	void setAverage(int average) {
		this.average = average;
	}
	
  Vehicle()	{
	  no=1985;
	  model="Tesla";
	  colour="Black";
	  average=70;
	 
  }
Vehicle( int no, String model, String colour, int average) {
	this.no = no;
	this.model = model;
	this.colour = colour;
	this.average = average;
	
}
abstract void display();

 void brake() {
	 System.out.println("Brake Applied");
 }
}
class Car extends Vehicle{
	 int NoOfDoor;
	 String airconditioner;
	 String Musicsystem;
	 int getNoOfDoor() {
		return NoOfDoor;
	}
	 void setNoOfDoor(int noOfDoor) {
		NoOfDoor = noOfDoor;
	}
	String getAirconditioner() {
		return airconditioner;
	}
	 void setAirconditioner(String airconditioner) {
		this.airconditioner = airconditioner;
	}
	String getMusicsystem() {
		return Musicsystem;
	}
	 void setMusicsystem(String musicsystem) {
		Musicsystem = musicsystem;
	} 
	  Car(){
		  super();
		  NoOfDoor=6;
		  airconditioner="AC";
		  Musicsystem="Sony";
	  }
	 Car(int no, String model, String colour, int average,int noOfDoor, String airconditioner, String musicsystem) {
		super(no,model,colour,average);
		this.NoOfDoor = noOfDoor;
		this.airconditioner = airconditioner;
		this.Musicsystem = musicsystem;
	}
	 void display() {//override
		 System.out.println("No is:"+this.no);
		 System.out.println("Model is:"+this.model);
		 System.out.println("Colour is:"+this.colour);
		 System.out.println("Average is:"+this.average);
		 System.out.println("NoOfDoor is:"+this.NoOfDoor); 
		 System.out.println("Airconditioner is:"+this.airconditioner); 
		 System.out.println("Musicsystem is:"+this.Musicsystem); 
	 }
	 void brake() {
		 System.out.println("Drumb Brake Applied");
	 }
}
class Bike extends Vehicle{
	 int mileage;
	 int gear;
	 int getMileage() {
		return mileage;
	}
	void setMileage(int mileage) {
		this.mileage = mileage;
	}
	 int getGear() {
		return gear;
	}
	 void setGear(int gear) {
		this.gear = gear;
	}
	 Bike(){
		 super();
		 mileage=100;
		 gear=4;
	 }
   Bike(int no, String model, String colour, int average,int mileage, int gear) {
		super(no,model,colour,average);
		this.mileage = mileage;
		this.gear = gear;
	}
	 void display() {//override
		 System.out.println("No is:"+this.no);
		 System.out.println("Model is:"+this.model);
		 System.out.println("Colour is:"+this.colour);
		 System.out.println("Average is:"+this.average);
		 System.out.println("Mileage is:"+this.mileage);
		 System.out.println("Gear is"+ this.gear);
	 }
	 void brake() {
		 System.out.println("Air Brake Applied");
	 }
}
class Bus extends Vehicle{
	 int capacity;
	 int ticketprice;
	 int routenumber;
	int getCapacity() {
		return capacity;
	}
	 void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	int getTicketprice() {
		return ticketprice;
	}
	 void setTicketprice(int ticketprice) {
		this.ticketprice = ticketprice;
	}
	int getRoutenumber() {
		return routenumber;
	}
	 void setRoutenumber(int routenumber) {
		this.routenumber = routenumber;
	}
	 Bus(){
		 super();
		 capacity=10000;
		 ticketprice=100;
		 routenumber=12;
		 }
	 Bus(int no, String model, String colour, int average,int capacity, int ticketprice, int routenumber) {
		super(no,model,colour,average);
		this.capacity = capacity;
		this.ticketprice = ticketprice;
		this.routenumber = routenumber;
	}
	 void display()//override
	 {
		 System.out.println("No is:"+this.no);
		 System.out.println("Model is:"+this.model);
		 System.out.println("Colour is:"+this.colour);
		 System.out.println("Average is:"+this.average);
		 System.out.println("Capacity is:"+this.capacity);
		 System.out.println("Ticketprice is :"+this.ticketprice);
		 System.out.println("Routenumber is :"+this.routenumber);
	 }
	 void brake() {
		 System.out.println("Disc Brake Applied");
	 }
}
class Polymorphism1{
	 public static void main(String[] args) {
		 Vehicle v;
		 v=new Car(1234,"Mauruti Suzuki","white",22,6,"AC","VXi");
		 v.display();
		 v.brake();
		 System.out.println();
		 v=new Bike(1212,"Hero Splender","Black",70,80,4);
		 v.display();
		 v.brake();
		 System.out.println();
		 v=new Bus(4521,"Tata Star Bus","Green",6,50,50,335);
		 v.display();
		 v.brake();
		 
	}
}

