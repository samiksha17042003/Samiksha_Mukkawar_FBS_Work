package ToString;

 class Vehicle {
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
	  no=03-1985;
	  model="tesla";
	  colour="black";
	  average=70;
	   
   }
 Vehicle( int no, String model, String colour, int average) {
	this.no = no;
	this.model = model;
	this.colour = colour;
	this.average = average;
	
}
 public String toString() {
		return "No is:"+this.no+"\nModel is:"+this.model+"\nColour is:"+this.colour+"\nAverage is:"+this.average;
	}
 
}
 class Car extends Vehicle{
	 int NoOfDoor;
	 String Airconditioner;
	 String Musicsystem;
	 int getNoOfDoor() {
		return NoOfDoor;
	}
	 void setNoOfDoor(int noOfDoor) {
		NoOfDoor = noOfDoor;
	}
	String getAirconditioner() {
		return Airconditioner;
	}
	 void setAirconditioner(String airconditioner) {
		this.Airconditioner = airconditioner;
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
		  Airconditioner="AC";
		  Musicsystem="Sony";
	  }
	 Car(int no, String model, String colour, int average,int noOfDoor, String airconditioner, String musicsystem) {
		super(no,model,colour,average);
		this.NoOfDoor = noOfDoor;
		this.Airconditioner = airconditioner;
		this.Musicsystem = musicsystem;
	}
	 public String toString(){
			return super.toString()+"\nNoOfDoor is:"+this.NoOfDoor+"\nairconditioner is:"+this.Airconditioner+"\nMusicsystem is:"+this.Musicsystem; 
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
	 
	 public String toString(){
			return super.toString()+"\nMileage is:"+this.mileage+"\nGear is"+ this.gear; 
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
	 public String toString(){
			return super.toString()+"\nCapacity is:"+this.capacity+"\nTicketprice is :"+this.ticketprice+"\nRoutenumber is :"+this.routenumber; 
		 }
 }
 class Test3{
	 public static void main(String[] args) {
		 Vehicle v=new  Vehicle();
		 v=new Car(1234,"Mauruti Suzuki","white",22,6,"AC","VXi");
		 System.out.println(v);
		 System.out.println();
		 v=new Bike();
		 System.out.println(v);
		 System.out.println();
		 v=new Bus(521,"Tata Star Bus","Green",6,50,50,335);
		 System.out.println(v);
		
	}
 }
