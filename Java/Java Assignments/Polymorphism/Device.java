package Polymorphism;

class Device{
	String Brand;
	String Model;
	int price;
	int batterylevel;
	static int count;
	 String getBrand() {
		return Brand;
	}
	void setBrand(String brand) {
		Brand = brand;
	}
	 String getModel() {
		return Model;
	}
	void setModel(String model) {
		Model = model;
	}
	 int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	 int getBatterylevel() {
		return batterylevel;
	}
	 void setBatterylevel(int batterylevel) {
		this.batterylevel = batterylevel;
	}
	 static int getCount() {
		return count;
	}
	static void setCount(int count) {
		Device.count = count;
	}
	Device(){
		Brand="Apple";
		Model="iPhone17";
		price=500000;
		batterylevel=100;
		count++;
	}
	Device(String brand, String model, int price, int batterylevel) {
		super();
		this.Brand = brand;
		this.Model = model;
		this.price = price;
		this.batterylevel = batterylevel;
		count++;
	}
	void display()
	{
		System.out.println("Brand is:"+this.Brand);
		System.out.println("Model is:"+this.Model);
		System.out.println("Price is:"+this.price);
		System.out.println("Batterylevel is:"+this.batterylevel);
	}

	

}
class Mobile extends Device{
	int simslots;
	int cameraMP;
	int storage;
	String is5G;
	 int getSimslots() {
		return simslots;
	}
	 void setSimslots(int simslots) {
		this.simslots = simslots;
	}
	int getCameraMP() {
		return cameraMP;
	}
	 void setCameraMP(int cameraMP) {
		this.cameraMP = cameraMP;
	}
	int getStorage() {
		return storage;
	}
	void setStorage(int storage) {
		this.storage = storage;
	}
	 String getIs5G() {
		return is5G;
	}
	void setIs5G(String is5g) {
		is5G = is5g;
	}
	Mobile(){
		super();
		simslots =2;
		cameraMP=50;
		storage=256;
		is5G="yes";
	}
	 Mobile(String brand, String model, int price, int batterylevel,int simslots, int cameraMP, int storage, String is5g) {
		super(brand,model,price,batterylevel);
		this.simslots = simslots;
		this.cameraMP = cameraMP;
		this.storage = storage;
		this.is5G = is5g;
	}
	 void display() {
		 super.display();
		 System.out.println("Simslots is:"+this.simslots);
		 System.out.println("CameraMP is:"+this.cameraMP);
		 System.out.println("Storage is:"+this.storage);
		 System.out.println("Is5G:"+this.is5G);
		 
	 }
	
}
class Laptop extends Device{
	int ramsize;
	String processor;
	String OperatingSystem;
	 int getRamsize() {
		return ramsize;
	}
	void setRamsize(int ramsize) {
		this.ramsize = ramsize;
	}
	String getProcessor() {
		return processor;
	}
	void setProcessor(String processor) {
		this.processor = processor;
	}
	 String getOperatingSystem() {
		return OperatingSystem;
	}
	 void setOperatingSystem(String operatingSystem) {
		OperatingSystem = operatingSystem;
	}
	Laptop(){
		ramsize=64;
		processor="Ryzen";
		OperatingSystem="windows";
	}
	 Laptop(String brand, String model, int price, int batterylevel,int ramsize, String processor, String operatingSystem) {
		super(brand,model,price,batterylevel);
		this.ramsize = ramsize;
		this.processor = processor;
		OperatingSystem = operatingSystem;
	}
	 void display() {
		 super.display();
		 System.out.println("Ramsize is:"+this.ramsize);
		 System.out.println("Processor is:"+this.processor);
		 System.out.println("OperatingSystem is:"+this.OperatingSystem);
	 }
	
}
class SmartWatch extends Device{
	int HeartRate;
	int stepcount;
	 int getHeartRate() {
		return HeartRate;
	}
	 void setHeartRate(int heartRate) {
		HeartRate = heartRate;
	}
	 int getStepcount() {
		return stepcount;
	}
	 void setStepcount(int stepcount) {
		this.stepcount = stepcount;
	}
	SmartWatch(){
		HeartRate=90;
		stepcount=10000;
	}
	 SmartWatch(String brand, String model, int price, int batterylevel,int heartRate, int stepcount) {
		super(brand,model,price,batterylevel);
		HeartRate = heartRate;
		this.stepcount = stepcount;
	}
	void display() {
		super.display();
		System.out.println("HeartRate is:"+this.HeartRate);
		System.out.println("Stepcount is:"+this.stepcount);
	}
}
class DeviceOverride{
	 public static void main(String[] args) {
		 Device d=new  Device();
		 d=new Mobile("Samsunga","Galaxy A26 5G",24999,5000,2,50,128,"Yes");
		 d.display();
		 System.out.println();
		 d=new Laptop();
		 d.display();
		 System.out.println();
		 d=new SmartWatch("Samsunga","Galaxy Watch7",32999,5000,1000,10000);
		 d.display();
		 System.out.println("Device total count is:"+Device.getCount());
	}
}


